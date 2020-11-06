<%@page import="com.cdac.dto.User"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Home Page</title>
<link href="home_background.css" rel="stylesheet" style="text/css" >
</head>
<body>
	
	
	
		<tr>
			<td ><h1 align="center"> Welcome <%=(session.getAttribute("user")!=null) ? ((User)session.getAttribute("user")).getUserName() : "!!!!!!!!" %></h1></td>
		
		</tr>
		
		<table align="center">
	
		<tr><td>&nbsp;&nbsp;</td></tr>
	
	
		<tr>
			<td><h2><a href="prep_employee_add_form.htm">Add Employee</a></h2></td>
			<td><h2><a href="employee_list.htm">Employee List</a></h2></td>
		
		</tr>
	
		<tr>
			<td ><h2 style="margin-right: 20px"><a href="employee_list.htm">Update Employee </a></h2></td>
			<td><h2><a href="employee_list.htm">Delete Employee</a></h2></td>
		
		</tr>
		
		<tr>
			<td><h2 align="center" style="margin-left: 150px"><a href="index.html"><input type="button" value="logout"></a></h2></td>
		
		</tr>
	
	</table>
	
	
</body>
</html>