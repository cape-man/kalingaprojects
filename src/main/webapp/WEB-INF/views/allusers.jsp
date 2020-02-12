<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
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
<title>All Users</title>
</head>
<body>
	<h2>USER DETAILS</h2>
	
<table class="table">
    <thead>
      <tr>
        <th>USER ID</th>
        <th>USER NAME</th>
        <th>DATE OF JOINING</th>
        <th>ROLE</th>
        <th>EMAIL</th>
        <th>PROJECT ID</th>
      </tr>
    </thead>
    <c:forEach var="user" items="${users}">


<tbody>
      <tr>
      
				<td>${user.userId}</td>
				<td>${user.name}</td>
				<td>${user.doj}</td>
				<td>${user.role}</td>
				<td>${user.email}</td>
				<td><a href="getProject/${user.project.projectId}">${user.project.projectId}</a></td>
			</tr>
		
			</tbody>			
</c:forEach>
		</table>
		
</body>
</html>