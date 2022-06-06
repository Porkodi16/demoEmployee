package com.example.demoEmployee.service;

import java.util.List;

import com.example.demoEmployee.entity.Department;

public interface DepartmentService {

	Department saveDepartment(Department department);

	List<Department> getDepartmentList();

	Department getDepartmentById(long deptid);

	Department updateDepartment(long deptid, Department department);

	String deleteDepartment(long deptid);
	
	


}
