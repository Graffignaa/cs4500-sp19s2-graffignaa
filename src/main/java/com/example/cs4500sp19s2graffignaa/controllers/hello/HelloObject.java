package com.example.cs4500sp19s2graffignaa.controllers.hello;

public class HelloObject {
	private String message;
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public HelloObject(String message) {
		this.message = message;
	}
	public HelloObject() {
	}
}
