package com.example.demoEmployee.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.support.Repositories;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demoEmployee.entity.Employee;
import com.example.demoEmployee.service.EmployeeService;


@RestController
@RequestMapping("/api/employee")
public class EmployeeController {
	
	@Autowired
	EmployeeService employeeService;
	
	
	// RequestBody
	
	public EmployeeController(EmployeeService employeeService) {
		super();
		this.employeeService = employeeService;
	}

	// Employee employee = new Employee("", "")
	//@PostMapping
	//public Employee addEmployee(@RequestBody Employee employee) {
		
	//	return employeeService.addEmployee(employee);
		
	//}
	
	@PostMapping
	public ResponseEntity<Employee> saveEmployee(@RequestBody Employee employee) {
		return new ResponseEntity<Employee>(employeeService.saveEmployee(employee) , HttpStatus.CREATED);
	}
	
	@GetMapping
	public List<Employee> getEmployeeList(){
	return	employeeService.getEmployeeList();
	
		
	}
	//api/employee/id
	@GetMapping ("/{id}") 
	
	public Employee getEmployeeById(@PathVariable("id") long id) {
		return employeeService.getEmployeeById(id);
		
	}
	
	
	@PutMapping ("/{id}")
	public Employee updateEmployee(@PathVariable("id") long id, @RequestBody Employee employee) {
		 return employeeService.updateEmployee(id,employee);
		
	}
	
	@DeleteMapping("/{id}")
	public ResponseEntity<String> deleteEmployee(@PathVariable ("id") long id) {
		return new ResponseEntity<String>(employeeService.deleteEmployee(id) , HttpStatus.OK);
		
	}

}
