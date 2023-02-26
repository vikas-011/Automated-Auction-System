package com.masai.bean;

public class Seller {
	
	private int sId;
	private String name;
	private String email;
	private String password;
	
	public Seller() {
		// TODO Auto-generated constructor stub
	}

	public Seller(int sId, String name, String email, String password) {
		super();
		this.sId = sId;
		this.name = name;
		this.email = email;
		this.password = password;
	}

	public int getsId() {
		return sId;
	}

	public void setsId(int sId) {
		this.sId = sId;
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
		return "Seller [sId=" + sId + ", name=" + name + ", email=" + email + ", password=" + password + "]";
	}
	

}
