<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"  %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="stylesheet"	href="//netdna.bootstrapcdn.com/bootstrap/3.0.0/css/bootstrap.min.css">
<title>HR Application Add Page</title>
</head>
<body>
	<section>
		<div class="jumbotron">
			<div class="container">
				<h1>HR Application</h1>
				<p>Add HR Application</p>
			</div>		
		</div>
	</section>
	<section class="container">
		<!-- watch out modelAttribute ! -->
		<form:form  modelAttribute="newHrApplication" class="form-horizontal" method="post" action="/hrApplications/save">
			<fieldset>
				<legend>Add New HR Application</legend>

				<div class="form-group">					
					<div class="col-lg-10">
						<form:input  id="hrApplicationId" path="hrApplicationId" type="hidden" class="form:input-large"/>
					</div>
				</div>

				<div class="form-group">
					<label class="control-label col-lg-2" for="jobTitle">Job Title</label>
					<div class="col-lg-10">
						<form:input id="jobTitle" path="jobTitle" type="text" class="form:input-large"/>
					</div>
				</div>
			
				<div class="form-group">
					<label class="control-label col-lg-2" for="jobDescription">Job Description</label>
					<div class="col-lg-10">
						<form:textarea id="jobDescription" path="jobDescription" rows = "7" cols="150px"/>
					</div>
				</div>

		
				<div class="form-group">
					<label class="control-label col-lg-2" for="numberOfPeople">Number Of People</label>
					<div class="col-lg-10">
						<form:input id="numberOfPeople" path="numberOfPeople" type="text" class="form:input-large"/>
					</div>
				</div>
				
					
				<div class="form-group">
					<div class="col-lg-10">
						<form:input id="lastDate" path="lastDate" type="hidden" class="form:input-large"/>
					</div>
				</div>

		
				<div class="form-group">
					<div class="col-lg-offset-2 col-lg-10">
						<input type="submit" id="btnAdd" class="btn btn-primary" value ="Add"/>
					 <a href="<spring:url value="/hrApplications/all" />" class="btn btn-default">
							<span class="glyphicon-hand-left glyphicon"></span> Back
						</a>
					</div>
					
					
				</div>
					
					
				
			</fieldset>
		</form:form>
	</section>
</body>
</html>
