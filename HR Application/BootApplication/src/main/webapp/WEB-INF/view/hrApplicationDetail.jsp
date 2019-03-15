<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="stylesheet"
	href="//netdna.bootstrapcdn.com/bootstrap/3.0.0/css/bootstrap.min.css">
<title>hrApplication</title>
</head>
<body>
	<section>
		<div class="jumbotron">
			<div class="container">
				<h1>hrApplication</h1>
			</div>
		</div>
	</section>
	<section class="container">
		<div class="row">
			<div class="col-md-5">
				
				<c:choose>
					
					<c:when test="${hrApplication ne null}">
										
					<h3><strong>Job Title : </strong>${hrApplication.jobTitle}</h3>
						<p>
						<strong>Number Of People : </strong>${hrApplication.numberOfPeople}
					</p>
						
					<p><strong>Job Description : </strong>${hrApplication.jobDescription}</p>
							
					<h4><strong>Last Date : </strong><span class="label label-warning">${hrApplication.lastDate}</span></h4>
					<p>
						 <a href="<spring:url value="../" />" class="btn btn-default">
							<span class="glyphicon-hand-left glyphicon"></span> Back
						</a>
	
					</p>
					
					</c:when>
					
					<c:otherwise>
										
					</c:otherwise>
					
				</c:choose>
				
			</div>
		</div>
	</section>
</body>
</html>
