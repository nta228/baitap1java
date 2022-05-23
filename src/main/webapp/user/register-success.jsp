<%@ page import="fpt.aptech.t2009m1helloworld.entity.Account" %><%--
  Created by IntelliJ IDEA.
  User: Nguyễn Tuấn Anh
  Date: 5/22/2022
  Time: 9:47 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
    Account account = (Account)request.getAttribute("account");
%>
<!DOCTYPE html>
<html>
<title>W3.CSS</title>
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet" href="https://www.w3schools.com/w3css/4/w3.css">
<body>

<div class="w3-container w3-green">
    <h2 style="text-shadow:1px 1px 0 #444">Register Success</h2>
</div>
<div>Username:<%= account.getUsername() %></div>
<div>Password:<%= account.getPassword() %></div>
<div>FullName:<%= account.getFullName() %></div>
<div>Email:<%= account.getEmail() %></div>
<div>Phone:<%= account.getPhone() %></div>
<div>Birthday:<%= account.getBirthday() %></div>

</body>
</html>

