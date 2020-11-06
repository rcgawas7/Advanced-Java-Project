package com.cdac.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cdac.dao.EmployeeDao;
import com.cdac.dto.Employee;

@Service
public class EmployeeServiceImple implements EmployeeService {

	@Autowired
	private EmployeeDao expenseDao;
	
	@Override
	public void addEmployee(Employee employee) {
		expenseDao.insertEmployee(employee);
		
	}

	@Override
	public void removeEmployee(int employeeId) {
		expenseDao.deleteEmployee(employeeId);
		
	}

	@Override
	public Employee findEmployee(int employeeId) {
		
		return expenseDao.selectEmployee(employeeId);
	}

	@Override
	public void modifyEmployee(Employee employee) {
		expenseDao.updateEmployee(employee);
		
	}

	@Override
	public List<Employee> selectAll(int userId) {
		
		return expenseDao.selectAll(userId);
	}

}
