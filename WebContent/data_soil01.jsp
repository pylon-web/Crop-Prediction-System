<!--A Design by W3layouts
Author: W3layout
Author URL: http://w3layouts.com
License: Creative Commons Attribution 3.0 Unported
License URL: http://creativecommons.org/licenses/by/3.0/
-->
<!DOCTYPE html>
<html lang="en">
<head>
<title>Admin Soil Data</title>
<meta name="viewport" content="width=device-width, initial-scale=1">
<meta charset="utf-8">
<meta name="keywords" content="Harvest Life Responsive web template, Bootstrap Web Templates, Flat Web Templates, Android Compatible web template, 
Smartphone Compatible web template, free webdesigns for Nokia, Samsung, LG, SonyEricsson, Motorola web design" />
<script type="application/x-javascript"> addEventListener("load", function() { setTimeout(hideURLbar, 0); }, false); function hideURLbar(){ window.scrollTo(0,1); } </script>
<!-- bootstrap-css -->
<link href="home2/css/bootstrap.css" rel="stylesheet" type="text/css" media="all" />
<!--// bootstrap-css -->
<!-- css -->
<link rel="stylesheet" href="home2/css/style.css" type="text/css" media="all" />
<!--// css -->
<link rel="stylesheet" href="home2/css/lightbox.css">
<!-- font-awesome icons -->
<link href="home2/css/font-awesome.css" rel="stylesheet"> 
<!-- //font-awesome icons -->
<!-- font -->
<link href="//fonts.googleapis.com/css?family=Playball&amp;subset=latin-ext" rel="stylesheet">
<link href="//fonts.googleapis.com/css?family=Raleway:100,100i,200,200i,300,300i,400,400i,500,500i,600,600i,700,700i,800,800i,900,900i" rel="stylesheet">
<link href='//fonts.googleapis.com/css?family=Roboto+Condensed:400,700italic,700,400italic,300italic,300' rel='stylesheet' type='text/css'>
<!-- //font -->
<script src="home2/js/jquery-1.11.1.min.js"></script>
<script src="home2/js/bootstrap.js"></script>
<script type="text/javascript">
	jQuery(document).ready(function($) {
		$(".scroll").click(function(event){		
			event.preventDefault();
			$('html,body').animate({scrollTop:$(this.hash).offset().top},1000);
		});
	});
</script> 
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
											<li><a class="hvr-bounce-to-bottom" href="admin_Gallery01.jsp">Fruits</a></li>          
										
											<li><a class="hvr-bounce-to-bottom" href="admin_Gallery02.jsp">Flowers</a></li>          
										
											<li><a class="hvr-bounce-to-bottom" href="admin_Gallery03.jsp">Vegetables</a></li>          
										
											<li><a class="hvr-bounce-to-bottom" href="admin_Gallery04.jsp">Other Crops</a></li>          
										</ul>
									</li>	
									
									
									
									<li class=""><a href="#" class="dropdown-toggle hvr-bounce-to-bottom" data-toggle="dropdown" role="button" aria-haspopup="true" aria-expanded="false">Crop DataSet<span class="caret"></span></a>
										<ul class="dropdown-menu">
											<li><a class="hvr-bounce-to-bottom" href="data_soil01.jsp">Soil DataSet</a></li> 
											<li><a class="hvr-bounce-to-bottom" href="data_rainfall01.jsp">Rainfall DataSet</a></li>
											<li><a class="hvr-bounce-to-bottom" href="data_crops01.jsp">Crops DataSet</a></li>     
										</ul>
									</li>
									
									<li class=""><a href="#" class="dropdown-toggle hvr-bounce-to-bottom" data-toggle="dropdown" role="button" aria-haspopup="true" aria-expanded="false">Train DataSet<span class="caret"></span></a>
										<ul class="dropdown-menu">
											<li><a class="hvr-bounce-to-bottom" href="SVM_Train_Algorithm01">Train Soil DataSet</a></li> 
											<li><a class="hvr-bounce-to-bottom" href="SVM_Train_Algorithm02">Train Rainfall DataSet</a></li>
											<li><a class="hvr-bounce-to-bottom" href="trainResultSoil.jsp">View Soil DataSet</a></li>   
											<li><a class="hvr-bounce-to-bottom" href="trainResultRainfall.jsp">View Rainfall DataSet</a></li>     
										</ul>
									</li>
									
									<li class=""><a href="#" class="dropdown-toggle hvr-bounce-to-bottom" data-toggle="dropdown" role="button" aria-haspopup="true" aria-expanded="false">Farmer Details<span class="caret"></span></a>
										<ul class="dropdown-menu">
											<li><a class="hvr-bounce-to-bottom" href="farmers.jsp">View Farmers</a></li>     
											<li><a class="hvr-bounce-to-bottom" href="admin_Text.jsp">Textual blogs</a></li>          
											<li><a class="hvr-bounce-to-bottom" href="admin_Vid.jsp">Video Blogs</a></li>
											<li><a class="hvr-bounce-to-bottom" href="admin_Vid01.jsp">Govt Schemes</a></li>		        
										</ul>
									</li>
							
									<li class=""><a href="#" class="dropdown-toggle hvr-bounce-to-bottom" data-toggle="dropdown" role="button" aria-haspopup="true" aria-expanded="false">FAQ's<span class="caret"></span></a>
										<ul class="dropdown-menu">
											<li><a class="hvr-bounce-to-bottom" href="faq_view.jsp">View FAQ</a></li>
											<li><a class="hvr-bounce-to-bottom" href="faq_resolve.jsp">Resolve FAQ</a></li>         
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
	<!-- //banner -->
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
	
		<script src="home2/js/lightbox-plus-jquery.min.js"> </script>
	<script src="home2/js/SmoothScroll.min.js"></script>
	<script type="text/javascript" src="home2/js/move-top.js"></script>
	<script type="text/javascript" src="home2/js/easing.js"></script>
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