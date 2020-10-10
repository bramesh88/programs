package com.personal.webservices.soap;

import javax.jws.WebMethod;
import javax.jws.WebService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.personal.webservices.soap.model.Product;
import com.personal.webservices.soap.service.ProductService;

@WebService
@Service
public class ProductWebService {

	@Autowired
	private ProductService productService;

	@WebMethod
	public Product getProductDetails(int id) {
		return productService.getProduct(id);
	}

	@WebMethod
	public Product createProduct(Product product) {
		return productService.saveProduct(product);
	}

	@WebMethod
	public void deleteProduct(int id) {
		productService.deleteProduct(Integer.valueOf(id));
	}

	@WebMethod
	public Product updateProduct(Product product) {
		return productService.updateProduct(product);
	}

}
