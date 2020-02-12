<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/js/bootstrap.min.js"></script>
<meta charset="ISO-8859-1">
<title>Change Password</title>
</head>
<body>
 <form  id="form8" action="passwordChanged" method="post" >
    <div class="form-group">
      <label for="userpwd">Enter Old Password : </label>
      <input type="password" class="form-control" id="oldPassword" placeholder="Enter Old Password" name="oldPassword" required>
    </div>
    <div class="form-group">
      <label for="userpwd">Enter New Password : </label>
      <input type="password" class="form-control" id="newPassword" placeholder="Enter New Password" name="newPassword" required>
    </div>
    <button type="submit" class="btn btn-default">Update Password</button>
    </form>
</body>
</html>