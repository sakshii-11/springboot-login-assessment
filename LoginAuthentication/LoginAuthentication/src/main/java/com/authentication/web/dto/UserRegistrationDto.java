package com.authentication.web.dto;

public class UserRegistrationDto {
	
	
	private String firstName; 
	private String  lastName;
	private String email;
	private Long contact;
	private String password;

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
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	public Long getContact() {
		return contact;
	}
	public void setContact(Long contact) {
		this.contact = contact;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	public UserRegistrationDto(String firstName, String lastName, String email, Long contact, String password) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.contact = contact;
		this.password = password;
	}
	public UserRegistrationDto() {
		// TODO Auto-generated constructor stub
	}

	

	
	

}
