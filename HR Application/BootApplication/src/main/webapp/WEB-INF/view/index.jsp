<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"  %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>

<c:set var="hrManager" value="${pageContext.request.contextPath}/hrApplications/all"/>

<c:set var="applicantLogin" value="${pageContext.request.contextPath}/hrApplications/secure"/>

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="stylesheet"	href="//netdna.bootstrapcdn.com/bootstrap/3.0.0/css/bootstrap.min.css">
<title>HOME</title>
</head>
<body>

	
		
	<section>
		<div style="padding-left:50px;" class="col-md-6">

		<div class="jumbotron">
			<div class="container">
				<h1>HR Application</h1>
				<p>Welcome ! </p>
			</div>		
		</div>
		
		
	
			<a href="${hrManager}" class="btn btn-warning">HR Manager Login </a> 
			
			
			<a href="${applicantLogin}" class="btn btn-warning">Applicant Login</a>
		</div>	
		
	</section>



</body>
</html>


		
		
	
 