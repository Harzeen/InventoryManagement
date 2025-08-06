package com.inventorymanagement.service;

import com.inventorymanagement.entity.Product;

import com.inventorymanagement.repository.ProductRepo;

import jakarta.persistence.EntityNotFoundException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductServiceImp implements ProductService {

	@Autowired
    private ProductRepo productRepository;

    @Override
    public List<Product> getAllProducts() {
        return productRepository.findAll();
    }

    @Override
    public Product getProductById(Long id) {
        return productRepository.findById(id)
        		.orElseThrow(() -> new RuntimeException("Product not found with id: " + id));
    }

    @Override
    public Product saveProduct(Product product) {
        return productRepository.save(product);
    }

    @Override
    public Product updateProduct(Long id, Product updatedProduct) {
        Product existing = getProductById(id);
        existing.setName(updatedProduct.getName());
        existing.setPrice(updatedProduct.getPrice());
        existing.setQuantity(updatedProduct.getQuantity());
        return productRepository.save(existing);
    }

	@Override
	public void deleteProduct(Long id) {
		// TODO Auto-generated method stub
		Optional<Product> productOptional = productRepository.findById(id);
	    if (productOptional.isPresent()) {
	        productRepository.deleteById(id);
	    } else {
	        throw new RuntimeException("Product not found with id: " + id);
	    }
	}

    
}