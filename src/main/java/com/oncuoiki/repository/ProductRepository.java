package com.oncuoiki.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.oncuoiki.entities.Product;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {

}
