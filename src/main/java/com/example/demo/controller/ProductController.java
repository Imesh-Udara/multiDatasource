package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.db2.model.Product;
import com.example.demo.service.ProductService;


@RestController
@RequestMapping("/product")
public class ProductController {
	
	@Autowired
	private ProductService productService;
	
	@PostMapping("/saveProduct")
	public ResponseEntity<Product> saveProduct(@RequestBody Product product){
		Product myproduct = productService.saveProduct(product);
		return new ResponseEntity<>(myproduct, HttpStatus.OK);
	}
}
