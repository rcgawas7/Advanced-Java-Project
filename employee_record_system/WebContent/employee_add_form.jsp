<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="spr"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Add Employee Form</title>
<link href="reg_background.css" rel="stylesheet" style="text/css" >

</head>
<body>
	<spr:form action="employee_add.htm" method="post" commandName="employee">
	<table align="center">
	
		<tr>
			<td>
				First Name:
			</td>
			<td>
				<spr:input path="fname"/>
			</td>
		
		</tr>
		
		<tr>
			<td>
				Last Name:
			</td>
			<td>
				<spr:input path="lname" /> 
			</td>
		
		</tr>
		
		
		
		<tr>
			<td>
				Age:
			</td>
			<td>
				<spr:input path="age" /> 
			</td>
		
		</tr>
		
		
		
		<tr>
			<td>
				Address:
			</td>
			<td>
				<spr:input path="address" /> 
			</td>
		
		</tr>
		
		
		<tr>
			<td>
				Contact:
			</td>
			<td>
				<spr:input path="contact" /> 
			</td>
		
		</tr>
		
		
		<tr>
			<td>
				Joined Date:
			</td>
			<td>
				<spr:input path="joinedDate" /> 
			</td>
		
		</tr>
		
		
		<tr>
			<td>
				<h2><a href="home.jsp">Back</a></h2>
			</td>
			<td>
				<h2><input type="submit" value="Add"></h2>
			</td>
		
		</tr>
	
	
	
	</table>

</spr:form>
</body>
</html>