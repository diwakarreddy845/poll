package com.capv.poll.repository;

import org.springframework.data.repository.CrudRepository;

import com.capv.poll.entity.Question;

public interface QuestionRepository extends CrudRepository<Question, Long> {

}
