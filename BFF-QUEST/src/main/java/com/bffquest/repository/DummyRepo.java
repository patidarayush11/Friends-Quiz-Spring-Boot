package com.bffquest.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.bffquest.entities.Dummy;

@Repository
public interface DummyRepo extends CrudRepository<Dummy, Integer> {
}
