package com.capv.poll.services;

import org.springframework.beans.factory.annotation.Autowired;

import com.capv.poll.entity.Question;
import com.capv.poll.repository.QuestionRepository;

public class QuestionServiceImpl implements QuestionService {

	@Autowired
	public QuestionRepository questionRepository;

	@Override
	public Question getQuestionById(long id) {
		return questionRepository.findById(id).get();
	}

	@Override
	public Question save(Question question) {
		return questionRepository.save(question);
	}

	@Override
	public void deleteById(long id) {
		questionRepository.deleteById(id);
	}
}
