<!--A Design by W3layouts
Author: W3layout
Author URL: http://w3layouts.com
License: Creative Commons Attribution 3.0 Unported
License URL: http://creativecommons.org/licenses/by/3.0/
-->
<!DOCTYPE html>
<html lang="en">
<head>
<title>Soil Data Set</title>
<meta name="viewport" content="width=device-width, initial-scale=1">
<meta charset="utf-8">
<meta name="keywords" content="Harvest Life Responsive web template, Bootstrap Web Templates, Flat Web Templates, Android Compatible web template, 
Smartphone Compatible web template, free webdesigns for Nokia, Samsung, LG, SonyEricsson, Motorola web design" />
<script type="application/x-javascript"> addEventListener("load", function() { setTimeout(hideURLbar, 0); }, false); function hideURLbar(){ window.scrollTo(0,1); } </script>
<!-- bootstrap-css -->
<link href="css/bootstrap.css" rel="stylesheet" type="text/css" media="all" />
<!--// bootstrap-css -->
<!-- css -->
<link rel="stylesheet" href="css/style.css" type="text/css" media="all" />
<!--// css -->
<link rel="stylesheet" href="css/lightbox.css">
<!-- font-awesome icons -->
<link href="css/font-awesome.css" rel="stylesheet"> 
<!-- //font-awesome icons -->
<!-- font -->
<link href="//fonts.googleapis.com/css?family=Playball&amp;subset=latin-ext" rel="stylesheet">
<link href="//fonts.googleapis.com/css?family=Raleway:100,100i,200,200i,300,300i,400,400i,500,500i,600,600i,700,700i,800,800i,900,900i" rel="stylesheet">
<link href='//fonts.googleapis.com/css?family=Roboto+Condensed:400,700italic,700,400italic,300italic,300' rel='stylesheet' type='text/css'>
<!-- //font -->
<script src="js/jquery-1.11.1.min.js"></script>
<script src="js/bootstrap.js"></script>
<script type="text/javascript">
	jQuery(document).ready(function($) {
		$(".scroll").click(function(event){		
			event.preventDefault();
			$('html,body').animate({scrollTop:$(this.hash).offset().top},1000);
		});
	});
</script> 
<!--[if lt IE 9]>
  <script src="https://oss.maxcdn.com/libs/html5shiv/3.7.0/html5shiv.js"></script>
<![endif]-->
<%@ page import="java.sql.*" %> 
<%@ page import="java.io.*" %> 
</head>
<body>
	<!-- banner -->
	<div class="banner about-banner">
	
		<div class="header">
			<div class="container">
				<div class="header-left">
					<div class="w3layouts-logo">
						<h1>
							<a href="#">Agriculture <span><sup>Life</sup></span></a>
						</h1>
					</div>
				</div>
				
				<div class="clearfix"> </div>
			</div>
		</div>
		<div class="header-bottom">
			<div class="container">
				<div class="top-nav">
						<nav class="navbar navbar-default">
								<div class="navbar-header">
									<button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#bs-example-navbar-collapse-1">
										<span class="sr-only">Toggle navigation</span>
										<span class="icon-bar"></span>
										<span class="icon-bar"></span>
										<span class="icon-bar"></span>
									</button>
								</div>
							<!-- Collect the nav links, forms, and other content for toggling -->
							<div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">
								<ul class="nav navbar-nav">
																		
									<li class=""><a class="active list-border" href="#" class="dropdown-toggle hvr-bounce-to-bottom" data-toggle="dropdown" role="button" aria-haspopup="true" aria-expanded="false">All Crops<span class="caret"></span></a>
										<ul class="dropdown-menu">
											<li><a class="hvr-bounce-to-bottom" href="farmer_Gallery01.jsp">Fruits</a></li>          
										
											<li><a class="hvr-bounce-to-bottom" href="farmer_Gallery02.jsp">Flowers</a></li>          
										
											<li><a class="hvr-bounce-to-bottom" href="farmer_Gallery03.jsp">Vegetables</a></li>          
										
											<li><a class="hvr-bounce-to-bottom" href="farmer_Gallery04.jsp">Other Crops</a></li>          
										</ul>
									</li>	
									
									
									<li class=""><a href="#" class="dropdown-toggle hvr-bounce-to-bottom" data-toggle="dropdown" role="button" aria-haspopup="true" aria-expanded="false">Prediction's<span class="caret"></span></a>
										<ul class="dropdown-menu">
											<li><a class="hvr-bounce-to-bottom" href="#">Crop Yield Prediction</a></li>
											<li><a class="hvr-bounce-to-bottom" href="predictionCrop.jsp">Crop Prediction</a></li>        
										</ul>
									</li>
									
									<li class=""><a href="#" class="dropdown-toggle hvr-bounce-to-bottom" data-toggle="dropdown" role="button" aria-haspopup="true" aria-expanded="false">DataSets<span class="caret"></span></a>
										<ul class="dropdown-menu">
											<li><a class="hvr-bounce-to-bottom" href="data_soil.jsp">Soil DataSet</a></li> 
											<li><a class="hvr-bounce-to-bottom" href="data_rainfall.jsp">Rainfall DataSet</a></li>
											<li><a class="hvr-bounce-to-bottom" href="data_crops.jsp">Crop DataSet</a></li>
										</ul>
									</li>
									
														
									<li class=""><a href="#" class="dropdown-toggle hvr-bounce-to-bottom" data-toggle="dropdown" role="button" aria-haspopup="true" aria-expanded="false">Agro Blogs<span class="caret"></span></a>
										<ul class="dropdown-menu">
											<li><a class="hvr-bounce-to-bottom" href="farmer_TextBlog.jsp">Textual blogs</a></li>          
											<li><a class="hvr-bounce-to-bottom" href="farmer_VidBlog.jsp">Video Blogs</a></li>
											<li><a class="hvr-bounce-to-bottom" href="farmer_VidBlog02.jsp">Govt Schemes</a></li>                          
										</ul>
									</li>	
									
									<li class=""><a href="#" class="dropdown-toggle hvr-bounce-to-bottom" data-toggle="dropdown" role="button" aria-haspopup="true" aria-expanded="false">Help<span class="caret"></span></a>
										<ul class="dropdown-menu">
											<li><a class="hvr-bounce-to-bottom" href="farmer_About.jsp">About</a></li>
											<li><a class="hvr-bounce-to-bottom" href="farmer_Contact.jsp">Contact</a></li> 
											<li><a class="hvr-bounce-to-bottom" href="faq.jsp">Submit FAQ</a></li>
											<li><a class="hvr-bounce-to-bottom" href="faq01.jsp">View FAQ</a></li>
										</ul>
									</li>	
						
									<li><a href="home.jsp"  role="button" aria-haspopup="true" aria-expanded="false">Logout</a></li>	
						
								</ul>	
								<div class="clearfix"> </div>
							</div>	
					</nav>		
				</div>
			</div>
		</div>
	</div>
	<!--  Banner -->
