package com.tar.productservice.repository;

import com.tar.productservice.model.product;

import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<product, Long> {
}