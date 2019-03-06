<%--
  Created by IntelliJ IDEA.
  User: xujian
  Date: 2019/3/5
  Time: 21:22
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<table>

    ${list}

    <c:forEach items="${list}" var="user">
       <tr>
           <td>${user.id}</td>
           <td>${user.name}</td>
           <td>${user.password}</td>
           <td>${user.money}</td>
       </tr>
    </c:forEach>
</table>


</body>
</html>
