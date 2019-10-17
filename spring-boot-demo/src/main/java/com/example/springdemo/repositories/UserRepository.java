package com.example.springdemo.repositories;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.springdemo.entities.User;

@Repository
public interface UserRepository extends JpaRepository<User, String>{
	
	@Query("select userType from User where userName=:name and userPassword=:password")
    public String loginUser(String name,String password);
}
