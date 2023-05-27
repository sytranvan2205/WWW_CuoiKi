<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<%@include file="./base.jsp"%>
</head>
<body>


	<div class="container mt-3">

		<h1>Product management</h1>
		<a href="addProduct" class="btn btn-primary"> Add Product </a>
		<div class="row">

			<table class="table table-hover">
				<thead>
					<tr>
						<th scope="col">ID</th>
						<th scope="col">Name</th>
						<th scope="col">Price</th>
						<th scope="col">Category</th>
						<th scope="col">Edit</th>
						<th scope="col">Delete</th>
					</tr>
				</thead>
				<tbody>
					<c:forEach var="item" items="${products}">
						<tr>
							<td class="table-plus">${item.productId}</td>
							<td>${item.productName}</td>
							<td>${item.price}</td>
							<td>${item.getCategory().categoryName}</td>
							<td><a href="editProduct/${item.productId}" class="btn btn-warning">
									Edit </a></td>
							<td><a href="deleteProduct/${item.productId}"
								class="btn btn-danger"> Delete </a></td>
						</tr>
					</c:forEach>
				</tbody>
			</table>
		</div>
	</div>

</body>
</html>