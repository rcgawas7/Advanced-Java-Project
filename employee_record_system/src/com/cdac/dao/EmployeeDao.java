package com.cdac.dao;

import java.util.List;

import com.cdac.dto.Employee;

public interface EmployeeDao {

	void insertEmployee(Employee employee);
	void deleteEmployee(int employeeId);
	Employee selectEmployee(int employeeId);
	void updateEmployee(Employee employee);
	List<Employee> selectAll(int userId);
	
	
}
