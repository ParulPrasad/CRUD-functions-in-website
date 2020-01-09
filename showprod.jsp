<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page import="com.deloitte.estore.model.Product" %> 
<%@ page import="java.util.*" %>   
 <jsp:include page="header.jsp"></jsp:include>

<% 
Product p=(Product)session.getAttribute("product");
%>

<table>
<tr>
<th>Prod Id</th>
<th>Prod Name</th>
<th>Prod Price</th>
<th>Update</th>
<th>Delete</th>
</tr>
<%

	out.println("<tr><td>"+p.getProductId()+"</td>");
	out.println("<td>"+p.getProductName()+"</td>");
	out.println("<td>"+p.getPrice()+"</td>");
	out.println("<td><a href=update?pid="+p.getProductId()+">Update</a></td>");
	out.println("<td><a href=delete?pid="+p.getProductId()+">Delete</a></td></tr>");

%>
</table>

</html>