<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<jsp:useBean id="ref" class="com.mvc.LoginBean" scope="application"/>

<jsp:getProperty property="userName" name="ref"/>
<jsp:getProperty property="password" name="ref"/>
<a href="LogOut.jsp">LogOut</a>


</body>
</html>