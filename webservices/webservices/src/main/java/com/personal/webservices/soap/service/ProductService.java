package com.personal.webservices.soap.service;

import org.springframework.stereotype.Service;

import com.personal.webservices.soap.model.Product;

@Service
public interface ProductService {

	public Product getProduct(Integer id);

	public Product saveProduct(Product p);

	public Product updateProduct(Product p);

	public void deleteProduct(Integer id);
}
