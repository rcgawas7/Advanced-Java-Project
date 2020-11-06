package com.cdac.cntr;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.cdac.dto.Employee;
import com.cdac.dto.User;
import com.cdac.service.EmployeeService;

@Controller
public class EmployeeController {

	@Autowired
	private EmployeeService employeeService;
	
	@RequestMapping(value = "/prep_employee_add_form.htm", method = RequestMethod.GET)
	public String prepEmployeeAddForm(ModelMap map) {
		map.put("employee", new Employee());
		return "employee_add_form";
	}
	
	@RequestMapping(value = "/employee_add.htm", method = RequestMethod.POST)
	public String employeeAdd(Employee employee,HttpSession session) {
		int userId = ((User)session.getAttribute("user")).getUserId();
		employee.setUserId(userId);
		employeeService.addEmployee(employee);
		return "home";
	}
	
	@RequestMapping(value = "/employee_list.htm",method = RequestMethod.GET)
	public String allEmployees(ModelMap map,HttpSession session) {
		int userId = ((User)session.getAttribute("user")).getUserId();
		List<Employee> li = employeeService.selectAll(userId);
		map.put("empList",li);
		return "employee_list";
		
	}
	
	@RequestMapping(value = "/employee_delete.htm",method = RequestMethod.GET)
	public String employeeDelete(@RequestParam int employeeId,ModelMap map,HttpSession session) {
		
		employeeService.removeEmployee(employeeId);
		
		int userId = ((User)session.getAttribute("user")).getUserId();
		List<Employee> li = employeeService.selectAll(userId);
		map.put("empList",li);
		return "employee_list"; 
	}
	
	@RequestMapping(value = "/employee_update_form.htm",method = RequestMethod.GET)
	public String employeeUpdateForm(@RequestParam int employeeId,ModelMap map) {
		
		Employee emp = employeeService.findEmployee(employeeId);
		map.put("employee", emp);
		
		
		return "employee_update_form"; 
	}
	
	@RequestMapping(value = "/employee_update.htm", method = RequestMethod.POST)
	public String employeeUpdate(Employee employee, ModelMap map, HttpSession session) {
		
		
		int userId = ((User)session.getAttribute("user")).getUserId();
		employee.setUserId(userId);
		employeeService.modifyEmployee(employee);
		
		List<Employee> li = employeeService.selectAll(userId);
		map.put("empList",li);
		return "employee_list"; 
	}
	
	
}
