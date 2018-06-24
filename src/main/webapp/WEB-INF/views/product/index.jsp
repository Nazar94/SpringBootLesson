<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
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
		<td>ID</td>
		<td>${product.id}</td>
	</tr>
	<tr>
		<td>Name</td>
		<td>${product.name}</td>
	</tr>
	<tr>
		<td>Photo</td>
		<td><img src="${pageContext.request.contextPath}/resources/images/${product.photo}"/></td>
	</tr>
	<tr>
		<td>Price</td>
		<td>${product.price}</td>
	</tr>
	<tr>
		<td>Quantity</td>
		<td>${product.quantity}</td>
	</tr>
	<tr>
		<td>Total</td>
		<td>${product.price*product.quantity}</td>
	</tr>
	</table>
</body>
</html>
