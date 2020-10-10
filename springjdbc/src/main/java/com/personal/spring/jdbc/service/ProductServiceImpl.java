package com.personal.spring.jdbc.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.personal.spring.jdbc.model.Product;
import com.personal.spring.jdbc.repo.ProductRepository;

@Service
public class ProductServiceImpl implements ProductService {

	@Autowired
	private ProductRepository productRepository;

	@Override
	public Product getProduct(int id) {
		return productRepository.getProduct(id);
	}

	@Override
	public int saveProduct(Product p) {
		return productRepository.create(p);
	}

	@Override
	public int updateProduct(Product p) {
		return productRepository.update(p);
	}

	@Override
	public void deleteProduct(int id) {
		productRepository.delete(id);
	}

	@Override
	public List<Product> getAllProducts() {
		return productRepository.loadAll();
	}

}
