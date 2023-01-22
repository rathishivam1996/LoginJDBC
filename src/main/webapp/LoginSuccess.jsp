<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%@page import="org.shivam.dao.*"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login Success.jsp</title>
</head>
<body>
	<h1>Login Success.jsp</h1>
	<jsp:useBean id="login" class="org.shivam.loginbean.LoginBean" />

	<jsp:setProperty property="*" name="login" />

	<%
	LoginDao loginDao = new LoginDao();
	boolean status = loginDao.validate(login);
	if (status) {
		out.print("<h1>you have logged in successfully</h1>");
	}
	%>

</body>
</html>