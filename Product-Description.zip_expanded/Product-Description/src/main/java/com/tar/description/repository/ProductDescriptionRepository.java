package com.tar.description.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tar.description.model.ProductDescription;

public interface ProductDescriptionRepository extends JpaRepository<ProductDescription, Long> {
	
}