package com.example.springdemo.dto.builders;

import com.example.springdemo.dto.ItemDTO;
import com.example.springdemo.dto.PersonWithItemsDTO;
import com.example.springdemo.entities.Item;
import com.example.springdemo.entities.Person;

import java.util.List;
import java.util.stream.Collectors;

public class PersonWithItemsBuilder {
    private PersonWithItemsBuilder(){}

    public static PersonWithItemsDTO generateDTOFromEntity(Person person, List<Item> items){
        List<ItemDTO> dtos =  items.stream()
                .map(ItemBuilder::generateDTOFromEntity)
                .collect(Collectors.toList());

        return new PersonWithItemsDTO(
                person.getId(),
                person.getName(),
                dtos);
    }

}
