package com.programmer.gate.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.programmer.gate.model.St001;

@Repository
public interface St001Repository extends CrudRepository<St001, Double> {

}
