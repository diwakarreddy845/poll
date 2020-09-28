package com.capv.poll.services;

import org.springframework.beans.factory.annotation.Autowired;

import com.capv.poll.entity.Answer;
import com.capv.poll.repository.AnswerRepository;

public class AnswerServiceImpl implements AnswerService {

    @Autowired
    public AnswerRepository answerRepository;
    
    @Override
	public Answer getAnswerById(long id) {
		return answerRepository.findById(id).get();
	}

	@Override
	public Answer save(Answer answer) {
		return answerRepository.save(answer);
	}

	@Override
	public void deleteById(long id) {
		answerRepository.deleteById(id);
	}
}
