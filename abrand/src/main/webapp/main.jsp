<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 <%@ page import="net.cr.abrand.vo.Member" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>abrandSpringTest</title>
</head>
<body>
<h1>메인성공!</h1>
<% 
Member m = (Member)session.getAttribute("member");
%>
<%= m.getMno() %><br>
<%= m.getName() %><br>
<%= m.getAge() %><br>
<%= m.getPassword() %><br>
</body>
</html>