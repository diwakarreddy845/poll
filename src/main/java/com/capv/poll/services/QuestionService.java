package com.capv.poll.services;

import org.springframework.stereotype.Service;

import com.capv.poll.entity.Question;

@Service
public interface QuestionService {

	Question getQuestionById(long id);

	Question save(Question question);

	void deleteById(long id);

}
