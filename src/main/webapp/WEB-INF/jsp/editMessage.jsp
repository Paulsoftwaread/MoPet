<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>

<jsp:include page="layout/navbar.jsp" />

<c:set var="contextRoot" value="${pageContext.request.contextPath}" />
<div class="container">

	<div class="row justify-content-center">
		<div class="col-9">
			<h1>新增訊息頁面</h1>
			<div class="card">
				<div class="card-header">請輸入新員工資訊</div>

				<div class="card-body">
					<!--  action="${contextRoot}會帶入/my-app，上面cset的值  -->
					<form:form class="form" method="post" modelAttribute="customer">
						<div class="card-header">姓名:</div>
						<div class="form-group">
							<form:textarea path="name" class="form-control" />
						</div>

						<div class="card-header">帳號(手機號碼):</div>
						<div class="form-group">
							<form:textarea path="accountphone" class="form-control" />
						</div>

						<div class="card-header">信箱:</div>
						<div class="form-group">
							<form:textarea path="email" class="form-control" />
						</div>

						<div class="card-header">生日:</div>
						<div class="form-group">
							<form:textarea path="birthday" class="form-control" />
						</div>

						<div class="card-header">性別:</div>
						<div class="form-group">
							<form:textarea path="gender" class="form-control" />
						</div>
						
						<div class="card-header">地址:</div>
						<div class="form-group">
							<form:textarea path="address" class="form-control" />
						</div>
						
							<div class="card-header">大頭貼:</div>
						<div class="form-group">
							<form:textarea path="image" class="form-control" />
						</div>

						<input type="submit" name="submit" value="更新員工資料">

					</form:form>

				</div>
			</div>

		</div>

	</div>

	<p />

</div>
