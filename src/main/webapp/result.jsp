<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
	<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Guitar Buying Guide Results</title>
</head>
<body>
<title>Results</title>
</head>
<body>
<p>${userGuitarSelection.getBudget()} budget means you should look into the following brands: <br />
${userGuitarSelection.getGuitarSelection()} Guitars <br />

</p>
<a href="index.jsp">Select another amount</a>
</body>
</html>