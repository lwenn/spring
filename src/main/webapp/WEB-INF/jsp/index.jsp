<%@ page language="java" pageEncoding="UTF-8"%>
<html>
<head>
    <title>user login</title>
    <style>
        #register, #login {
            background-color: pink;
            border-radius: 5px;
        }
    </style>
</head>
<body>
<form>
    <p>name:
        <input type="text" name="name" required="required" />
    <p id="p1" style="display:none;">名字不能为空</p>
    </p>
    <p>password:
        <input type="password" name="password" required="required" />
    </p>
    <input id="register" type="button" value="注册" />
    <input id="login" type="button" value="登录" />
</form>
<script>
    var register = document.getElementById("register");
    var login = document.getElementById("login");
    var form = document.getElementsByTagName("form")[0];
    var inputs = form.getElementsByTagName("input");
    var name = inputs.item(0);
    var pwd = inputs[1];
    register.addEventListener("click", onRegister);
    login.addEventListener("click", onLogin);

    function onRegister(e) {
//                if (name.value.length == 0) {
//                    var p = document.createElement("p");
//                    var str = document.createTextNode("名字不能为空");
//                    p.appendChild(str);
//                    name.parent().appendChild(p);
//                    return;
//                }
        register.removeEventListener("click", onRegister);
        form.setAttribute("method", "post");
        form.setAttribute("action", "register.do");
        form.submit();
    }

    function onLogin(e) {
//                if (pwd.value.length == 0) {
//                    var p = document.createElement("p");
//                    var str = document.createTextNode("密码不能为空");
//                    p.appendChild(str);
//                    pwd.parent.appendChild(p);
//                    return;
//                }
        login.removeEventListener("click", onLogin);
        form.setAttribute("method", "get");
        form.setAttribute("action", "login.do");
        form.submit();
    }
</script>
</body>
</html>