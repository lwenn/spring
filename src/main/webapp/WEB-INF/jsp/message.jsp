<%--
  Created by IntelliJ IDEA.
  User: lwenn
  Date: 15/11/13
  Time: 下午1:28
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title></title>
</head>
<body>
  <%
    String message = (String) request.getAttribute("message");
    out.println(message);
  %>
</body>
</html>
