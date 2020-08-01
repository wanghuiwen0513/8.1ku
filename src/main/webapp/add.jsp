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
	<form action="#">
		标题:<input type="text" name="title"><br>
		内容:<textarea rows="5" cols="30" name="context"></textarea><br>
		状态:<select name="status">
			<option value="">请选择</option>
			<option value="1">未通过</option>
			<option value="0">通过</option>
		</select><br>
		时间:<input type="date" name="created"><br>
		<input type="button" value="添加" onclick="add()">
	</form>
</body>
<script type="text/javascript">
	function add(){
		$.post("add",$("form").serialize(),function(data){
			if(data){
				alert("添加成功");
				location.href="http://localhost:8080/list";
				
			}else{
				alert("添加失败");
			}
			
		})
		
	}
</script>
</html>