<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<jsp:include page="layout/navbar.jsp" />
<c:set var="contextRoot" value="${pageContext.request.contextPath}" />
<link href="${contextRoot}/css/bootstrap.min.css" rel="stylesheet">

<html>

<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>


<body>
	<br />

	<div class="container">

		<table class="table table-hover table-bordered">
			<thead class="table-secondary">
				<tr>
					<th scope="col">Id</th>
					<th scope="col">Name</th>
					<th scope="col">Account(phone)</th>
					<th scope="col">Email</th>
					<th scope="col">Birthday</th>
					<th scope="col">Gender</th>
					<th scope="col">Address</th>
					<th scope="col">Image</th>
					<th scope="col">Action</th>
				</tr>
			</thead>
			<tbody>
				<c:forEach var="customer" items="${page.content}">
					<tr>
						<td><c:out value="${customer.id}" /></td>
						<td><c:out value="${customer.name}" /></td>
						<td><c:out value="${customer.accountphone}" /></td>
						<td><c:out value="${customer.email}" /></td>
						<td><c:out value="${customer.birthday}" /></td>
						<td><c:out value="${customer.gender}" /></td>
						<td><c:out value="${customer.address}" /></td>
						<td><c:out value="${customer.image}" /></td>
						<td> 
						<a href="${contextRoot}/message/editMessage?id=${customer.id}"><button class="btn btn-info">編輯</button></a>
						<a onclick ="return confirm('真的要刪除嗎')" href="${contextRoot}/message/delete?id=${customer.id}"><button class="btn btn-danger">刪除</button></a>
						</td>
					</tr>

				</c:forEach>
			</tbody>
		    </table>
		
			<div class="col-9">
				<c:forEach var="pageNumber" begin="1" end="${page.totalPages}">

					<c:choose>
						<c:when test="${page.number != pageNumber-1}">
							<a href="${contextRoot}/message/all?p=${pageNumber}"> <c:out
									value="${pageNumber}" />
							</a>
						</c:when>

						<c:otherwise>
							<c:out value="${pageNumber}" />
						</c:otherwise>
					</c:choose>

					<c:if test="${pageNumber != page.totalPages}">
                      |
                    </c:if>

				</c:forEach>
			</div>
	
	</div>


	<script src="${contextRoot}/js/jquery-3.6.0.js"></script>
	<script src="${contextRoot}/js/bootstrap.bundle.min.js"></script>
</body>