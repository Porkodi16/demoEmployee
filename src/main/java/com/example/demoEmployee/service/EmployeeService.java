package com.example.demoEmployee.service;

import java.util.List;

import com.example.demoEmployee.entity.Employee;

public interface EmployeeService {


	 void employeeList();


	void deleteEmployee();

	Employee addEmployee(Employee employee);

	List<Employee> getEmployeeList();

	Employee getEmployeeById(long id);

	Employee saveEmployee(Employee employee);


	Employee updateEmployee(long id, Employee employee);


	String deleteEmployee(long id);



}
