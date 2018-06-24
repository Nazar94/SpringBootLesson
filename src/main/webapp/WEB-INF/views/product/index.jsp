<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Index View</title>
<link href="${pageContent.request.contextPath}/resources/css/style.css"
	rel="stylesheet" type="text/css">
</head>
<body>
	<h2>Product information</h2>
	<table border="1" cellpadding="2" cellspacing="2">
	<tr>
		<th>ID</th>
		<th>Name</th>
		<th>Photo</th>
		<th>Price</th>
		<th>Quantity</th>
		<th>Total</th>
	</tr>
	<c:forEach var="product" items="${products }">
	<tr>
		<td>ID</td>
		<td>${product.id}</td>
		<td>${product.name}</td>
		<td><img src="${pageContext.request.contextPath}/resources/images/${product.photo}"/></td>
		<td>${product.price}</td>
		<td>${product.quantity}</td>

		<td>${product.price*product.quantity}</td>
	</tr>
	</c:forEach>
	</table>
</body>
</html>
