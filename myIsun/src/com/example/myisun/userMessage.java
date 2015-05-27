package com.example.myisun;
import java.util.ArrayList;

public class userMessage {
	String name;
	String password;
	public userMessage(String name,String password){
		this.name=name;
		this.password=password;
	}
	public userMessage() {
		// TODO Auto-generated constructor stub
	}
	public String getName() {
		// TODO Auto-generated method stub
		return name;
	}
	public String getPW() {
		// TODO Auto-generated method stub
		return password;
	}
	public void setName(String optString) {
		this.name=optString;
		
	}
	public void setPassword(String optString) {
		// TODO Auto-generated method stub
		this.password=optString;
	}
	
}
