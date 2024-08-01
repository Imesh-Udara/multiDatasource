package com.example.demo.db2.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.db2.model.Product;

@Repository
public interface ProductRepo extends JpaRepository<Product, Integer> {

}
