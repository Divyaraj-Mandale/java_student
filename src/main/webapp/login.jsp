<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>login</title>
</head>
<body>
<h2>login</h2>
<hr>
<%
if(request.getAttribute("error")!=null ){
	out.println(request.getAttribute("error"));
}
%>
<form action="login" method ="post">
email<input type="text" name="email"/>
password<input type="password" name="password"/>
<input type="submit" value="login"/>
</form>
</body>
</html>