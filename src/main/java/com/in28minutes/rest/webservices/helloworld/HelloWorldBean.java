package com.in28minutes.rest.webservices.helloworld;

public class HelloWorldBean {

	private String messge;

	public HelloWorldBean(String message) {
		this.messge = message;	
	}

	public void setMessge(String messge) {
		this.messge = messge;
	}
	
	@Override
	public String toString() {
		return "HelloWorldBean [messge=" + messge + "]";
	}

	public String getMessge() {
		return messge;
	}

}
