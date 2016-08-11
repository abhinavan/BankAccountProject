package controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import dao.AccountDao;
import dao.AccountDaoImpl;

@WebServlet("/WithdrawController")
public class WithdrawController extends HttpServlet 
{
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		try
		{
			
			HttpSession accountInfo=request.getSession(false);
//			String name=(String) accountInfo.getValue("name");
			
			
		
		int accNo=(int)accountInfo.getValue("accNo");
		int withdrawAmount=Integer.parseInt(request.getParameter("balance"));
		PrintWriter out=response.getWriter();
		int password=Integer.parseInt(request.getParameter("password"));
		AccountDao adao=new AccountDaoImpl();
		int value=adao.withdrawAmount(accNo, withdrawAmount, password);
		//out.println(value);
		if(value==1)
		{
			
			
			response.sendRedirect("withdrawSuccessPage.jsp");
		}
		else
		{
			response.sendRedirect("withdrawFailPage.jsp");
		}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}

}
