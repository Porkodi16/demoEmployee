package com.example.demoEmployee.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demoEmployee.entity.Department;

public interface DepartmentRepository extends JpaRepository<Department , Long> {


}
