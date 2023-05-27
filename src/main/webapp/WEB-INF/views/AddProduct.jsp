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

		<h1>Add Product Form</h1>
		<form action="insertProduct" method="post">

			<div class="row">
				<div class="form-group">
					<label for="name">Name</label> <input type="text"
						class="form-control" id="productName" name="productName"
						placeholder="Enter Name">
				</div>
			</div>
			<div class="row">
					<div class="form-group">
						<label for="designation">Price</label> <input type="text"
							class="form-control" id="price" name="price"
							placeholder="Enter Price">
					</div>
			</div>
			<div class="row">
					<div class="form-group">
						<label for="designation">Price</label> <input type="text"
							class="form-control" id="categoryId" name="categoryId"
							placeholder="Enter CategoryID">
					</div>
			</div>
			<a href="${pageContext.request.contextPath }/"
				class="btn btn-warning"> Back </a>
			<button type="submit" class="btn btn-primary">Submit</button>
		</form>

	</div>

</body>
</html>