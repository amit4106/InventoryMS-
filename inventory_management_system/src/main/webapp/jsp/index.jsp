<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<link href="/css\index.css" rel="stylesheet">
<meta name="viewport" content="width=device-width, initial-scale=1">
<title>index</title>
</head>
<body>
	<form action="login.ims" method="post">
		<div class="wrapper fadeInDown">
			<div id="formContent">

				<!-- Tabs Titles -->
				<h2 class="active">Sign In</h2>
				<h2 class="inactive underlineHover">Sign Up</h2>


				<!-- Login Form -->
				<form>
					<input type="text" id="login" class="fadeIn second" name="username" placeholder="login"> 
					<input type="password" id="password" class="fadeIn third" name="password" placeholder="password">
					<input type="submit" class="fadeIn fourth" value="Log In">
				</form>
				<!-- Remind Passowrd -->
				<div id="formFooter">
					<a class="underlineHover" href="#">Forgot Password?</a>
				</div>
			</div>
		</div>
	</form>
</body>
</html>