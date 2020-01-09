<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 <%@ page import="com.deloitte.estore.model.Product" %>   
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<!-- Product product=(Product)session.getAttribute("product"); -->


<form action="update1" method="post">


Id: <input type="text"  name="txtpid" value=${product.productId} readonly > <br>
Name: <input type="text"  name="txtpname" value=${product.productName} > <br>
Price: <input type="text"  name="txtprice" value=${product.price}> <br>

<input type="submit" value="Update">
</form>
</body>
</html>