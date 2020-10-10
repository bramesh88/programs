package com.personal.spring.jdbc.repo;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.personal.spring.jdbc.model.Product;

@Repository
public interface ProductRepository{
	
	String CREATE_SQL="INSERT INTO PRODUCT(ID,NAME,DESCRIPTION) VALUES(?,?,?)";
	
	String UPDATE_SQL="UPDATE TABLE PRODUCT SET NAME=?,DESCRIPTION=? WHERE ID=?";
	
	String DELETE_SQL="DELETE PRODUCT WHERE ID=?";
	
	String SELECT_ALL_SQL="SELECT ID,NAME,DESCRIPTION FROM PRODUCT";
	
	String SELECT_SQL="SELECT ID,NAME,DESCRIPTION FROM PRODUCT WHERE ID=?";

	int create(Product p);
	
	int update(Product p);
	
	void delete(int id);
	
	Product getProduct(int id);
	
	List<Product> loadAll();
}
