<%@page import="com.tyss.emp.dto.UserBean"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<% String email=(String) request.getAttribute("email");
   String pass=(String)request.getAttribute("password");

%>
<%
UserBean userBean=(UserBean) request.getAttribute("userBean");
%>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Display data</title>
</head>
<body>
<!-- using expression language get data use url formsubmit -->
<h1>This is email:->${email} </h1>
<h1>This is password:->${password} </h1>
<br>
<br>

<!-- using request get data use url formsubmit2  -->
email:<%=email %>
<br>
password:<%=pass %>
<br>
<br>

<!-- using modalmap get data use url formsubmit3 -->
 username:->>${userBean.email}
<br>
password-->>${userBean.password}
<br>
<br> 
email:-><%=userBean.getEmail() %>
<br>
pass:-><%=userBean.getPassword() %>
<br>
<br> 

</body>
</html>