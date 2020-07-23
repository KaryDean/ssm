<%--
  Created by IntelliJ IDEA.
  User: kearmy
  Date: 2020/7/23
  Time: 11:52
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<head>
    <title>Title</title>
</head>
<body>

<h3>跳转成功</h3>

<c:forEach items="${accountList}" var="account">
    ${account.name}:${account.money}
</c:forEach>

</body>
</html>
