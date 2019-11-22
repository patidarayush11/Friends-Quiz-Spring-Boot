package com.bffquest.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.bffquest.entities.Question;

@Repository
public interface QuestionRepository extends CrudRepository<Question, Integer> {

	 @Query(value = "SELECT * FROM question", nativeQuery = true)
	  List<Question> findAll();
	 
	
	 
	 /*
	 * @Query(value = "SELECT * FROM author WHERE first_name = :firstName",
	 * nativeQuery = true) List<Author> findAuthorsByFirstName(@Param("firstName")
	 * String firstName);
	 */
	
}
