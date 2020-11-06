package com.cdac.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;



@Entity
@Table(name = "employee")
public class Employee {
		@Id
		@Column(name = "employee_id")
		@GeneratedValue
		private int employeeId;
		@Column(name = "fname")
		private String fname;
		@Column(name = "lname")
		private String lname;
		private int age;
		@Column(name = "address")
		private String address;
		private int contact;
		@Column(name = "joined_date")
		private String joinedDate;
		private int userId;
		public Employee() {
			super();
			// TODO Auto-generated constructor stub
		}
		
		
		
		public Employee(int employeeId) {
			super();
			this.employeeId = employeeId;
		}



		public int getEmployeeId() {
			return employeeId;
		}
		public void setEmployeeId(int employeeId) {
			this.employeeId = employeeId;
		}
		public String getFname() {
			return fname;
		}
		public void setFname(String fname) {
			this.fname = fname;
		}
		public String getLname() {
			return lname;
		}
		public void setLname(String lname) {
			this.lname = lname;
		}
		public int getAge() {
			return age;
		}
		public void setAge(int age) {
			this.age = age;
		}
		public String getAddress() {
			return address;
		}
		public void setAddress(String address) {
			this.address = address;
		}
		public int getContact() {
			return contact;
		}
		public void setContact(int contact) {
			this.contact = contact;
		}
		public int getUserId() {
			return userId;
		}
		public void setUserId(int userId) {
			this.userId = userId;
		}



		public String getJoinedDate() {
			return joinedDate;
		}



		public void setJoinedDate(String joinedDate) {
			this.joinedDate = joinedDate;
		}
		
}
