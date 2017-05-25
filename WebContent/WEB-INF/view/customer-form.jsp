<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Save Customer</title>

<link style="text/css" rel="stylesheet"
	href="${pageContext.request.contextPath}/resources/css/style.css">
<link style="text/css" rel="stylesheet"
	href="${pageContext.request.contextPath}/resources/css/add-customer-style.css">

</head>
<body>


<div id="wrapper">
<div id="header">
<h2>CRM - Customer Relationship Manager</h2>
</div>
</div>

<div id="container">
<h3>Save Customer</h3>
<form:form action="saveCustomer" modelAttribute="customer">
	<form:hidden path="id"/>
		<table>
			<tbody>
				<tr>
					<td><label>First Name:</label></td>
					<td><form:input path="firstName" /></td>
				</tr>
				<tr>
					<td><label>Last Name:</label></td>
					<td><form:input path="lastName" /></td>
				</tr>
				<tr>
					<td><label>Email:</label></td>
					<td><form:input path="email" /></td>
				</tr>
				<tr>
					<td><label></label></td>
					<td><input type="submit" value="Save"></td>
				</tr>
			</tbody>
		</table>

	</form:form>
	<div style="clear; both;"></div>
	<p>
	<a href="${pageContext.request.contextPath}/customer/list">Back to list</a>
	</p>
</div>
	


</body>
</html>