<%--
  Created by IntelliJ IDEA.
  User: kkonieczny
  Date: 05/06/2018
  Time: 12:28
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Registration</title>
</head>
<body>
    <h1>Rejestracja</h1>

    <form method="post" action="/auth/register">

        <div>Username: <input type="text" name="username"></div>

        <div>Password: <input type="password" name="password"></div>
        <div><input type="submit" value="Zarejestruj się"/></div>
    </form>
</body>
</html>
