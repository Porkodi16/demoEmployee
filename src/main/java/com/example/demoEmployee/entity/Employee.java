package com.example.demoEmployee.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity(name="employeeTbl")

	public class Employee {
		
		@Id
		
	@GeneratedValue(strategy=GenerationType.AUTO)	
		private long id;
		private String emdid;
		private String firstname;
		private String lastname;
		private String email;
		private String contactNo;
		private String designation;
		public long getId() {
			return id;
		}
		public void setId(long id) {
			this.id = id;
		}
		public String getEmdid() {
			return emdid;
		}
		public void setEmdid(String emdid) {
			this.emdid = emdid;
		}
		public String getFirstname() {
			return firstname;
		}
		public void setFirstname(String firstname) {
			this.firstname = firstname;
		}
		public String getLastname() {
			return lastname;
		}
		public void setLastname(String lastname) {
			this.lastname = lastname;
		}
		public String getEmail() {
			return email;
		}
		public void setEmail(String email) {
			this.email = email;
		}
		public String getContactNo() {
			return contactNo;
		}
		public void setContactNo(String contactNo) {
			this.contactNo = contactNo;
		}
		public String getDesignation() {
			return designation;
		}
		public void setDesignation(String designation) {
			this.designation = designation;
		}
		public Employee(long id, String emdid, String firstname, String lastname, String email, String contactNo,
				String designation) {
			super();
			this.id = id;
			this.emdid = emdid;
			this.firstname = firstname;
			this.lastname = lastname;
			this.email = email;
			this.contactNo = contactNo;
			this.designation = designation;
		}
		public Employee() {
			super();
			// TODO Auto-generated constructor stub
		}
		@Override
		public String toString() {
			return "Employee [id=" + id + ", emdid=" + emdid + ", firstname=" + firstname + ", lastname=" + lastname
					+ ", email=" + email + ", contactNo=" + contactNo + ", designation=" + designation + "]";
		}
		
		
}	
		
		
