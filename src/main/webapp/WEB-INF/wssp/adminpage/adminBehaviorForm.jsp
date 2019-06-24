<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<meta charset="utf-8" />
		<link rel="icon" type="image/png" href="${pageContext.request.contextPath }/static/img/hardworking.png">
		<meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1" />
		<title>日常信息</title>
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
							

								<table id="fresh-table" class="table">
									<thead>
										<th data-field="id">学号</th>
										<th data-field="name" data-sortable="true">姓名</th>
										<th data-field="department" data-sortable="true">院系</th>
										<th data-field="direction" data-sortable="true">岗位</th>
										<th data-field="area" data-sortable="true">区域</th>
										<th data-field="performance" data-sortable="true">表现</th>
										<th data-field="phone" data-sortable="true">联系方式</th>
										<th data-field="actions">Actions</th>
									</thead>
									<tbody>
										<tr>
											<td>1</td>
											<td>Dakota Rice</td>
											<td>$36,738</td>
											<td>Niger</td>
											<td>Oud-Turnhout</td>
											<td>
												<a href="../svg.html">你好</a>
												<a href="../计算器.html">你很好</a>
												<a href="../svg.html">你好</a>
											</td>
										</tr>
										<tr>
											<td>2</td>
											<td>Minerva Hooper</td>
											<td>$23,789</td>
											<td>Curaçao</td>
											<td>Sinaai-Waas</td>
											<td><a href="../svg.html">你好</a>
												<a href="../计算器.html">你很好</a>
												<a href="../svg.html">你好</a></td>
										</tr>
										<tr>
											<td>3</td>
											<td>Sage Rodriguez</td>
											<td>$56,142</td>
											<td>Netherlands</td>
											<td>Baileux</td>
											<td></td>
										</tr>
										<tr>
											<td>4</td>
											<td>Philip Chaney</td>
											<td>$38,735</td>
											<td>Korea, South</td>
											<td>Overland Park</td>
											<td></td>
										</tr>
										<tr>
											<td>5</td>
											<td>Doris Greene</td>
											<td>$63,542</td>
											<td>Malawi</td>
											<td>Feldkirchen in Kärnten</td>
											<td></td>
										</tr>
										<tr>
											<td>6</td>
											<td>Mason Porter</td>
											<td>$78,615</td>
											<td>Chile</td>
											<td>Gloucester</td>
											<td></td>
										</tr>
										<tr>
											<td>7</td>
											<td>Alden Chen</td>
											<td>$63,929</td>
											<td>Finland</td>
											<td>Gary</td>
											<td></td>
										</tr>
										<tr>
											<td>8</td>
											<td>Colton Hodges</td>
											<td>$93,961</td>
											<td>Nicaragua</td>
											<td>Delft</td>
											<td></td>
										</tr>
										<tr>
											<td>9</td>
											<td>Illana Nelson</td>
											<td>$56,142</td>
											<td>Heard Island</td>
											<td>Montone</td>
											<td></td>
										</tr>
										<tr>
											<td>10</td>
											<td>Nicole Lane</td>
											<td>$93,148</td>
											<td>Cayman Islands</td>
											<td>Cottbus</td>
											<td></td>
										</tr>
										<tr>
											<td>11</td>
											<td>Chaim Saunders</td>
											<td>$5,502</td>
											<td>Romania</td>
											<td>New Quay</td>
											<td></td>
										</tr>
										<tr>
											<td>12</td>
											<td>Josiah Simon</td>
											<td>$50,265</td>
											<td>Christmas Island</td>
											<td>Sint-Jans-Molenbeek</td>
											<td></td>
										</tr>
										<tr>
											<td>13</td>
											<td>Ila Poole</td>
											<td>$67,413</td>
											<td>Montenegro</td>
											<td>Pontevedra</td>
											<td></td>
										</tr>
										<tr>
											<td>14</td>
											<td>Shana Mejia</td>
											<td>$58,566</td>
											<td>Afghanistan</td>
											<td>Ballarat</td>
											<td></td>
										</tr>
										<tr>
											<td>15</td>
											<td>Lana Ryan</td>
											<td>$64,151</td>
											<td>Martinique</td>
											<td>Portobuffolè</td>
											<td></td>
										</tr>
										<tr>
											<td>16</td>
											<td>Daquan Bender</td>
											<td>$91,906</td>
											<td>Sao Tome and Principe</td>
											<td>Walhain-Saint-Paul</td>
											<td></td>
										</tr>
										<tr>
											<td>17</td>
											<td>Connor Wagner</td>
											<td>$86,537</td>
											<td>Germany</td>
											<td>Solihull</td>
											<td></td>
										</tr>
										<tr>
											<td>18</td>
											<td>Boris Horton</td>
											<td>$35,094</td>
											<td>Laos</td>
											<td>Saint-Mard</td>
											<td></td>
										</tr>
										<tr>
											<td>19</td>
											<td>Winifred Ryan</td>
											<td>$64,436</td>
											<td>Ireland</td>
											<td>Ronciglione</td>
											<td></td>
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

				<li>
					<a href="${pageContext.request.contextPath }/target/adminWorkForm.do">查看报岗</a>
				</li>
				
				<li>
					<a href="${pageContext.request.contextPath }/target/adminSalaryForm.do">查看工资</a>
				</li>
				
				<li class="cd-selected">
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
