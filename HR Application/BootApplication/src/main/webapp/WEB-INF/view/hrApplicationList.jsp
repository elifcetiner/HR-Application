<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<c:set var="hrApplicationsAll" value="${pageContext.request.contextPath}/hrApplications/all"/>

<c:set var="hrApplicationsAdd" value="${pageContext.request.contextPath}/hrApplications/add"/>

<c:set var="hrAplicantsAll" value="${pageContext.request.contextPath}/applicants/all"/>

<c:set var="hrApplicationsOut" value="${pageContext.request.contextPath}/logout"/>

<c:set var="home" value="${pageContext.request.contextPath}/"/>



<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="stylesheet"
	href="//netdna.bootstrapcdn.com/bootstrap/3.0.0/css/bootstrap.min.css">

<title>HR Application</title>
</head>
<body>
	<section>
		<div class="jumbotron">
			<div class="container">
				<h1>HR Application</h1>
				<p>Available HR Application</p>
			</div>
		</div>
	</section>

    <div id="wrapper">

		
	<div id="page-content-wrapper">
	<section class="container">
	
		<div class="row">
		<div class="col-md-9">
			<ul class="nav nav-tabs">
				  <li class="">
					<a href="${home}">Home</a>
				</li>	
				
				<li class="">
					<a href="${hrApplicationsAll}">All HR Application</a>
				</li>
				
				<li class="">
					<a href="${hrAplicantsAll}">All Applicants</a>
				</li>
				
				<li class="">
					<a href="${hrApplicationsAdd}">Add HR Application</a>
				</li>			
				
				<li class="">
			      <a href="${hrApplicationsOut}">Sign Out</a>
        			</li>	
				
				
			
			</ul>
		</div>
	</div>
	
		<div class="row">
			<c:forEach items="${hrApplications}" var="hrApplications">
				<div class="col-sm-6 col-md-3" style="padding-bottom: 15px">
					<div class="thumbnail">
						<div class="caption">
							<h3>${hrApplications.jobTitle}</h3>
							<p><strong>Last Date : </strong>${hrApplications.lastDate}</p>
							<p><strong>Number Of People : </strong>${hrApplications.numberOfPeople}</p>
							<p>
								<a
									href=" <c:url value="/hrApplications/hrApplication?hrApplicationId=${hrApplications.hrApplicationId}" /> "
									class="btn btn-primary"> <span
									class="glyphicon-info-sign glyphicon" /></span> Details
								</a>
								
									<a
									href=" <c:url value="/hrApplications/deleteHrApplication?hrApplicationId=${hrApplications.hrApplicationId}" /> "
									class="btn btn-danger"> <span
									class="glyphicon glyphicon-remove-sign" /></span> Delete
								</a>
							
							</p>

						</div>
					</div>
				</div>
			</c:forEach>
		</div>
		</section>
		</div>
	</div>
</body>
</html>
