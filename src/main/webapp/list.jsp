<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
 <link rel="stylesheet" type="text/css"  href="css/index_work.css"/> 
<script type="text/javascript" src="<%=request.getContextPath()%>/js/jquery-1.8.2.min.js"></script>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
		<form action="list" method="post">
			标题:<input type="text" name="title"><br>
			发布时间:<input type="date" name="startTime">~<input type="date" name="endTime"><br>
		<input type="submit" value="搜索">
		</form>
	<table>
		<tr>
			<td>文章ID</td>
			<td>标题</td>
			<td>内容</td>
			<td>审核状态</td>
			<td>发布时间</td>
			<td>操作</td>
		</tr>
		
			<c:forEach items="${page.list}" var="li">
				<tr>
					<td>${li.aid }</td>
					<td>${li.title }</td>
					<td>${li.context }</td>
					<td>${li.status == 0 ?'审核通过':'审核失败' }</td>
					<td>${li.created }</td>
					<td>
						<a href="add.jsp">
								<input type="button" value="添加">
						</a>
					</td>
				</tr>
			</c:forEach>
		<tr>
			<td colspan="12">
				<input type="button" value="首页"  onclick="fenye(1)">
				<input type="button" value="上一页"  onclick="fenye(${page.pageNum-1<1?1:page.pageNum-1})">
				<input type="button" value="下一页"  onclick="fenye(${page.pageNum+1>page.pages?page.pages:page.pageNum+1})">
				<input type="button" value="尾页"  onclick="fenye(${page.pages})">
			</td>
		</tr>
	</table>

</body>
<script type="text/javascript">
	function fenye(pageNum){
		location = "list?pageNum="+pageNum;
	}
	
</script>
</html>