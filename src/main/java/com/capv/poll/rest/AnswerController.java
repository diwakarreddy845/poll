package com.capv.poll.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.capv.poll.entity.Answer;
import com.capv.poll.services.AnswerService;
import com.capv.poll.util.ServiceStatus;

@RestController
public class AnswerController {
	
	@Autowired
	private AnswerService answerService;
	
	@PostMapping("/saveAnswer")
	public ServiceStatus<Long> saveAnswer(@RequestBody Answer answer) {
		ServiceStatus<Long> status = new ServiceStatus<Long>();
		 answer = answerService.save(answer);
		 status.setStatus("success");
		 status.setStatusCode(200);
		 status.setResult(answer.getId());
		 return status;
	}
	
	@PostMapping("/getAnswerById")
	public ServiceStatus<Answer> getAnswerById(@RequestBody Long answerId) {
		ServiceStatus<Answer> status = new ServiceStatus<Answer>();
		Answer answer = answerService.getAnswerById(answerId);
		 status.setStatus("success");
		 status.setStatusCode(200);
		 status.setResult(answer);
		 return status;
	}

	@DeleteMapping("deleteAnswer")
	public void delete(@RequestBody long id){
		answerService.deleteById(id);
    }
	
	
}
