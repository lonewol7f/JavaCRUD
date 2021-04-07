<%@page import="model.User"%>
<%@page import="utility.UserDBUtil"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>List of Users</title>
<style>
	table, th, td {
	  border: 1px solid black;
	  border-collapse: collapse;
	}
	
	th, td {
		padding: 15px;
	}
</style>
</head>
<body>
	
	<table>
		<thead>
			<tr>
				<th style="border-spacing: 5px;">ID</th>
				<th style="border-spacing: 5px;">First Name</th>
				<th style="border-spacing: 5px;">Last Name</th>
				<th style="border-spacing: 5px;">Email</th>
				<th style="border-spacing: 5px;">Username</th>
			</tr>
		</thead>
		<tbody>
	
	<%
	ArrayList<User> list = UserDBUtil.listUser(); 
	
	for(User user : list) {
	%>
	
		<tr>
			<td><%=user.getId() %></td>
			<td><%=user.getFname() %></td>
			<td><%=user.getLname() %></td>
			<td><%=user.getEmail() %></td>
			<td><%=user.getUname() %></td>
		</tr>
	
	<%} %>
		</tbody>
	</table>
	<br>
	<hr>
	<br>
	
	<form action="deleteUser" method="post">
		<label for="uid">Enter User ID for delete that record: &nbsp;&nbsp;</label>
		<input type="text" name="uid" id="uid" required><br><br>
		
		<input type="submit" value="Delete">
	</form>
</body>
</html>