package com.abctravels;
//Represents an admin user with properties like name, email, password, mobile number, gender, failed login count, and account status.

public class User {
	private String firstname;
	private String lastname;
	private String mobilenumber;
	private String gender;
	private String email;
	private String password;
	private int failedcount;
	private String accountstatus;
	
	
	
	public User(String firstname,String lastname,String mobilenumber,String gender,String email,String password,int failedcount,String accountstatus) {
		this.firstname=firstname;
		this.lastname=lastname;
		this.mobilenumber=mobilenumber;
		this.gender=gender;
		this.email=email;
		this.password=password;
		this.failedcount=failedcount;
		this.accountstatus=accountstatus;
	}

	public String getfirstname() {
		return firstname;
	}
	public void setfirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getlastname() {
		return lastname;
	}
	public void setlastname(String lastname) {
		this.lastname = lastname;
	}
	public String getmobilenumber() {
		return mobilenumber;
	}
	public void setmobilenumber(String mobilenumber) {
		this.mobilenumber = mobilenumber;
	}
	public String getgender() {
		return gender;
	}
	public void setgender(String gender) {
		this.gender = gender;
	}
	public String getemail() {
		return email;
	}
	public void setemail(String email) {
		this.email = email;
	}
	public String getpassword() {
		return password;
	}
	public void setpassword(String password) {
		this.password = password;
	}
	public int getfailedcount() {
		return failedcount;
	}
	public void setfailedcount(int failedcount) {
		this.failedcount = failedcount;
	}
	public String getaccountstatus() {
		return accountstatus;
	}
	public void setaccountstatus(String accountstatus) {
		this.accountstatus = accountstatus;
	}
	@Override
	public String toString() {
		return "User [firstName=" + firstname + ", lastName=" + lastname + ", mobileNumber=" + mobilenumber
				+ ", gender=" + gender + ", email=" + email + ", password=" + password + ", failedCount=" + failedcount
				+ ", accountStatus=" + accountstatus + "]";
        		
        		
    }
	
	
	
	
	
	

}
