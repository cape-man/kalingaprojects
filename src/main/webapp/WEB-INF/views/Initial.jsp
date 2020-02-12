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
<title>Admin Or User</title>
</head>
<body>
<div class="container">
  <h2>Enter User Details</h2>
  <form  id="form1" action="AdminPage" method="post" >
    <div class="form-group">
      <label for="userName">User ID : </label>
      <input type="text" class="form-control" id="userIdLocal" placeholder="Enter User ID" name="userIdLocal">
    </div>
    <div class="form-group">
      <label for="password">Password : </label>
      <input type="password" class="form-control" id="password" placeholder="Enter password" name="password">
    </div>
    <button type="submit" class="btn btn-default">Submit</button>
   <button type="reset" class="btn btn-default">Reset</button>
  </form>
</div>
</body>
</html>