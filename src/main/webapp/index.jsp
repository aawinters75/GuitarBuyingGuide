<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Guitar Buying Guide</title>

</head>
<body>

	<h1>Guitar Buying Guide</h1>
	
	<form action="getGuitarServlet" method="post">
		Enter your budget for a guitar:
		<input type="text" name="userBudget" size="10">
		<input type="submit" value="Budget" />
	</form>
</body>
</html>