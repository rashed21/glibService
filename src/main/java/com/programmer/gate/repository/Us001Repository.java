package com.programmer.gate.repository;

import java.math.BigDecimal;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.programmer.gate.model.Us001;

@Repository
public interface Us001Repository extends CrudRepository<Us001, BigDecimal> {

}
