<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>文件上传</title>
</head>
<body>
    您创建的用户信息如下：
    <br />
    <!-- 使用EL表达式取出model中的user信息 -->
    用户名：${user.name }
    <br />
    年龄：${user.age }
    <br />
    身高：${user.height }
    <br />
    创建日期：${user.createDate }
</body>
</html>