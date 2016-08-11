<%@page import="bean.Account"%>
<%@page import="java.util.List"%>
<%@page import="dao.AccountDaoImpl"%>
<%@page import="dao.AccountDao"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<p>Welcome
<%
	HttpSession accountInfo=request.getSession(false);
	
	out.println(accountInfo.getAttribute("name"));
	int accNo=Integer.parseInt(request.getParameter("accNo"));
	
	
%>
</p>
<p>Your Account number is 
<%
	
	out.println(accountInfo.getAttribute("accNo"));
	AccountDao adao=new AccountDaoImpl();
	List<Account> list=adao.getAccountBalance(accNo);
	%>
	<table align="center" border="2">
	<tr>
	<th>Account number</th>
	<th>Name</th>
	<th>Type</th>
	<th>Account Type</th>
	<th>Balance</th>
	<th>Credit</th>
	</tr>
	<%	for(Account a:list){	%>
	<tr>
	<td><%out.println(a.getAccNo());%></td>
	<td><%out.println(a.getName());%></td>
	<td><%out.println(a.getType());%></td>
	<td><%out.println(a.getAccountType());%></td>
	<td><%out.println(a.getBalance());%></td>
	<td><%out.println(a.getCredit());%></td>
	<td><%out.println("<a href='withdrawalPage.jsp?accNo="+accNo+"'>Withdraw</a>");%></td>
	<td><%out.println("<a href='depositPage.jsp?accNo="+accNo+"'>Deposit</a>");%></td>
	<td><%out.println("<a href='creditPage.jsp?accNo="+accNo+"'>Credit My Account</a>");%></td>
	<%} %>
	</tr>
	</table>
</body>
</html>