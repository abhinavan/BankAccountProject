package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import bean.Account;
import connection.MyConnection;

public class AccountDaoImpl implements AccountDao
{

	Connection con;
	public AccountDaoImpl() throws ClassNotFoundException, SQLException
	{
		 con=new MyConnection().getConnection();
		
	}
	@Override
	public boolean validateAccount(Account a) throws SQLException 
	{
		PreparedStatement ps1=con.prepareStatement("select * from account where name=? and accNo=?");
		ps1.setString(1,a.getName());
		ps1.setInt(2,a.getAccNo());
		ResultSet rs=ps1.executeQuery();
		if(rs.first())
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	@Override
	public List<Account> getAccountBalance(int a) throws SQLException 
	{
		List<Account> list=new ArrayList<>();
		PreparedStatement ps2=con.prepareStatement("select * from accountView where accNo=?");
		ps2.setInt(1,a);
		ResultSet rs=ps2.executeQuery();
		while(rs.next())
		{
			
			Account acc=new Account();
			acc.setAccNo(rs.getInt("accNo"));
			acc.setName(rs.getString("name"));
			acc.setAccountType(rs.getString("accountType"));
			acc.setType(rs.getString("type"));
			acc.setBalance(rs.getInt("balance"));
			acc.setCredit(rs.getInt("credit"));
			list.add(acc);
		}
		return list;
	}
	@Override
	public int withdrawAmount(int accNo, int withdrawAmount, int password) throws SQLException 
	{
		
		int balance=0,value=0;
		PreparedStatement ps=con.prepareStatement("select balance from account where accNo=? and password=?");
		ps.setInt(1,accNo);
		ps.setInt(2,password);
		ResultSet rs=ps.executeQuery();
		if(rs.first())
		{
			balance=rs.getInt("balance");
			if(withdrawAmount<=balance)
			{
				balance=balance-withdrawAmount;
				PreparedStatement ps1=con.prepareStatement("update account set balance=? where accNo=?");
				ps1.setInt(1,balance);
				ps1.setInt(2,accNo);
				value=ps1.executeUpdate();
				
			}
			else
			{
				return value;
			}
		}
		return value;
	}
	@Override
	public int depositAmount(int accNo, int depositAmount, int password) throws SQLException 
	{
		
		int balance=0,value=0;
		PreparedStatement ps=con.prepareStatement("select balance from account where accNo=? and password=?");
		ps.setInt(1,accNo);
		ps.setInt(2,password);
		ResultSet rs=ps.executeQuery();
		if(rs.first())
		{
			balance=rs.getInt("balance");
			balance=balance+depositAmount;
			PreparedStatement ps1=con.prepareStatement("update account set balance=? where accNo=?");
			ps1.setInt(1,balance);
			ps1.setInt(2,accNo);
			value=ps1.executeUpdate();
			System.out.println(value);
		}
		else
		{
			return value;
		}
		return value;
	}
	
	

}
