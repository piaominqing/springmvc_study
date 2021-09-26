<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>添加用户</title>
</head>
<body>
    <form action="${pageContext.request.contextPath}/converter"
        method="post">
        请输入用户信息（格式为编程帮, 18,1.85）:
        <input type="text" name="user" />
        <br>
        <input type="submit" value="提交" />
    </form>
</body>
</html>