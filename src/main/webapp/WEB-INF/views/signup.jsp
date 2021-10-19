<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Signup Page</title>
</head>
<body>
<!doctype html>
<html lang="en">
  <head>
    <!-- Required meta tags -->
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">

    <!-- Bootstrap CSS -->
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">

    <title>Signup</title>
  </head>
  <body>    
    <div class="container mt-7">
    	 
		<form action="processsignup" method="post">
		
			<h3> Enter the details to signup</h3>
			
			<div class="form-group">
			    <input type="text" name="name" class="form-control" id="exampleInputEmail1" 
			    aria-describedby="emailHelp" placeholder="Enter name">
		  	</div>
			
			<div class="form-group">
		    <input type="text" name="address" class="form-control" id="exampleInputEmail1" 
		    aria-describedby="emailHelp" placeholder="Enter Address">
		  </div>
		  
		  <div class="form-group">
		    <input type="text" name="mobilenumber" class="form-control" id="exampleInputEmail1" 
		    aria-describedby="emailHelp" placeholder="Enter Mobile Number">
		  </div>
		  
		  <div class="form-group">
		    <input type="email" name="email" class="form-control" id="exampleInputEmail1" 
		    aria-describedby="emailHelp" placeholder="Enter email">
		  </div>
		  
		  <div class="form-group">
		    <input type="password" name="password" class="form-control" id="exampleInputPassword1" 
		    placeholder="Enter password">
		  </div>
		  
  			<button type="submit" class="btn btn-primary">Submit</button>
  			
		</form>    
    </div>

    <!-- Optional JavaScript -->
    <!-- jQuery first, then Popper.js, then Bootstrap JS -->
    <script src="https://code.jquery.com/jquery-3.2.1.slim.min.js" integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN" crossorigin="anonymous"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js" integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q" crossorigin="anonymous"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js" integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl" crossorigin="anonymous"></script>
 
</body>
</html>