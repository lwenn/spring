<%@ page import="com.lwenn.web.model.User" %>
<html>
    <head>
        <title>new user</title>
    </head>
    <body>
        <h1>Register Successful.</h1>
        <p>Your ID: </p>
        <%
            User user = (User) request.getAttribute("user");
            out.print(user.getUserId());
        %>
        <p>Your name: </p>
        <%
            out.print(user.getUserName());
        %>
        <p>Your password: </p>
        <%
            out.print(user.getUserPassword());
        %>
    </body>
</html>