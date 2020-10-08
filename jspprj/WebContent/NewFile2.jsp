<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ page import="java.util.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<p>The square root of 5 is <%= Math.sqrt(5) %></p>
<%
Date d = new Date();
System.out.println("Current Date="+d);
%>
<p>Current time is: <%=  new java.util.Date() %></p>
</body>
</html>