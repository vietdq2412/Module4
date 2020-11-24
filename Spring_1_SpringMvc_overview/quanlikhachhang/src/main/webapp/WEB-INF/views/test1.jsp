<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 11/16/2020
  Time: 4:18 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>test1</h1>
<form action="/customer/Create" method="post">
    <label for="Name">Name</label>
    <input type="text" name="Name" id="Name"/>

    <label for="Rate">Rate</label>
    <input type="text" name="Rate" id="Rate"/>
    <label for="Rating">Rating</label>
    <input type="text" name="Rating" id="Rating"/>
    <input type="submit" name="submit" />
</form>
</body>
</html>
