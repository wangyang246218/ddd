<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%> 
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>

<table width="100%" border=1>

	<tr>
		<th>编号</th>
		<th>商品名称</th>
		<th>价格</th>
		<th>类别名称</th>
		<th>商品库存</th>
		<th>操作</th>
	</tr>
	<c:forEach items=${goodsList} var="goods">
	<tr>	
		<td>${goods["id"] }</td>
		<td>${goods["name"] }</td>
		<td>${goods["price"] }</td>
		<td>${goods["type"] }</td>
		<td>${goods["amount"] }</td>
		<td><a href="/com.yht.ssm/goods/update/${goods['id'] }">修改</a>  <a href="/com.yht.ssm/goods/delete/${goods['id'] }">删除</a></td>
	</tr>
	</c:forEach>
</table>

</body>
</html>