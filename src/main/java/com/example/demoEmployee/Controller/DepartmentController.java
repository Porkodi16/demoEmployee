package com.example.demoEmployee.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
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

import com.example.demoEmployee.entity.Department;
import com.example.demoEmployee.service.DepartmentService;

@RestController
@RequestMapping("/api/department")

public class DepartmentController {
	
	
	@Autowired
	
	DepartmentService departmentService;
	
	
	

	
	public DepartmentController(DepartmentService departmentService) {
		super();
		this.departmentService = departmentService;
	}





	@PostMapping
	
	public ResponseEntity<Department> saveDepartment(@RequestBody Department department) {
		
		return new ResponseEntity<Department> (departmentService.saveDepartment(department) , HttpStatus.CREATED);
	}
	
	@GetMapping
	
	public List<Department> getDepartmentList() {
		return departmentService.getDepartmentList();
	}
	
	
	@GetMapping("/{deptid}") 
	
	public Department getDepartmentById(@PathVariable("deptid") long deptid) {
		return departmentService.getDepartmentById(deptid);
	}
	
	
	
 @PutMapping ("/{deptid}") 

public Department updateDepartment(@PathVariable("deptid") long deptid, @RequestBody Department department) {
	return departmentService.updateDepartment(deptid,department);
}
 
  @DeleteMapping("/{deptid}") 
  
  public ResponseEntity<String> deleteDepartment(@PathVariable ("deptid") long deptid) {
	  return new ResponseEntity<String>(departmentService.deleteDepartment(deptid) , HttpStatus.OK);
  }
}
