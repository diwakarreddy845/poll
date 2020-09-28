package com.capv.poll.services;

import org.springframework.stereotype.Service;

import com.capv.poll.entity.Answer;

@Service
public interface AnswerService {

	Answer getAnswerById(long id);

	Answer save(Answer answer);

	void deleteById(long id);

}
