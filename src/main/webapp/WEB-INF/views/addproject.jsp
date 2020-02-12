<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/css/bootstrap.min.css">
  <script type="text/javascript" src="/resources/js/app.js"></script>
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/js/bootstrap.min.js"></script>
  <script src="https://cdn.jsdelivr.net/jquery.validation/1.16.0/jquery.validate.min.js"></script>
  <script src="https://cdnjs.cloudflare.com/ajax/libs/jquery/3.1.1/jquery.min.js"></script>
<title>Add Project</title>
</head>
<body>
<div class="container">
  <h2>Add Project Details</h2>
  <form  id="form1" action="projectadded" method="post" >
    <div class="form-group">
      <label for="projectId">Project ID : </label>
      <input type="text" class="form-control" id="projectId" placeholder="Enter Project ID" name="projectId" required>
    </div>
    
    <div class="form-group">
      <label for="projectName">Name : </label>
      <input type="text" class="form-control" id="projectName" placeholder="Enter Project Name" name="projectName" required>
    </div>
     <div class="form-group">
      <label for="description">Description : </label>
      <input type="text" class="form-control" id="description" placeholder="Enter Project Description" name="description" required>
    </div>
    <div class="form-group">
      <label for="duration">Duration: </label>
      <input type="text" class="form-control" id="duration" placeholder="Enter Project duration" name="duration" required>
    </div>
   
    <button type="submit" class="btn btn-default">Submit</button>
   <button type="reset" class="btn btn-default">Reset</button>
   
  </form>
</div>
</body>
</html>