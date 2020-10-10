package com.personal.webservices.rest;

import org.springframework.beans.factory.annotation.Autowired;

import com.personal.webservices.soap.model.Product;
import com.personal.webservices.soap.service.ProductService;

public class RESTController implements Controller {

	@Autowired
	private ProductService productService;

	@Override
	public Product getProduct(int id) {
		return productService.getProduct(Integer.valueOf(id));
	}

	@Override
	public void deleteProduct(int id) {
		productService.deleteProduct(Integer.valueOf(id));
	}

	@Override
	public Product updateProduct(Product p) {
		return productService.updateProduct(p);
	}

	@Override
	public Product createProduct(Product p) {
		return productService.saveProduct(p);
	}

}
