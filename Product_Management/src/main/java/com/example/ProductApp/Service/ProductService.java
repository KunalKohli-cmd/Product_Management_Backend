package com.example.ProductApp.Service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.ProductApp.DTO.ProductDTO;

@Service
public interface ProductService {

	public List<ProductDTO> getAllProducts();
	public ProductDTO getProductById(Long id);
	public ProductDTO saveProduct();
	public void deleteProduct();
}
