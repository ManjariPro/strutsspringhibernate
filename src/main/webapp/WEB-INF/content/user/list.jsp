<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="/struts-tags" prefix="s" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Hello Struts 2.5 and Spring 5.3.10</title>
</head>
<body>
    <h2>User List</h2>
    <s:iterator value="userList">
        <p>User ID: <s:property value="id"/></p>
        <p>User Name: <s:property value="name"/></p>
        <p>User Email: <s:property value="email"/></p>
        <hr/>
    </s:iterator>

</body>
</html>