<%--
  Created by IntelliJ IDEA.
  User: macbook
  Date: 12/03/2024
  Time: 09:57
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Login</title>
    <link rel="stylesheet" href="css/style.css">
    <style>

        body{
            background-color: #ff5dd7;
        }
        form{
            color: white;
        }
        h2{
            color: white;
        }
        a {
            color: white;
        }

        input{
            color: #ff5dd7;
        }

    </style>
</head>
<body>
<div align="center">
    <h2>Login</h2>
    <form action="login-servlet" method="post">
        Email: <input type="email" name="email" required><br /><br />
        Password: <input type="password" name="password" required><br /><br />
        <input type="submit" value="Login">
    </form>
</div>
</body>
</html>
