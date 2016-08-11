package bean;

public class Account
{
	private int accNo;
	private String name;
	private String type;
	private String accountType;
	private int balance;
	private int credit;
	private int password;
	public Account()
	{
		
	}
	
	public Account(int accNo, String name, String type, String accountType, int balance, int credit, int password) {
		super();
		this.accNo = accNo;
		this.name = name;
		this.type = type;
		this.accountType = accountType;
		this.balance = balance;
		this.credit = credit;
		this.password = password;
	}

	public Account(int accNo, String name, String type, String accountType, int balance, int credit) 
	{
	
		this.accNo = accNo;
		this.name = name;
		this.type = type;
		this.accountType = accountType;
		this.balance = balance;
		this.credit = credit;
	}
	
	public Account(int accNo,int password)
	{
		this.accNo=accNo;
		this.password=password;
	}

	public void setAccNo(int accNo) {
		this.accNo = accNo;
	}


	public void setName(String name) {
		this.name = name;
	}


	public void setType(String type) {
		this.type = type;
	}


	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}


	public void setBalance(int balance) {
		this.balance = balance;
	}


	public void setCredit(int credit) {
		this.credit = credit;
	}


	public int getAccNo() {
		return accNo;
	}

	public String getName() {
		return name;
	}

	public String getType() {
		return type;
	}

	public String getAccountType() {
		return accountType;
	}

	public int getBalance() {
		return balance;
	}
	public void setPassword()
	{
		this.password=password;
	}
	public int getPassword()
	{
		return password;
	}
	

	public int getCredit() {
		return credit;
	}

	@Override
	public String toString() {
		return "Account [accNo=" + accNo + ", name=" + name + ", type=" + type + ", accountType=" + accountType
				+ ", balance=" + balance + ", credit=" + credit + "]";
	}
	
	

}
