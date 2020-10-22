<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Home page</title>
</head>
<body>
<h3>Rest Demo</h3>
<a href="${pageContext.request.contextPath }/test/hello">Hello</a>
<br><br>
<a href="${pageContext.request.contextPath }/api/students">All Students</a>
</body>
</html>