<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" import="java.util.Date"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Demo JSP</title>
</head>
<body>
	<h1>Hello World</h1>
	<%! public int add(int a, int b) {
		return a+b;	
	}
	%>
	<%
	int i = 2;
	int j = 4;
	
	%>
	<h2><%= add(i,j) %></h2>
	
	<% for (int idx = 5; idx > 0; idx--) { %>
		<h2><%= idx %></h2>
	<% } %>
	
	<P> The time is <%= new Date() %></P>
</body>
</html>