package com.mahesh.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.mahesh.model.Employee;

@Repository
public interface EmployeeRepository extends CrudRepository<Employee, Long>{

}
