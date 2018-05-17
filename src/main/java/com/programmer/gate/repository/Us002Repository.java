package com.programmer.gate.repository;

import java.math.BigDecimal;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.programmer.gate.model.Us002;

@Repository
public interface Us002Repository extends CrudRepository<Us002, BigDecimal> {

}
