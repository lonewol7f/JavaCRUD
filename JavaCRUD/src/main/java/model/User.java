package model;

public class User {
	
	private int id;
	private String fname;
	private String lname;
	private String email;
	private String uname;
	private String passwd;
	
	public int getId() {
		return id;
	}
	
	public String getFname() {
		return fname;
	}
	
	public String getLname() {
		return lname;
	}
	
	public String getEmail() {
		return email;
	}
	
	public String getUname() {
		return uname;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public void setFname(String fname) {
		this.fname = fname;
	}
	
	public void setLname(String lname) {
		this.lname = lname;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	
	public void setUname(String uname) {
		this.uname = uname;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", fname=" + fname + ", lname=" + lname + ", email=" + email + ", uname=" + uname
				+ ", passwd=" + passwd + "]";
	}
	
	
}
