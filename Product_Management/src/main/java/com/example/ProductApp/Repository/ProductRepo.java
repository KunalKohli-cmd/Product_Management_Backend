package com.example.ProductApp.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.ProductApp.Entity.Product;

public interface ProductRepo extends JpaRepository<Product, Long>{

}
