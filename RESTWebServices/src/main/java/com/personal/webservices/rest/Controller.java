package com.personal.webservices.rest;

import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;

import com.personal.webservices.soap.model.Product;

@Path("/api/product")
public interface Controller {

	@GET
	public Product getProduct(int id);

	@DELETE
	public void deleteProduct(int id);

	@PUT
	public Product updateProduct(Product p);

	@POST
	public Product createProduct(Product p);
}
