package com.example.springdemo.dto.builders;

import com.example.springdemo.dto.ItemDTO;
import com.example.springdemo.entities.Item;

public class ItemBuilder {
    private ItemBuilder() {
    }

    public static ItemDTO generateDTOFromEntity(Item item) {
        return new ItemDTO(
                item.getId(),
                item.getName());
    }

    public static Item generateEntityFromDTO(ItemDTO itemDTO) {
        return new Item(
                itemDTO.getId(),
                itemDTO.getName());
    }
}
