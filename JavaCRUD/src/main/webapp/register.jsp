<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Register</title>
</head>
<body>
	<div style="margin: inherit;height: 90vh;">
		<div style="text-align:center;margin:10px;padding-top:100px"><h1>Register Page</h1></div>
		<div style="text-align:center">
			<form action="register" method="post">
				
				<label for="fname">First Name: </label>
				<input type="text" name="fname" id="fname" required><br><br>
				
				<label for="lname">Last Name: </label>
				<input type="text" name="lname" id="lname" required><br><br>
				
				<label for="email">Email: </label>
				<input type="email" name="email" id="email" required><br><br>
				
				<label for="uname">Username: </label>
				<input type="text" name="uname" id="uname" required><br><br>
				
				<label for="passwd">Password: </label>
				<input type="password" name="passwd" id="passwd" required><br><br>
				
				<input type="submit">&nbsp;&nbsp;&nbsp;&nbsp;
				<a href="login.jsp"><input type="button" value="Log In"></a>
			</form>
		</div>
	</div>
</body>
</html>