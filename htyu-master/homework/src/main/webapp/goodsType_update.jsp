<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>

<form action="/com.yht.ssm/goodsType/updateGoodsType/${goodsType['id_type']}">
	编号<input type="text" name="id" value="${goodsType['id_type']}">
	商品类型<input type="text" name="name" value="${goodsType['name_type']}">
	<input type="submit" value="提交">

</form>


</body>
</html>