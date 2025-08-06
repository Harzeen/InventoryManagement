package com.inventorymanagement.service;
import java.util.List;

import com.inventorymanagement.entity.Item;

public interface ItemService {
		List<Item> getAllItems();
	    Item getItemById(Long id);
	    Item saveItem(Item item);
	    Item updateItem(Long id, Item item);
	    void deleteItem(Long id);
}
