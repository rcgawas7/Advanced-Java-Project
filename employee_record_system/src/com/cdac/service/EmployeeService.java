package com.cdac.service;

import java.util.List;

import com.cdac.dto.Employee;

public interface EmployeeService {

	void addEmployee(Employee employee);
	void removeEmployee(int employeeId);
	Employee findEmployee(int employeeId);
	void modifyEmployee(Employee employee);
	List<Employee> selectAll(int userId);
}
