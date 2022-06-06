package com.example.demoEmployee.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.example.demoEmployee.Exception.ResourceNotFoundException;
import com.example.demoEmployee.entity.Employee;
import com.example.demoEmployee.repository.EmployeeRepository;


@Service
public class EmployeeServiceImpl implements EmployeeService{
	
	EmployeeRepository employeeRepository;
	


	public EmployeeServiceImpl(EmployeeRepository employeeRepository) {
		super();
		this.employeeRepository = employeeRepository;
	}





 

	@Override
	public void deleteEmployee() {
		// TODO Auto-generated method stub
		
	}


	@Override
	public Employee addEmployee(Employee employee) {
		
		return employeeRepository.save(employee);
		
		
	}




	@Override
	public List<Employee> getEmployeeList() {
		// TODO Auto-generated method stub
		return employeeRepository.findAll();
	}




	@Override
	public void employeeList() {
		// TODO Auto-generated method stub
		
	}





	@Override
	public Employee getEmployeeById(long id) { //11
		// TODO Auto-generated method stub
		
		
		
		Employee employee=new Employee();
		employee=employeeRepository.findById(id).orElseThrow(
				()-> new ResourceNotFoundException("Employee" ,"id" ,id));
		
		
		return employee;
	}





	@Override
	public Employee saveEmployee(Employee employee) {
		// TODO Auto-generated method stub
		return null;
	}












	@Override
	public Employee updateEmployee(long id, Employee employee) {
		// TODO Auto-generated method stub
		
		Employee emp=new Employee();
		emp=employeeRepository.findById(id).orElseThrow (
			()-> new ResourceNotFoundException("Employee" , "id",id));
		
		//employee.replaceemployee=emp.replace("ramya@gmail.com", "xyz@gmail.com");
		
		emp.setFirstname(employee.getFirstname());
		emp.setLastname(employee.getLastname());
		emp.setEmail(employee.getEmail());
		emp.setContactNo(employee.getContactNo());
		emp.setDesignation(employee.getDesignation());
		employeeRepository.save(emp);
			
		
		return emp;
	}







	@Override
	public String deleteEmployee(long id) {
		// TODO Auto-generated method stub
		
		
		Employee employee=new Employee();
		employee=employeeRepository.findById(id).orElseThrow (
			()-> new ResourceNotFoundException("Employee" , "id",id));
		
		employeeRepository.deleteById(id);
		return "Record is deleted Successfully";

		
		
	}










}