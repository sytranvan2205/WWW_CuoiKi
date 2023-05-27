package com.oncuoiki.service;

import java.util.List;

import com.oncuoiki.entities.Product;

public interface ProductService {
	List<Product> getAll();
	Product addProduct(Product product);
	void deleteProduct(Long id);
}
