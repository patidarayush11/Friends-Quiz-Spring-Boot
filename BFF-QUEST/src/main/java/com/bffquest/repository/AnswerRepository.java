package com.bffquest.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.bffquest.entities.Answer;
import com.bffquest.entities.Person;

@Repository
public interface AnswerRepository extends CrudRepository<Answer, Integer> {
	@Query(value="SELECT * FROM answer WHERE person_id = :personId", nativeQuery=true)
	List<Answer> findByPersonAnsbyId(int personId);

	
	
	
	
}
