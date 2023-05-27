package com.oncuoiki.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.oncuoiki.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long>{

}
