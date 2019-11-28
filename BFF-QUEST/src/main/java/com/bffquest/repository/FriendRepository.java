package com.bffquest.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.bffquest.entities.Friend;

@Repository
public interface FriendRepository extends CrudRepository<Friend, Integer>{

	@Query(value="SELECT * FROM friend WHERE person_id= :personId", nativeQuery = true)
	List<Friend> getFriendScoresByPersonId(int personId);

}
