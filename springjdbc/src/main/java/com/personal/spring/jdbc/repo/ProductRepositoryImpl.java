package com.personal.spring.jdbc.repo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;

import com.personal.spring.jdbc.model.Product;

public class ProductRepositoryImpl implements ProductRepository {

	@Autowired
	private JdbcTemplate jdbcTemplate;

	@Override
	public int create(Product p) {
		return jdbcTemplate.update(CREATE_SQL);
	}

	@Override
	public int update(Product p) {
		return jdbcTemplate.update(UPDATE_SQL);
	}

	@Override
	public void delete(int id) {
		jdbcTemplate.update(UPDATE_SQL);
	}

	@Override
	public Product getProduct(int id) {
		return jdbcTemplate.queryForObject(SELECT_ALL_SQL, new ProductMapper());
	}

	@Override
	public List<Product> loadAll() {
		return jdbcTemplate.query(SELECT_SQL, new ProductMapper());
	}

}
