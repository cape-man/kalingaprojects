<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/js/bootstrap.min.js"></script>
<meta charset="ISO-8859-1">
<title>Show Project</title>
</head>
<body>
<h2>Project Assigned</h2>
<table class="table">
    <thead>
      <tr>
        <th>PROJECT ID</th>
        <th>NAME</th>
        <th>DESCRIPTION</th>
        <th>DURATION</th>
      </tr>
    </thead>

<tbody>
      <tr>
      
				<td>${project.projectId}</td>
				<td>${project.projectName}</td>
				<td>${project.description}</td>
				<td>${project.duration}</td>
			</tr>
		
			</tbody>			

		</table>
</body>
</html>