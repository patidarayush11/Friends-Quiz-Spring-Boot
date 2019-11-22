package com.bffquest.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.bffquest.entities.Friend;

@Repository
public interface FriendRepository extends CrudRepository<Friend, Integer>{

}
