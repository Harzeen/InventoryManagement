package com.inventorymanagement.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.inventorymanagement.entity.Item;

public interface ItemRepo extends JpaRepository<Item, Long>{

}
