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
					
					<c:when test="${applicantBean ne null}">
										
					<h3><strong>Name : </strong>${applicantBean.name}</h3>
					<p><strong>Email : </strong>${applicantBean.email}</p>
				    <p><strong>Address : </strong>${applicantBean.address}</p>					
			     	<p><strong>Phone : </strong>${applicantBean.phone}</p>
			     	
			     	<p><strong>Thoughts On Job : </strong>${applicantBean.thoughtsOnJob}</p>
			
		     		<h4><strong>Job Title : </strong><span class="label label-warning">${applicantBean.jobTitle}</span></h4>
									
					<p>
						 <a href="<spring:url value="/applicants/all" />" class="btn btn-default">
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
