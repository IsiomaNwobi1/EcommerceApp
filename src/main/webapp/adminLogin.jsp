<%--
  Created by IntelliJ IDEA.
  User: macbook
  Date: 14/03/2024
  Time: 22:25
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta charset="utf-8">
<%--    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">--%>
<%--    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.0/css/bootstrap.min.css">--%>
<%--    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css">--%>
<%--    <script src="https://code.jquery.com/jquery-3.5.1.min.js"></script>--%>
<%--    <script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.0/dist/umd/popper.min.js"></script>--%>
<%--    <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.5.0/js/bootstrap.min.js"></script>--%>
    <style>
        body {
            color: #fff;
            background: #ff5dd7;
        }
        .form-control {
            min-height: 41px;
            background: #f2f2f2;
            box-shadow: none !important;
            border: transparent;
        }
        .form-control:focus {
            background: pink;
        }
        .form-control, .btn {
            border-radius: 2px;
        }
        .login-form {
            width: 350px;
            margin: 30px auto;
            text-align: center;
        }
        .login-form h2 {
            margin: 10px 0 25px;
        }
        .login-form form {
            color: #ff5dd7;
            border-radius: 3px;
            margin-bottom: 15px;
            background: #fff;
            box-shadow: 0px 2px 2px rgba(0, 0, 0, 0.3);
            padding: 30px;
        }
        .login-form .btn {
            font-size: 16px;
            font-weight: bold;
            background: #ff5dd7;
            border: none;
            outline: none !important;
        }
        .login-form .btn:hover, .login-form .btn:focus {
            background: #ff5dd7;
        }
        .login-form a {
            color: #fff;
            text-decoration: underline;
        }
        .login-form a:hover {
            text-decoration: none;
        }
        .login-form form a {
            color: #ff5dd7;
            text-decoration: none;
        }
        .login-form form a:hover {
            text-decoration: underline;
        }
    </style>
</head>
<body>
<div class="login-form">
    <form action="adminDashboard.jsp" method="post">
        <h2 class="text-center">Login</h2>
        <div class="form-group has-error">
            <input type="text" class="form-control" name="username" placeholder="Username" required="required">
        </div>
        <div class="form-group">
            <input type="password" class="form-control" name="password" placeholder="Password" required="required">
        </div>
        <div class="form-group">
            <input type="password" class="form-control" name="password" placeholder="Admin token" required="required">
        </div>
        <div class="form-group">
            <a href="adminDashboard.jsp"> <button type="submit" class="btn btn-primary btn-lg btn-block">Login</button></a>
        </div>
    </form>
    <p class="text-center small">Not an Admin? <a href="admin-signup.jsp">Sign up here!</a></p>
</div>
</body>
</html>
