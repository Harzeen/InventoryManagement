package com.inventorymanagement.service;

import com.inventorymanagement.entity.Item;

import com.inventorymanagement.repository.ItemRepo;

import jakarta.persistence.EntityNotFoundException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ItemServiceImp implements ItemService {

	@Autowired
    private ItemRepo itemRepository;

    @Override
    public List<Item> getAllItems() {
        return itemRepository.findAll();
    }

    @Override
    public Item getItemById(Long id) {
        return itemRepository.findById(id)
        		.orElseThrow(() -> new RuntimeException("Item not found with id: " + id));
    }

    @Override
    public Item saveItem(Item Item) {
        return itemRepository.save(Item);
    }

    @Override
    public Item updateItem(Long id, Item updatedItem) {
        Item existing = getItemById(id);
        existing.setName(updatedItem.getName());
        existing.setPrice(updatedItem.getPrice());
        existing.setQuantity(updatedItem.getQuantity());
        return itemRepository.save(existing);
    }

	@Override
	public void deleteItem(Long id) {
		// TODO Auto-generated method stub
		Optional<Item> itemOptional = itemRepository.findById(id);
	    if (itemOptional.isPresent()) {
	        itemRepository.deleteById(id);
	    } else {
	        throw new RuntimeException("Item not found with id: " + id);
	    }
	}

    
}