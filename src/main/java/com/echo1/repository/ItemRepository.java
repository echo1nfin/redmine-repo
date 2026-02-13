package com.echo1.repository;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

import org.springframework.stereotype.Repository;

import com.echo1.model.Item;

@Repository
public class ItemRepository {
    private final Map<Long, Item> storage = new HashMap<>();
    private Long counter = 1L;

    public List<Item> findAll() {
        return new ArrayList<>(storage.values());
    }

    public Item save(Item item) {
        if(item.getId() == null) {
            item.setId(counter++);
        }
        storage.put(item.getId(), item);
        return item;
    }

    public Optional<Item> findById(Long id) {
        return Optional.ofNullable(storage.get(id));
    }

    public void deleteById(Long id) {
        storage.remove(id);
    }
}