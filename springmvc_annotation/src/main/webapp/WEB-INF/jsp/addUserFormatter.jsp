<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>添加用户</title>
</head>
<body>
    <form action="${pageContext.request.contextPath}/formatter" method="post">
        用户名：<input type="text" name="name" />
        <br>
        年龄：<input type="text" name="age" />
        <br>
        身高：<input type="text" name="height" />
        <br>
        创建日期：<input type="text" name="createDate" />
        <br>
        <input type="submit" value="提交" />
    </form>
</body>
</html>