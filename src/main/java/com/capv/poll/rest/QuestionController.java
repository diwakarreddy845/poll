package com.capv.poll.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.capv.poll.entity.Question;
import com.capv.poll.services.QuestionService;
import com.capv.poll.util.ServiceStatus;

@RestController
public class QuestionController {
	
	@Autowired
	private QuestionService questionService;
	
	@PostMapping("/saveQuestion")
	public ServiceStatus<Long> saveQuestionaire(@RequestBody Question question) {
		ServiceStatus<Long> status = new ServiceStatus<Long>();
		 question = questionService.save(question);
		 status.setStatus("success");
		 status.setStatusCode(200);
		 status.setResult(question.getId());
		 return status;
	}
	
	@PostMapping("/getQuestionById")
	public ServiceStatus<Question> getQuestionById(@RequestBody Long questionId) {
		ServiceStatus<Question> status = new ServiceStatus<Question>();
		Question question = questionService.getQuestionById(questionId);
		 status.setStatus("success");
		 status.setStatusCode(200);
		 status.setResult(question);
		 return status;
	}

	@DeleteMapping("deleteQuestion")
	public void delete(@RequestBody long id){
		questionService.deleteById(id);
    }
	
	
}
