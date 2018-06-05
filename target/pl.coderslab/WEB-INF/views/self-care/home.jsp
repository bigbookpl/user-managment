<%--
  Created by IntelliJ IDEA.
  User: kkonieczny
  Date: 05/06/2018
  Time: 10:17
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jstl/core" prefix="c" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
        <h1>SelfCare Home Page</h1>
        <h2>Only for authorized users</h2>

        <h3>Your username: <c:out value="${username}"/></h3>
        <h3>Your role: <c:out value="${role}"/></h3>
</body>
</html>
