package com.example.springdemo.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="users")
public class User {
	
	@Id
    @Column(name = "user_id", unique = true, nullable = false)
    private String userId;
	
    @Column(name = "user_name",unique=true, nullable = false, length = 45)
    private String userName;

    @Column(name = "user_password", nullable = false, length = 45)
    private String userPassword;
    
    @Column(name = "user_type", nullable = false, length = 45)
    private String userType;
    
    public User() {
    	
    }
    
    public User(String name,String password) {
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
