package com.example.springdemo.repositories;

import com.example.springdemo.entities.Person;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PersonRepository extends JpaRepository<Person, Integer> {

    Person findByEmail(String email);

    @Query(value = "SELECT u " +
            "FROM Person u " +
            "ORDER BY u.name")
    List<Person> getAllOrdered();


    @Query(value = "SELECT p " +
            "FROM Person p " +
            "INNER JOIN FETCH p.items i"
    )
    List<Person> getAllFetch();
    
    
    
    
}
