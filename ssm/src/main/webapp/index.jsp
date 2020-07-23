<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<body>
<h2>Hello World!</h2>

<a href="account/findAll">测试findAll</a>

<form action="account/saveAccount" method="post">
    <input type="text" value="0" name="id" hidden="hidden"/>
    <input type="text" name="name"/>
    <input type="text" name="money"/>
    <input type="submit" value="提交"/>
</form>
</body>
</html>
