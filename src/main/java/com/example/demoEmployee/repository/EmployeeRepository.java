package com.example.demoEmployee.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demoEmployee.entity.Employee;


public interface EmployeeRepository extends JpaRepository<Employee, Long>{
	
	
}
