package com.example.ProductApp.ServiceImpl;

import java.util.List;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;

import com.example.ProductApp.DTO.ProductDTO;
import com.example.ProductApp.Entity.Product;
import com.example.ProductApp.Repository.ProductRepo;
import com.example.ProductApp.Service.ProductService;


public class ProductServiceImpl implements ProductService{
	
	@Autowired
	private ProductRepo productRepo;
	private ModelMapper modelMapper;

	@Override
	public List<ProductDTO> getAllProducts() {
		List<Product> products=productRepo.findAll();
		return products.stream().map(product->modelMapper.map(products, ProductDTO.class)).collect(Collectors.toList());
	}

	@Override
	public ProductDTO getProductById(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ProductDTO saveProduct() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteProduct() {
		// TODO Auto-generated method stub
		
	}

}
