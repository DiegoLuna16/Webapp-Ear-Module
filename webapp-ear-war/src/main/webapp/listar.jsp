<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
    <title>Lista de Usuarios</title>
</head>
<body>
    <h3>Lista de Usuarios</h3>

<ul>
    <c:forEach items="${usuarios}" var="u">
    <li>${u.username}</li>
    </c:forEach>
</ul>

</body>
</html>
