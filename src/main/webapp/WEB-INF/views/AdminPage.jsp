<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<script type="text/javascript" src="/resources/js/app.js"></script>
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/js/bootstrap.min.js"></script>
  <script src="https://cdn.jsdelivr.net/jquery.validation/1.16.0/jquery.validate.min.js"></script>
  <script src="https://cdnjs.cloudflare.com/ajax/libs/jquery/3.1.1/jquery.min.js"></script>
<title>Welcome Admin</title>
</head>
<body>
<div class="container">
  <h2>Welcome Admin</h2>
  <form  id="form1" action="" method="post" >
	<div class="list-group">
  <a href="adduser" class="list-group-item">Add User</a>
  <a href="addproject" class="list-group-item">Add Projects</a>
  <a href="viewallprojects" class="list-group-item">View All Projects</a>
  <a href="viewallusers" class="list-group-item">View All Users</a>
  <a href="viewbyuserid" class="list-group-item">View by User ID</a>
</div>
</form>
</div>
</body>
</html>