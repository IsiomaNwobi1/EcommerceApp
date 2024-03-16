<%@ page import="com.example.isiomanwobi_week8_task.model.User" %>
<%@ page import="com.example.isiomanwobi_week8_task.dao.ProductDao" %>
<%@ page import="com.example.isiomanwobi_week8_task.model.Product" %>
<%@ page import="java.util.List" %>
<%@ page import="com.example.isiomanwobi_week8_task.model.Cart" %>
<%@ page import="com.example.isiomanwobi_week8_task.util.ConnectionUtil" %>
<%@ page import="java.util.ArrayList" %><%--

--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
    User auth = (User) request.getSession().getAttribute("auth");
    if(auth != null){
        request.setAttribute("auth", auth);
    }
    ProductDao pd = new ProductDao(ConnectionUtil.getConnection());
    List<Product> products = pd.getAllProducts();

    ArrayList<Cart> cart_list = (ArrayList<Cart>) session.getAttribute("cart-list");
    if (cart_list != null){
        request.setAttribute("cart_list",cart_list);
    }
%>
<!DOCTYPE html>
<html>
<head>
    <%@include file="/includes/head.jsp"%>
    <title>STORE</title>
    <style>

        title{
            color: #ff5dd7;
        }

        body{
            background-color: #ff5dd7;
        }

        .btndark{
            color: white;
            background-color: deeppink;
        }

    </style>
</head>
<body>
<%@include file="/includes/navbar.jsp"%>

<div class="container">
    <div class="card-header my-3">PRODUCTS</div>
    <div class="row">
        <%
            if (!products.isEmpty()) {
                for (Product p : products) {
        %>
        <div class="col-md-3 my-3">
            <div class="card w-100">
                <img class="card-img-top" src="images/<%=p.getImage() %>"
                     alt="Card image cap">
                <div class="card-body">
                    <h5 class="card-title"><%=p.getName() %></h5>
                    <h6 class="price">Price: $<%=p.getPrice() %></h6>
                    <h6 class="category">Category: <%=p.getCategory() %></h6>
                    <div class="mt-3 d-flex justify-content-between">
                        <a class="btndark" href="add-to-cart?id=<%=p.getId()%>">ADD TO CART</a>
                    </div>
                </div>
            </div>
        </div>
        <%
                }
            }
        %>

    </div>
</div>

<%@include file="/includes/footer.jsp"%>
</body>
</html>
