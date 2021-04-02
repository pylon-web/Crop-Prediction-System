<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<title>Farmer Login Page</title>
	<!-- Meta tag Keywords -->
	<meta name="viewport" content="width=device-width, initial-scale=1">
	<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
	<meta name="keywords" content="Effective Login Form Responsive Widget,Login form widgets, Sign up Web forms , Login signup Responsive web form,Flat Pricing table,Flat Drop downs,Registration Forms,News letter Forms,Elements"
	/>
	<script>
		addEventListener("load", function () {
			setTimeout(hideURLbar, 0);
		}, false);

		function hideURLbar() {
			window.scrollTo(0, 1);
		}
	</script>
	<!-- Meta tag Keywords -->
	<!-- css files -->
	<link rel="stylesheet" href="Logcss/css/style.css" type="text/css" media="all" />
	<!-- Style-CSS -->
	<link rel="stylesheet" href="Logcss/css/font-awesome.css">
	<!-- Font-Awesome-Icons-CSS -->
	<!-- //css files -->
	<!-- web-fonts -->
	<link href="//css.fonts.googleapis.com/css?family=Open+Sans:300,300i,400,400i,600,600i,700,700i,800,800i" rel="stylesheet">
	<!-- //web-fonts -->
</head>

<body>
	<div class="video-w3l" data-vide-bg="Logcss/video/signup">
		<!--header-->
		<div class="header-w3l">
			<h1>
				<span>A</span>griculture
				<span>L</span>ogin
				<span>F</span>orm
			</h1>
		</div>
		<!--//header-->
		<div class="main-content-agile">
			<div class="sub-main-w3">
				<h2>Login Here
					<i class="fa fa-hand-o-down" aria-hidden="true"></i>
				</h2>
				<form action="LoginServlet" method="post">
					<div class="pom-agile">
						<span class="fa fa-user-o" aria-hidden="true"></span>
						<input type="text" placeholder="Username" name="userName" class="user" type="text" required="">
					</div>
					<div class="pom-agile">
						<span class="fa fa-key" aria-hidden="true"></span>
						<input type="password" placeholder="Password" name="password" class="pass" type="password" required="">
					</div>
					<div class="sub-w3l">

						<a href="#">Forgot Password?</a>
						<div class="clear"></div>
					</div>
					<div class="right-w3l">
						<input type="submit" value="Login">
					</div>
				</form>
			</div>
		</div>
		<!--//main-->
		
	</div>

	<!-- js -->
	<script src="Logcss/js/jquery-2.1.4.min.js"></script>
	<script src="Logcss/js/jquery.vide.min.js"></script>
	<!-- //js -->

</body>
</html>