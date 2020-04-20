<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login Page</title>
<link href="webjars/bootstrap/4.3.1/css/bootstrap.min.css" rel="stylesheet">
</head>
<body>
	<font color="red">${errorMessage}</font>
	<form action="login" method="post">
		Name: <input type="text" name="name" placeholder="Enter your Name">
		Password: <input type="password" name="password" placeholder="Enter Password">
		<input type="submit" value="Login">
	</form>
	
<script src="webjars/jquery/3.4.1/jquery.min.js"></script>
<script src="webjars/bootstrap/4.3.1/js/bootstrap.min.js"></script>
</body>
</html>