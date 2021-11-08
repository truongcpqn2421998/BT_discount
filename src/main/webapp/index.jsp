<%--
  Created by IntelliJ IDEA.
  User: HI
  Date: 11/8/2021
  Time: 1:37 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>discount</title>
    <style>
      #discount-main{

      }
    </style>
  </head>
  <body>
  <form action="/DiscountServlet" method="post">
    <div id="discount-main">
      <h2>Product Description</h2>
      <div><input type="text" placeholder="Product Description" name="pd"></div>
      <h2>List Price:</h2>
      <div><input type="text" placeholder="price"name="price"></div>
      <h2>Discount Percent:</h2>
      <div><input type="text" placeholder="discount" name="discount"></div>
      <input type="submit">
    </div>
  </form>
  </body>
</html>
