package com.bffquest.repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.bffquest.entities.Answer;
import com.bffquest.entities.Person;

@Repository
public interface AnswerRepository extends CrudRepository<Answer, Integer> {

	
	
	
	
}
