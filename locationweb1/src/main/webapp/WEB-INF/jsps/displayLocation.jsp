<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>View All Locations</title>
</head>
<body>
<table border="1">
	<tr>
		<th>Id</th>
		<th>Code</th>
		<th>Name</th>
		<th>Type</th>
	</tr>
<c:forEach items="${locations}" var="location">
	<tr>
		<td>${location.id}</td>
	    <td>${location.code}</td>
	    <td>${location.name}</td>
	    <td>${location.type}</td>
	</tr>

</c:forEach>
</table>

</body>
</html>