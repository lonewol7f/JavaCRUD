<%@page import="utility.UserDBUtil"%>
<%@page import="model.User"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>User Profile</title>
</head>
<body>
	<%
	String uname = (String) session.getAttribute("uname");
	User user = UserDBUtil.getSingleUser(uname); 
	%>
	<form action="updateUser" method="post">
		<label for="fname">First Name: </label>
		<input type="text" name="fname" id="fname" value="<%=user.getFname() %>" required><br><br>
		
		<label for="lname">Last Name: </label>
		<input type="text" name="lname" id="lname" value="<%=user.getLname() %>" required><br><br>
		
		<label for="email">Email: </label>
		<input type="email" name="email" id="email" value="<%=user.getEmail() %>" required disabled><br><br>
		
		<label for="uname">Username: </label>
		<input type="text" name="uname" id="uname" value="<%=user.getUname() %>" required disabled><br><br>
		
		<input type="hidden" name="id" id="id" value="<%=user.getId() %>">
		
		<input type="submit" value="Update">&nbsp;&nbsp;&nbsp;&nbsp;
		<a href="userList.jsp"><input type="button" value="User List"></a>
	</form>
	
</body>
</html>