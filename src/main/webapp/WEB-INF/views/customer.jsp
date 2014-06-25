<%@ page language="java" contentType="text/html; charset=utf8"
	pageEncoding="utf8"%>
<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=utf8">
		<title>Cust</title>
	</head>
	
	<body>
		
		<c:if test="${!empty customerList}">
			<table class="data">
				<tr>
					<th><spring:message code="label.name" /></th>
					<th><spring:message code="label.address" /></th>
					<th><spring:message code="label.city" /></th>
					<th><spring:message code="label.state" /></th>
					<th><spring:message code="label.zip" /></th>
					<th><spring:message code="label.country" /></th>
					<th><spring:message code="label.email" /></th>
				</tr>
				<c:forEach items="${customerList}" var="customer">
					<tr>
						<td>${customer.name}</td>
						<td>${customer.address}</td>
						<td>${customer.city}</td>
						<td>${customer.state}</td>
						<td>${customer.zip}</td>
						<td>${customer.country}</td>
						<td>${customer.email}</td>
						<td>
							<form action="customers/${customer.id}" method="post">
								<p><input type="submit"></p>
							</form>
						</td>
					</tr>
				</c:forEach>
			</table>	
		</c:if>
		<form action="customers/add" method="post">
			<p><input type="submit"></p>
		</form>
	</body>
</html>