package com.org.entity;

public class User {
    private int id;
    private String fullName;
    private String email;
    private String password;
	
    
    public User(String fullname, String email, String password) {
		super();
		this.fullName = fullname;
		this.email = email;
		this.password = password;
	}
	
    
    public User() {
		super();
		// TODO Auto-generated constructor stub
	}
	
    
    public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFullName() {
		return fullName;
	}
	public void setFullName(String fullname) {
		this.fullName = fullname;
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
    
}
