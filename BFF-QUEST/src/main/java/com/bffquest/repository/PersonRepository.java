package com.bffquest.repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.bffquest.entities.Person;

@Repository
public interface PersonRepository extends CrudRepository<Person, Integer> {
	
	 @Query(value = "SELECT * FROM person WHERE uname = :username",nativeQuery = true) 
	 Person findPersonByUsername(@Param("username") String username);

	 @Query(value = "SELECT * FROM person WHERE id = :id",nativeQuery = true)
	 Person findByPersonId(@Param("id")int id);
}
