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
    <title>Signup Form</title>
    <style>

        body{
            background-color: #ff5dd7;
        }
        form{
            color: white;
        }
        h1{
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
    <h1>User Signup</h1>
    <form action="/signup" method="post">
        First Name : <input type="text" name="firstName" /><br /><br />
        Last Name : <input type="text" name="lastName" /><br /><br />
        Email : <input type="email" name="email" /><br /><br />
        Password : <input type="password" name="password" /><br /><br />
        <input type="submit" value="Signup">
    </form>
</div>
</body>
</html>
