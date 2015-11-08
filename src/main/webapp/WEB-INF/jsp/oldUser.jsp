<%@ page import="com.lwenn.web.model.User" %>
<html>
    <head>
        <title>old user</title>
    </head>
    <body>
        <h1>Welcome,
            <%
                User user = (User) request.getAttribute("user");
                out.print(user.getUserName());
            %>
        </h1>
    </body>
</html>