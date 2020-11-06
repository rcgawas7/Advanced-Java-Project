<%@page import="com.cdac.dto.Employee"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login Form</title>
</head>
<body>
	
	<table align="center" >
			<td><h3>FirstName</h3>|</td><td><h3>LastName</h3>|</td><td><h3>Age</h3>|</td><td><h3>Address</h3>|</td><td><h3>Contact</h3>|</td><td><h3>JoinedDate</h3>|</td>
	
		<%
			List<Employee> elist = (List<Employee>)request.getAttribute("empList");
				for(Employee emp : elist){
		%>
		<tr>
			<td>
				<%=emp.getFname() %>
			</td>
			<td>
				<%=emp.getLname()%>
			</td>
			<td>
				<%=emp.getAge() %>
			</td>
			<td>
				<%=emp.getAddress()%>
			</td>
			<td>
				<%=emp.getContact()%>
			</td>
			
			<td>
				<%=emp.getJoinedDate()%>
			</td>
			
			<td>
				<a href="employee_delete.htm?employeeId=<%=emp.getEmployeeId()%>"><input type="button" value="Delete"></a>
			</td>
			<td>
				<a href="employee_update_form.htm?employeeId=<%=emp.getEmployeeId()%>" ><input type="button" value="Update"></a>
			</td>
			
			
			
			
			
		</tr>
		<% } %>
		<tr>
			<td>
				<h3 ><a href="home.jsp" ><input type="button" value="Back"></a></h3>
			</td>
		</tr>
		
		
	</table>
</body>
</html>