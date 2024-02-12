package com.example.ProductApp.Entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "products")
public class Product {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	Long id;
	
	@Column(name = "product_name")
	String productName;
	@Column(name = "product_description")
	String productDescription;
	@Column(name = "price")
	Double price;
	@Column(name = "status")
	Boolean status;
}
