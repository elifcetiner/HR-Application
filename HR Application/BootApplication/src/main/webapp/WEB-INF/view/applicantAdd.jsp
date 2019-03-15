<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"  %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="stylesheet"	href="//netdna.bootstrapcdn.com/bootstrap/3.0.0/css/bootstrap.min.css">
<title>Applicant Add</title>
</head>
<body>
	<section>
		<div class="jumbotron">
			<div class="container">
				<h1>Applicant</h1>
			</div>		
		</div>
	</section>
	<section class="container">
		<!-- watch out modelAttribute ! -->
		<form:form  modelAttribute="newApplicant" class="form-horizontal" method="post" action="/applicants/save">
			<fieldset>
				<legend>Add New Applicant</legend>

				<div class="form-group">					
					<div class="col-lg-10">
						<form:input  id="applicantId" path="applicantId" type="hidden" class="form:input-large"/>
					</div>
				</div>			

				<div class="form-group">
					<label class="control-label col-lg-2" for="name">Name</label>
					<div class="col-lg-10">
						<form:input id="name" path="name" type="text" class="form:input-large"/>
					</div>
				</div>
				
				
				<div class="form-group">
					<label class="control-label col-lg-2" for="email">Email</label>
					<div class="col-lg-10">
						<form:input id="email" path="email" type="text" class="form:input-large"/>
					</div>
				</div>
								
				<div class="form-group">
					<label class="control-label col-lg-2" for="phone">Phone</label>
					<div class="col-lg-10">
						<form:input id="phone" path="phone" type="text" class="form:input-large"/>
					</div>
				</div>
				 
				<div class="form-group">
					 <label class="control-label col-lg-2" for="jobTitle">Select HR Application</label>
					<div class="col-lg-10">
						 <form:select path="jobTitle">    
                               <c:forEach items="${hrApplications}" var="hrApplication">
                               
                                <option value="${hrApplication.jobTitle}">${hrApplication.jobTitle}</option>
                            </c:forEach>
                               <form:input  id="jobTitle" path="jobTitle" value="${hrApplication.jobTitle}" type="hidden" class="form:input-large"/>
                         </form:select>
					</div>
				</div>			  
				  
				<div class="form-group">
					<label class="control-label col-lg-2" for="address">Address</label>
					<div class="col-lg-10">
						<form:textarea id="address" path="address" rows = "3" cols="50px"/>
					</div>
				</div>
			
				<div class="form-group">
					<label class="control-label col-lg-2" for="thoughtsOnJob">Thoughts On Job</label>
					<div class="col-lg-10">
						<form:textarea id="thoughtsOnJob" path="thoughtsOnJob" rows = "7" cols="150px"/>
					</div>
				</div>			
					
				<div class="form-group">
					<div class="col-lg-offset-2 col-lg-10">
						<input type="submit" id="btnAdd" class="btn btn-primary" value ="Add"/>
					 <a href="<spring:url value="/hrApplications/secure" />" class="btn btn-default">
							<span class="glyphicon-hand-left glyphicon"></span> Back
						</a>
						
					</div>
					
					
				</div>
					
					
				
			</fieldset>
		</form:form>
	</section>
</body>
</html>
