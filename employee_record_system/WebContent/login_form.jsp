<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="spr"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login Form</title>
<link href="reg_background.css" rel="stylesheet" style="text/css" >
</head>
<body>
	<spr:form action="login.htm" method="post" commandName="user">
	<table align="center">
	
		<tr>
			<td>
				User Name:
			</td>
			<td>
				<spr:input path="userName"/>
				<spr:errors path="userName"></spr:errors>
			</td>
		
		</tr>
		
		<tr>
			<td>
				User Password:
			</td>
			<td>
				<spr:password path="userPass" /> 
				<spr:errors path="userPass"></spr:errors>
			</td>
		
		</tr>
		
		<tr>
			<td>
				<a href="index.jsp">Back</a>
			</td>
			<td>
				<h2><input type="submit" value="Login"></h2>
			</td>
		
		</tr>
		
		
		
		<tr>
			<td>
				<a href="forgot_password.html">Forgot Password</a>
			</td>
			<td>
				
			</td>
		
		</tr>
	
	
	
	</table>

</spr:form>
</body>
</html>