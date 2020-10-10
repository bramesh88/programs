package com.personal.spring.jdbc.service;

import java.util.List;

import com.personal.spring.jdbc.model.Product;

public interface ProductService {

	public Product getProduct(int id);

	public int saveProduct(Product p);

	public int updateProduct(Product p);

	public void deleteProduct(int id);
	
	public List<Product> getAllProducts();
}
