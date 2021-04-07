<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login Page</title>
</head>
<body>
	<div style="margin: inherit;height: 90vh;">
		<div style="text-align:center;margin:10px;padding-top:100px"><h1>Login Page</h1></div>
		<div style="text-align:center">
			<form action="login" method="post">
				<label for="uname">Username: </label>
				<input type="text" name="uname" id="uname" required><br><br>
				
				<label for="passwd">Password: </label>
				<input type="password" name="passwd" id="passwd" required><br><br>
				
				<input type="submit">&nbsp;&nbsp;&nbsp;&nbsp;
				<a href="register.jsp"><input type="button" value="Register"></a>
			</form>
		</div>
	</div>
</body>
</html>