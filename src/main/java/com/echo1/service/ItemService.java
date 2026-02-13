package com.echo1.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.echo1.model.Item;
import com.echo1.repository.ItemRepository;

@Service
public class ItemService {
    private final ItemRepository repo;

    public ItemService(ItemRepository repo) {
        this.repo = repo;
    }

    public List<Item> getAllItems() {
        return repo.findAll();
    }

    public Item addItem(String name) {
        return repo.save(new Item(null, name));
    }

    public Item getItem(Long id) {
        return repo.findById(id).orElse(null);
    }

    public void deleteItem(Long id) {
        repo.deleteById(id);
    }
}