package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.db2.model.Product;
import com.example.demo.db2.repository.ProductRepo;

@Service
public class ProductService {
	
	@Autowired
	private ProductRepo productRepo;
	
	public Product saveProduct(Product product) {
		return productRepo.save(product);
	}
}
