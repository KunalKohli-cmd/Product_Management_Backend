package com.example.ProductApp.DTO;

import lombok.Data;

@Data
public class ProductDTO {

	Long id;
	
	String productName;
	String productDescription;
	Double price;
	Boolean status;
	
}
