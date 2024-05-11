<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet"
	href="https://cdn.jsdelivr.net/npm/bootstrap@4.4.1/dist/css/bootstrap.min.css"
	integrity="sha384-Vkoo8x4CGsO3+Hhxv8T/Q5PaXtkKtu6ug5TOeNV6gBiFeWPGFN9MuhOf23Q9Ifjh"
	crossorigin="anonymous">
<script src="https://code.jquery.com/jquery-3.4.1.slim.min.js"
	integrity="sha384-J6qa4849blE2+poT4WnyKhv5vZF5SrPo0iEjwBvKU7imGFAV0wwj1yYfoRSJoZ+n"
	crossorigin="anonymous"></script>
<script
	src="https://cdn.jsdelivr.net/npm/popper.js@1.16.0/dist/umd/popper.min.js"
	integrity="sha384-Q6E9RHvbIyZFJoft+2mJbHaEWldlvI9IOYy5n3zV9zzTtmI3UksdQRVvoxMfooAo"
	crossorigin="anonymous"></script>
<script
	src="https://cdn.jsdelivr.net/npm/bootstrap@4.4.1/dist/js/bootstrap.min.js"
	integrity="sha384-wfSDF2E50Y2D1uUdj0O3uMBJnjuUD4Ih7YwaYd1iqfktj0Uod8GCExl3Og8ifwB6"
	crossorigin="anonymous"></script>


</head>
<body>

	<div class="container">
		<div class="row">
			<div class="col-md-5 m-auto">
				<h1 align="center" class="text-success">Student Information</h1>

				<form action="index" method="post">
					<div class="form-group">
						<label>Fisrt Name</label> <input type="text" name="fname"
							placeholder="Enter first name" class="form-control">
					</div>

					<div class="form-group">
						<label>Last Name</label> <input type="text" name="lname"
							placeholder="Enter last name" class="form-control">
					</div>
					<div class="form-group">
						<label>Email</label> <input type="text" name="emali"
							placeholder="Enter email" class="form-control">
					</div>

					<div class="form-group">
						<label>mobile</label> <input type="text" name="mobile"
							placeholder="Enter mobile number" class="form-control">
					</div>
					<div class="form-group">
						<label>Gender</label> <input type="radio" name="gender"
							value="male" checked>male <input type="radio"
							name="gender" value="female">female


						<div class="form-group">
							<label>password</label> <input type="text" name="pass"
								placeholder="Enter password" class="form-control">
						</div>


					</div>
					<div>
						<input type="submit" class="btn btn-success">
					</div>

				</form>

			</div>
		</div>

	</div>
</body>
</html>