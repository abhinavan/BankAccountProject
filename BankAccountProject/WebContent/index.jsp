<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="Validate" method="post">
<p><label>Enter account number</label><input type="number" name="accNo"/></p>
<p><label>Enter name</label><input type="text" name="name"/></p>
<p><label>select account type</label><select name="accountType"><option value="savings">savings</option>
											 					<option value="current">current</option>
									</select></p>

<p><input type="submit" value="Submit"></p>
</form>
</body>
</html>