<!DOCTYPE html>
<%@ taglib uri="/struts-tags" prefix="s"%>
<html lang="en">
<head>
<title>Jtechy.co.in</title>
<link rel="stylesheet" type="text/css" href="./css/base.css">
<link rel="stylesheet" type="text/css" href="//fonts.googleapis.com/css?family=Ubuntu" />
</head>
<body>
	<div class="loginDiv">
		<h2 align="center">Please Login</h2>
		<s:form action="login">
			<s:textfield name="user.name" label="Name"></s:textfield>
			<s:password name="user.password" label="Password"></s:password>
			<s:submit value="login"></s:submit>
		</s:form>
	</div>
</body>
</html>
