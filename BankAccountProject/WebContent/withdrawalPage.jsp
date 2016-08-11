<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%
	int accNo=Integer.parseInt(request.getParameter("accNo"));
%>
<h2 align="center">Withdrawal Portal</h2>
<form action="WithdrawController" method="post">
<p>Welcome <%
		HttpSession accountInfo=request.getSession(false);
		if(accountInfo!=null)
		{
			out.println(accountInfo.getAttribute("name"));
		}
		else
		{
			out.println("sorry");
		}
%></p>
<table align="center" border="1">
<tr>
</tr>
<tr>
<td>Amount to be withdrawn</td>
<td><input type="number" name="balance"/></td>
</tr>
<tr>
<td>Enter your pin</td>
<td><input type="password" name="password"/></td>
</tr>
<tr>
<td><input type="reset" value="Clear Balance"/></td>
<td><input type="submit" value="Withdraw"/></td>
</tr>
</table>
</form>

</body>
</html>