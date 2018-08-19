<%-- 
    Document   : index
    Created on : 08/08/2018, 4:50:26 PM
    Author     : Saruga
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="utf-8">
	<title>Dropdowns 3: Prettying it up</title>
	<style>
		* {
			margin: 0;
			padding: 0;
		}
	
		body {
			font: 300 15px/1.5 "Helvetica Neue", helvetica, arial, sans-serif;
			background: #333;
			margin: 15px;
		}
	
		article {
			width: 800px;
			margin: 0 auto;
			background: #000;
			color: #fff;
			border-radius: 5px;
			box-shadow: 0 0 15px 2px #666;
		}
	
		section {
			clear: left;
		}
	
		h1 {
			font-size: 45px;
			font-weight: 100;
			letter-spacing: 10px;
			text-align: center;

		}

		

		
	
		a {
			color: #06c;
		}
	
		#main_nav ul {
			background: white;
			float: left;
			-webkit-transition: .5s;
			transition: .5s;
		}
	
		#main_nav li {
			float: left;
			position: relative;
			width: 400px;
			list-style: none;
			-webkit-transition: .5s;
			transition: .5s;
			
		}
	
		#main_nav > ul > li > a, h1 {
			text-transform: uppercase;
		}
	
		#main_nav a {
			display: block;
			text-decoration: none;
			padding: 5px 15px;
			color: #000;
		}

		#main_nav ul ul {
			position: absolute;
			left: 0;
			top: 100%;
			visibility: hidden;
			opacity: 0;
		}
	
		#main_nav ul ul ul {
			left: 100%;
			top: 0;
		}
	
		#main_nav li:hover, #main_nav li:hover li {
			background: #ddd;
		}
	
		#main_nav li li:hover, #main_nav li li:hover li {
			background: #bbb;
		}
	
		#main_nav li li li:hover {
			background: #999;
		}
	
		#main_nav li:hover > ul {
			visibility: visible;
			opacity: 1;
		}
	</style>
	<!--[if lt IE 9]><script src="/r10/html5shiv.js"></script><![endif]-->
</head>
<body>
	<article>
		<h1>LIBRARY SYSTEM</h1>

		<nav id="main_nav">
			<ul>
				<li>
					<a href="">BOOKS</a>
					<ul>
						<li><a href="classificationController">Add Book</a></li>
						<li><a href="">Search Book</a></li>
						<li><a href="">Edit Book</a></li>
					</ul>
				</li>
				
				
				<li>
					<a href="">CLASSIFICATION</a>
					<ul>
						<li>
							<a href="">MainClassification</a>
							<ul>
								<li><a href="./addMain.jsp">Add</a></li>
								<li><a href="">Edit</a></li>
							</ul>
						</li>
						<li>
							<a href="">SubClassification</a>
							<ul>
								<li><a href="./addSub.jsp">Add</a></li>
								<li><a href="">Edit</a></li>
							</ul>
						</li>
						
					</ul>
				</li>
			</ul>
		</nav>
	
		
		
	</article>
</body>
</html>
