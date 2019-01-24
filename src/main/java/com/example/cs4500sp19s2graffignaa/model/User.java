package com.example.cs4500sp19s2graffignaa.model;


public class User {
	private Integer id;
	private String username;
	private String password;
	private String firstName;
	private String lastName;
	
 	public User(int id, String username, String password, String firstName, String lastName) {
 		this.id = id;
 		this.username = username;
 		this.password = password;
 		this.firstName = firstName;
 		this.lastName = lastName;
 	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	
	public String getLastName() {
		return lastName;
	}
	
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getUsername() {
		return username;
	}
	
	public void setUsername(String username) {
		this.username = username;
	}
	
	// LOL
	public String getPassword() {
		return password;
	}
	
	public void setPassword(String password) {
		this.password = password;
	}
	
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
}

