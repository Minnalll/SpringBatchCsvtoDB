package com.spring.batch.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.spring.batch.entity.Employee;

public interface EmployeeRepository  extends JpaRepository<Employee,Integer> {
}
