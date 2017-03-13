<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>登陆界面</title>
</head>
<body>
	<form action="loginServlet.do" method="post">
		<div
			style="width: 1400px; height: 500px; background-color: gray; font-size: 18px; margin-top: 50px;">
			<h3>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
				&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;用户登录界面</h3>
			<table width="300" border="1" cellpadding="0" cellspacing="0"
				align=center>
				<tr>
					<td>请输入用户名： <input type="text" name="uname" />
					</td>
				</tr>
				<tr>
					<td>&nbsp;&nbsp;&nbsp;<input type="submit" value="登陆" />&nbsp;&nbsp;&nbsp;&nbsp;

						<input type="reset" value="重置" />
					</td>
				</tr>
			</table>
		</div>

	</form>
</body>
</html>