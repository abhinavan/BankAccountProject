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


@WebServlet("/DepositController")
public class DepositController extends HttpServlet 
{


	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		try
		{
		PrintWriter out=response.getWriter();
		HttpSession accountInfo=request.getSession(false);
		int accNo=(int)accountInfo.getValue("accNo");
		int password=Integer.parseInt(request.getParameter("password"));
		int depositAmount=Integer.parseInt(request.getParameter("balance"));
		AccountDao adao=new AccountDaoImpl();
		int value=adao.depositAmount(accNo, depositAmount, password);
		if(value==1)
		{
			response.sendRedirect("depositSuccess.jsp");
		}
		else
		{
			response.sendRedirect("depositFail.jsp");
		}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}

}
