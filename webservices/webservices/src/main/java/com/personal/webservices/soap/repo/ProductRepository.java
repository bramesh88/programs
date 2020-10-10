package com.personal.webservices.soap.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.personal.webservices.soap.model.Product;

@Repository
public interface ProductRepository extends JpaRepository<Product, Integer>{

}
