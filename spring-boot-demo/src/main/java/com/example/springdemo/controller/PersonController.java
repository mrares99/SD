package com.example.springdemo.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.springdemo.dto.PersonDTO;
import com.example.springdemo.dto.PersonViewDTO;
import com.example.springdemo.dto.PersonWithItemsDTO;
import com.example.springdemo.services.PersonService;
import com.example.springdemo.services.UserService;

@RestController
@CrossOrigin
@RequestMapping(value = "/persons")
public class PersonController {

    private final PersonService personService;
    private final UserService userService;

    @Autowired
    public PersonController(PersonService personService,UserService userService) {
        this.personService = personService;
        this.userService=userService;
    }
    
    /*@Autowired
    public PersonController(UserService userService) {
        this.userService=userService;
    }
    */

    @GetMapping(value = "/{id}")
    public PersonViewDTO findById(@PathVariable("id") Integer id){
        return personService.findPersonById(id);
    }

    @GetMapping()
    public List<PersonViewDTO> findAll(){
    	//List<PersonViewDTO> aux=personService.findAll();
    	/*System.out.println("=======================");
    	for(int i=0;i<aux.size();i++) {
    		System.out.println(aux.get(i).getName());
    	}*/
    	/*aux.clear();
    	aux.add(new PersonViewDTO(1,"name1","email1"));
    	aux.add(new PersonViewDTO(2,"name2","email1"));
    	aux.add(new PersonViewDTO(3,"name3","email1"));
    	aux.add(new PersonViewDTO(4,"name4","email1"));*/
        return personService.findAll();
    	//return aux;
    }

    @GetMapping(value = "/items")
    public List<PersonWithItemsDTO> findAllWithItems(){
        return personService.findAllFetch();
    }

    @GetMapping(value = "/items/wrong")
    public List<PersonWithItemsDTO> findAllWithItemsWrong(){
        return personService.findAllFetchWrong();
    }

    @PostMapping()
    public Integer insertPersonDTO(@RequestBody PersonDTO personDTO){
    	System.out.println("++++++++++++++++++++++++++"+
    			personDTO.getName());
    	return personService.insert(personDTO);
    }

    @GetMapping("/login")
    public String loginUserDB(@RequestParam(value = "username")  String username, @RequestParam(value = "password")  String password){
    	
    	return userService.getLoginUser(username, password);
    }
    
    @PutMapping()
    public Integer updatePerson(@RequestBody PersonDTO personDTO) {
        return personService.update(personDTO);
    }

    @DeleteMapping()
    public void delete(@RequestBody PersonViewDTO personViewDTO){
        personService.delete(personViewDTO);
    }
}
