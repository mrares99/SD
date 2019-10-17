package com.example.springdemo.dto;

public class UserDTO {
private String userId;
    private String userName;
    private String userPassword;
    private String userType;
    
    public UserDTO() {
    	
    }
    
    public UserDTO(String name,String password) {
    	this.userName=name;
    	this.userPassword=password;
    }
    
    public String getUserId() {
    	return userId;
    }
    
    public String getUserName() {
    	return userName;
    }
    
    public String getUserPassword() {
    	return userPassword;
    }
    
    public String getUserType() {
    	return userType;
    }
    
    public void setUserId(String id) {
    	userId=id;
    }
    
    public void setUserName(String name) {
    	this.userName=name;
    }
    
    public void setUserPassword(String password) {
    	this.userPassword=password;
    }

}
