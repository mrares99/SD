package com.example.springdemo.entities;

import javax.persistence.*;
import java.util.List;

import static javax.persistence.GenerationType.IDENTITY;

@Entity
@Table(name = "person")
public class Person {

    @Id
    @GeneratedValue(strategy = IDENTITY)
    @Column(name = "id", unique = true, nullable = false)
    private Integer id;

    @Column(name = "name", nullable = false, length = 100)
    private String name;

    @Column(name = "email", nullable = false, unique=true, length = 200)
    private String email;

    @Column(name = "iban")
    private String iban;

    @Column(name = "address")
    private String address;
    
    /*@Column(name = "UserName")
    private String username;
    
    @Column(name = "UserPassword")
    private String userPassword;*/

    @OneToMany(mappedBy = "person", fetch = FetchType.LAZY)
    private List<Item> items;

    /*public Person(String username,String password) {
    	this.username=username;
    	this.userPassword=password;
    }*/

    public Person(Integer id, String name, String email, String iban, String address) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.iban = iban;
        this.address = address;
    }

    public Person(Integer id, String name, String email) {
        this.id = id;
        this.name = name;
        this.email = email;
    }
    
    public Person() {}

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
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

    public String getIban() {
        return iban;
    }

    public void setIban(String iban) {
        this.iban = iban;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public List<Item> getItems() {
        return items;
    }

    public void setItems(List<Item> items) {
        this.items = items;
    }
}
