<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: index
  Date: 2019-08-10
  Time: 15:47
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>首页</title>
</head>
<body>
<table border="1">
    <tr>
        <th>封面</th>
        <th>作者</th>
        <th>价格</th>
    </tr>
    <c:forEach items="${bookList}" var="book">
        <tr>
            <td><img src="images/${book.image}" height="60"></td>
            <td>${book.name}</td>
            <td>${book.author}</td>
            <td>${book.price}</td>
        </tr>
    </c:forEach>
    <tr>
        <td>
            <form action="quit">
                <input type="submit" VALUE="退出">
            </form>
        </td>
    </tr>
</table>
</body>
</html>
