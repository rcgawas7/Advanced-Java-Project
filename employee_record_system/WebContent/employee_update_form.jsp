<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="spr"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Update Employee Form</title>
</head>
<body>
	<spr:form action="employee_update.htm" method="post" commandName="employee">
	<table align="center">
	
		<tr>
			<td>
				
			</td>
			<td>
				<spr:hidden path="employeeId"/>
			</td>
		
		</tr>
		
		
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
				<a href="employee_list.htm">Back</a>
			</td>
			<td>
				<input type="submit" value="Update">
			</td>
		
		</tr>
	
	
	
	</table>

</spr:form>
</body>
</html>