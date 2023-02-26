package com.masai.bean;

public class Buyer {

	private int bId;
	private String name;
	private String email;
	private String password;
	
	
	public Buyer() {
		// TODO Auto-generated constructor stub
	}


	public Buyer(int bId, String name, String email, String password) {
		super();
		this.bId = bId;
		this.name = name;
		this.email = email;
		this.password = password;
	}


	public int getbId() {
		return bId;
	}


	public void setbId(int bId) {
		this.bId = bId;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}


	@Override
	public String toString() {
		return "Buyer [bId=" + bId + ", name=" + name + ", email=" + email + ", password=" + password + "]";
	}
	
}
