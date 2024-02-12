package com.example.ProductApp.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.ProductApp.DTO.ProductDTO;
import com.example.ProductApp.Service.ProductService;

@RestController
public class ProductController {

	@Autowired
	private ProductService productService;
	
	@GetMapping(value = "/getAllProducts")
	public ResponseEntity<List<ProductDTO>> getAllProducts(){
		return ResponseEntity.ok(productService.getAllProducts());
	}
	
}
