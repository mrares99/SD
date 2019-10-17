package com.example.springdemo.dto;

import java.util.List;

public class PersonWithItemsDTO {
    private Integer id;
    private String name;
    private List<ItemDTO> items;

    public PersonWithItemsDTO(){}
    public PersonWithItemsDTO(Integer id, String name, List<ItemDTO> items) {
        this.id = id;
        this.name = name;
        this.items = items;
    }

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

    public List<ItemDTO> getItems() {
        return items;
    }

    public void setItems(List<ItemDTO> items) {
        this.items = items;
    }
}
