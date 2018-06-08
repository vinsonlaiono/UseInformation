<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset=ISO-8859-1>
	<title>Insert title here</title>
</head>
<body>

    <% String req = request.getParameter("name"); %>
    <!-- displaying the value -->
    <h1><%= req %></h1>
    
	<% for (int idx = 5; idx > 0; idx--) { %>
		<h2><%= idx %></h2>
	<% } %>
</body>
</html>