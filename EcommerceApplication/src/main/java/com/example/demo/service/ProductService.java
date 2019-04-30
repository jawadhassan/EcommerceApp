package com.example.demo.service;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

import org.springframework.validation.annotation.Validated;

import com.example.demo.model.Product;

@Validated
public interface ProductService {

	@NotNull Iterable<Product> getAllProducts();
	
	Product getProduct(@Min(value = 1L, message="Invalid product ID") long id);
	
	Product save(Product product);
}
