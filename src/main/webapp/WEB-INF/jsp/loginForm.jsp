<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%--
  Created by IntelliJ IDEA.
  User: index
  Date: 2019-08-10
  Time: 15:56
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>登录页面</title>
</head>
<body>
<h3>登录页面</h3>
<font color="red">${requestScope.message }</font>
<form action="login" method="post">
    <table>
        <tr>
            <td>登录名:</td>
            <td><input type="text" id="loginname" name="loginname" placeholder="请输入..."></td>
        </tr>

        <tr>
            <td>密码:</td>
            <td><input type="password" id="password" name="password" placeholder="请输入..."></td>
        </tr>
        <tr>
            <td><input type="submit" value="登录"></td>
        </tr>
    </table>
</form>
</body>
</html>
