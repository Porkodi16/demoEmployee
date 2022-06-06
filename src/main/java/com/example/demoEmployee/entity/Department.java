package com.example.demoEmployee.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity(name="departmentTbl")


public class Department {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)	

	private long deptid;
	@Column(nullable=false , unique=true)
	private String departmentid;
	@Column(nullable=false)
	private String departmentname;
	private String location;
	public long getDeptid() {
		return deptid;
	}
	public void setDeptid(long deptid) {
		this.deptid = deptid;
	}
	public String getDepartmentid() {
		return departmentid;
	}
	public void setDepartmentid(String departmentid) {
		this.departmentid = departmentid;
	}
	public String getDepartmentname() {
		return departmentname;
	}
	public void setDepartmentname(String departmentname) {
		this.departmentname = departmentname;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public Department(long deptid, String departmentid, String departmentname, String location) {
		super();
		this.deptid = deptid;
		this.departmentid = departmentid;
		this.departmentname = departmentname;
		this.location = location;
	}
	public Department() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Department [deptid=" + deptid + ", departmentid=" + departmentid + ", departmentname=" + departmentname
				+ ", location=" + location + "]";
	}
	
	
	
	
	
	

}
