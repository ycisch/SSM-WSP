<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<meta charset="utf-8" />
		<link rel="icon" type="image/png" href="${pageContext.request.contextPath }/static/img/hardworking.png">
		<meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1" />
		<title>报岗信息</title>
		<meta content="width=device-width, initial-scale=1.0, maximum-scale=1.0, user-scalable=0" name="viewport" />
		<link href="${pageContext.request.contextPath }/static/css/bootstrap.min.css" rel="stylesheet" />
		<link rel="stylesheet" href="${pageContext.request.contextPath }/static/css/reset.css"> <!-- CSS reset -->
		<link rel="stylesheet" href="${pageContext.request.contextPath }/static/css/style.css"> <!-- Resource style -->
		<script type="text/javascript" src="${pageContext.request.contextPath }/static/js/jquery-2.1.1.js"></script>
		<script type="text/javascript" src="${pageContext.request.contextPath }/static/js/main.js"></script>

		<link href="${pageContext.request.contextPath }/static/css/fresh-bootstrap-table.css" rel="stylesheet" />
		<link href="${pageContext.request.contextPath }/static/css/font-awesome.min.css" rel="stylesheet">

		<script type="text/javascript" src="${pageContext.request.contextPath }/static/js/jquery-1.11.2.min.js"></script>
		<script type="text/javascript" src="${pageContext.request.contextPath }/static/js/bootstrap.min.js"></script>
		<script type="text/javascript" src="${pageContext.request.contextPath }/static/js/bootstrap-table.js"></script>

	</head>
	<body>
		<header class="cd-header">
			<a title="勤工助学" href="#0" class="cd-logo"><img src="${pageContext.request.contextPath }/static/img/qingongzhuxue.png" alt="Logo"></a>
			<a href="#0" class="cd-3d-nav-trigger">
				菜单栏
				<span title="菜单"></span>
			</a>
			<a title="退出" href="${pageContext.request.contextPath }/target/admin.do" class="cd-3d-nav-exit">退出</a>
		</header> <!-- .cd-header -->
		<main>

			<div class="wrapper">
				<div class="container">
					<div class="row">
						<div class="col-md-12">

							<div class="fresh-table">
								<div class="toolbar">
									<!-- <button class="btn btn-default">Form</button> -->
									<form action="" method="">
										<select class="btn" name="department">
											<option value="机电工程学院">机电工程学院</option>
											<option value="机械工程学院">机械工程学院</option>
											<option value="材料科学与工程学院">材料科学与工程学院</option>
											<option value="化学工程与技术学院">化学工程与技术学院</option>
											<option value="信息与通信工程学院">信息与通信工程学院</option>
											<option value="仪器与电子学院">仪器与电子学院</option>
											<option value="大数据学院">大数据学院</option>
											<option value="理学院">理学院</option>
											<option value="经济与管理学院">经济与管理学院</option>
											<option value="人文社会科学学院">人文社会科学学院</option>
											<option value="体育学院">体育学院</option>
											<option value="艺术学院">艺术学院</option>
											<option value="软件学院">软件学院</option>
											<option value="环境与安全工程学院">环境与安全工程学院</option>
											<option value="电气与控制工程学院">电气与控制工程学院</option>
											<option value="能源动力工程学院">能源动力工程学院</option>
										</select>
										<input class="btn" type="submit" value="导出">
									</form>
									<a href="#" class="btn">导出全部</a>
								</div>

								<table id="fresh-table" class="table">
									<thead>
										<th data-field="id">学号</th>
										<th data-field="name" data-sortable="true">姓名</th>
										<th data-field="department" data-sortable="true">院系</th>
										<th data-field="dorm" data-sortable="true">宿舍</th>
										<th data-field="direction" data-sortable="true">岗位</th>
										<th data-field="area" data-sortable="true">区域</th>
										<th data-field="phone" data-sortable="true">联系方式</th>
										<th data-field="actions">Actions</th>
									</thead>
									<tbody>
										<tr>
											<td>1614011216</td>
											<td>李书宇</td>
											<td>软件学院</td>
											<td>文澜六</td>
											<td>教学楼服务</td>
											<td>教学10号楼一层</td>
											<td>17635149666</td>
											<td>管理</td>
										</tr>
										<tr>
											<td>1614011244</td>
											<td>燕鑫</td>
											<td>软件学院</td>
											<td>文澜五</td>
											<td>教学楼服务</td>
											<td>教学14号楼三层</td>
											<td>15536129666</td>
											<td>管理</td>
										</tr>
										<tr>
											<td>1614011427</td>
											<td>王永峰</td>
											<td>软件学院</td>
											<td>文澜四</td>
											<td>校园卫生队</td>
											<td>东区403区域</td>
											<td>19834406666</td>
											<td>管理</td>
										</tr>
										<tr>
											<td>1614011412</td>
											<td>刘倬玮</td>
											<td>经管学院</td>
											<td>文涛三</td>
											<td>校园保洁队</td>
											<td>东区112区域</td>
											<td>15632876666</td>
											<td>管理</td>
										</tr>
										<tr>
											<td>1614011402</td>
											<td>杨佳慧</td>
											<td>艺术学院</td>
											<td>文赢一</td>
											<td>龙山服务队</td>
											<td>龙山底部区域</td>
											<td>13234406666</td>
											<td>管理</td>
										</tr>
									</tbody>
								</table>
							</div>


						</div>
					</div>
				</div>
			</div>
		</main>
		<nav class="cd-3d-nav-container">
			<ul class="cd-3d-nav5">
				<li>
					<a href="${pageContext.request.contextPath }/target/adminWorkManage.do">岗位管理</a>
				</li>

				<li class="cd-selected">
					<a href="${pageContext.request.contextPath }/target/adminWorkForm.do">查看报岗</a>
				</li>
				
				<li>
					<a href="${pageContext.request.contextPath }/target/adminSalaryForm.do">查看工资</a>
				</li>
				
				<li>
					<a href="${pageContext.request.contextPath }/target/adminBehaviorForm.do">成员表现</a>
				</li>
				<li>
					<a href="#0">队长管理</a>
				</li>
			</ul> <!-- .cd-3d-nav -->

			<span class="cd-marker5 color-5"></span>
		</nav> <!-- .cd-3d-nav-container -->
	</body>

	<script type="text/javascript">
		var $table = $('#fresh-table'),
			$alertBtn = $('#alertBtn'),
			full_screen = false;

		$().ready(function() {
			$table.bootstrapTable({
				toolbar: ".toolbar",
				showRefresh: false,
				//showExport: true,  //是否显示导出按钮
				search: true,
				showToggle: true,
				showColumns: true,
				pagination: true,
				striped: true,
				pageSize: 8,
				pageList: [8, 10, 25],

				formatShowingRows: function(pageFrom, pageTo, totalRows) {
					//do nothing here, we don't want to show the text "showing x of y from..." 
				},
				formatRecordsPerPage: function(pageNumber) {
					return pageNumber + " rows visible";
				},
				icons: {
					refresh: 'fa fa-refresh',
					toggle: 'fa fa-th-list',
					columns: 'fa fa-columns',
					detailOpen: 'fa fa-plus-circle',
					detailClose: 'fa fa-minus-circle'
				}
			});
		});
	</script>

</html>
