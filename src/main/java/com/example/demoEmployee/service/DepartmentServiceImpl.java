package com.example.demoEmployee.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demoEmployee.Exception.ResourceNotFoundException;
import com.example.demoEmployee.entity.Department;
import com.example.demoEmployee.repository.DepartmentRepository;


@Service
public class DepartmentServiceImpl implements DepartmentService {
	
	@Autowired
	DepartmentRepository departmentRepository;

	public DepartmentServiceImpl(DepartmentRepository departmentRepository) {
		super();
		this.departmentRepository = departmentRepository;
	}

	@Override
	public Department saveDepartment(Department department) {
		// TODO Auto-generated method stub
		return departmentRepository.save(department);
	}

	@Override
	public List<Department> getDepartmentList() {
		// TODO Auto-generated method stub
		return departmentRepository.findAll();
	}

	@Override
	public Department getDepartmentById(long deptid) {
		
		Optional <Department> department = departmentRepository.findById(deptid);
		
		if(department.isPresent())
			return department.get();
		else
			throw new ResourceNotFoundException("Department" , "deptid" , deptid);
	}

	@Override
	public Department updateDepartment(long deptid, Department department) {
		// TODO Auto-generated method stub
		
		
		Department dpt=new Department();
		dpt=departmentRepository.findById(deptid).orElseThrow( 
				() -> new ResourceNotFoundException("Department" , "deptid" ,deptid));
		
		dpt.setDepartmentid(department.getDepartmentid());
		dpt.setDepartmentname(department.getDepartmentname());
		dpt.setDeptid(department.getDeptid());
		dpt.setLocation(department.getLocation());
		departmentRepository.save(dpt);

		return dpt;
	}

	@Override
	public String deleteDepartment(long deptid) {
		// TODO Auto-generated method stub
		
		
		Department department=new Department();
		department=departmentRepository.findById(deptid).orElseThrow( 
				() -> new ResourceNotFoundException("Department" , "deptid" ,deptid));
		
departmentRepository.deleteById(deptid);		
		return "Record is Deleted Sucessfully";
	}
	
	
	

}