<!-- a-about -->
	<div class="about-heading">	
		<div class="container">
			<h2>Soil DataSet</h2>
		</div>
	</div>
	<div class="blog">
	<div class="container">
	
		<form action="#">
    
						<%
						try
						{
						Class.forName("com.mysql.jdbc.Driver");
						String url="jdbc:mysql://localhost:3306/crop_system";
						String username="root";
						String password="sj5538";
						String query="select * from soil_types";
						Connection conn=DriverManager.getConnection(url,username,password);
						Statement stmt=conn.createStatement();
						ResultSet rs=stmt.executeQuery(query);
						%>
				<table class="table table-striped  table-hover" border="8">
						    <thead>						    
						      <tr bgcolor="#FFD700">
						        <th>Id</th>
						        <th>Soil Name</th>
						        <th>Color</th>
						        <th>Soil Type</th>
						        <th>Nitrogen(N) (kg/ha)</th> 
						        <th>Phosphorus(P)(kg/ha)</th>
						        <th>potassium(K)(kg/ha)</th> 
						       </tr>
						    </thead>
						
						   
						<%
						while (rs.next()) {
						%>
						<TR class="danger">
						<TD><%=rs.getInt(1)%></TD>
						<TD><%=rs.getString(2)%></TD>
						<TD><%=rs.getString(3)%></TD>
						<TD><%=rs.getString(4)%></TD>
						<TD><%=rs.getDouble(5)%></TD>
						<TD><%=rs.getDouble(6)%></TD>
						<TD><%=rs.getDouble(7)%></TD>
						</TR>
						<% }
						// close all the connections.
						rs.close();
						stmt.close();
						conn.close();
						} catch (Exception ex){
							out.println("Unable to connect to database.");
						}
						%>
	
				</TABLE>
		</form>		
			<div class="clearfix"> </div>
			</div>		
	</div>


	
		<script src="js/lightbox-plus-jquery.min.js"> </script>
	<script src="js/SmoothScroll.min.js"></script>
	<script type="text/javascript" src="js/move-top.js"></script>
	<script type="text/javascript" src="js/easing.js"></script>
	<!-- here stars scrolling icon -->
	<script type="text/javascript">
		$(document).ready(function() {
			/*
				var defaults = {
				containerID: 'toTop', // fading element id
				containerHoverID: 'toTopHover', // fading element hover id
				scrollSpeed: 1200,
				easingType: 'linear' 
				};
			*/
								
			$().UItoTop({ easingType: 'easeOutQuart' });
								
			});
	</script>
	<!-- //here ends scrolling icon -->
</body>	
</html>