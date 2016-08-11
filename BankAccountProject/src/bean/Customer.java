package bean;

public class Customer
{
	private int accNo;
	private String address;
	private long phone;
	private String occupation;
	
	public Customer(int accNo, String address, long phone, String occupation) 
	{
	
		this.accNo = accNo;
		this.address = address;
		this.phone = phone;
		this.occupation = occupation;
	}

	public void setAccNo(int accNo) {
		this.accNo = accNo;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public void setPhone(long phone) {
		this.phone = phone;
	}

	public void setOccupation(String occupation) {
		this.occupation = occupation;
	}

	public int getAccNo() {
		return accNo;
	}

	public String getAddress() {
		return address;
	}

	public long getPhone() {
		return phone;
	}

	public String getOccupation() {
		return occupation;
	}

	@Override
	public String toString() {
		return "Customer [accNo=" + accNo + ", address=" + address + ", phone=" + phone + ", occupation=" + occupation
				+ "]";
	}
	
	
	

}
