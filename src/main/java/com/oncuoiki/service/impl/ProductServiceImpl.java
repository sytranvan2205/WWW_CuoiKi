package com.oncuoiki.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.oncuoiki.entities.Product;
import com.oncuoiki.repository.ProductRepository;
import com.oncuoiki.service.ProductService;

@Service
public class ProductServiceImpl implements ProductService {

	@Autowired
	ProductRepository repo;
	
	@Override
	public List<Product> getAll() {
		return repo.findAll();
	}

	@Override
	public Product addProduct(Product product) {
		if(product!=null) {
			return repo.save(product);
		}
		return null;
	}

	@Override
	public void deleteProduct(Long id) {
		repo.delete(id);
	}

}
