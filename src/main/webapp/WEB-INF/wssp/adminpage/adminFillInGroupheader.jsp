<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt"  prefix="fmt"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<meta charset="utf-8">
		<link rel="icon" type="image/png" href="${pageContext.request.contextPath }/static/img/hardworking.png">
		<title>区域组长指派</title>
		<meta content="width=device-width, initial-scale=1.0, maximum-scale=1.0, user-scalable=0" name="viewport" />

		<link href="${pageContext.request.contextPath }/static/css/bootstrap.min.css" rel="stylesheet" />
		<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath }/static/css/style.css" />
		<script type="text/javascript" src="${pageContext.request.contextPath }/static/js/jquery-1.11.2.min.js"></script>
		<script type="text/javascript" src="${pageContext.request.contextPath }/static/js/bootstrap.min.js"></script>
		<script src="${pageContext.request.contextPath }/static/js/main.js" type="text/javascript" charset="utf-8"></script>
	</head>
	<body>
		<div class="table-responsive bg-info">
			<table class="table table-bordered">

				<thead>
					<tr class="text-center">
						<td colspan="4"><button class="btn btn-success paid-btn" type="button">区域组长指派</button></td>
					</tr>
					<tr>
						<th class="text-center">选择组长</th>
						<th class="text-center">选择管理区域</th>
						<th class="text-center">操作</th>
					</tr>
				</thead>
				<tbody class="text-center paid-wages">
					<tr>
						<form action="${pageContext.request.contextPath }/target/addHeader.do" method="post">
							<td>
								<%-- <select name="">
									<c:forEach items="${grouplist}" var="list">
										<option value="${list.gid}"><span>${list.student.sname}</span>${list.gid}</option>
									</c:forEach>
									
<!-- 									<option value="1614011216"><span>李书宇</span>1614011216</option>
									<option value="1614011011"><span>赵思智</span>1614011011</option> -->
								</select> --%>
								<select name="gid">
									<c:forEach items="${liststudent}" var="liststudent">
										<option value="${liststudent.sid}"><span>${liststudent.sname}</span>${liststudent.sid}</option>
									</c:forEach>
								</select>
							</td>
							<td>
								<select name="anumber" id="">
									<c:forEach items="${list7}" var="list7">
										<option value="${list7.number}"><span>${list7.position}</span>&nbsp;&nbsp;&nbsp;${list7.number}</option>
									</c:forEach>
									<!-- <option value="1011201"><span>区域一</span>1011201</option>
									<option value="1011202"><span>区域二</span>1011202</option> -->
								</select>
							</td>
							<td>
								<input class="btn btn-success" type="submit" value="提交" />
							</td>
						</form>
					</tr>
						

					<!-- 判断是否为空 -->

					<tr class="text-center">
						<td colspan="4"><button class="btn btn-success paid-btn" type="button">已指派内容</button></td>
					</tr>

					
						<form action="${pageContext.request.contextPath }/target/deleteHeader.do" method="post">
							<c:forEach items="${grouplist}" var="list">
							<tr>
							<td>
								<span>${list.student.sname}</span>${list.gid}
								<input type="hidden" name="gid" id="" value="${list.gid}" />
							</td>
							<td>
								<option value="${list.anumber}">${list.area}</option>
								<input type="hidden" name="anumber" id="" value="${list.anumber}" />
							</td>
							<td>			
								<input class="btn btn-warning" type="submit" value="删除" />
							</td>
							</tr>
							</c:forEach>
						</form>
					


					<!-- 结束 -->

				</tbody>
			</table>
		</div>
	</body>
</html>
