package com.personal.spring.jdbc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.personal.spring.jdbc.model.Product;
import com.personal.spring.jdbc.service.ProductService;

@Controller
public class ProductController {

	@Autowired
	private ProductService productService;
	
	public Product create(int id) {
		return productService.getProduct(id);
	}
}
