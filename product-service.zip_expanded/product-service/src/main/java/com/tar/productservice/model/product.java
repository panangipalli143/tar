package com.tar.productservice.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String type;
	public Object getType() {
		// TODO Auto-generated method stub
		return null;
	}
	public void setType(Object type2) {
		// TODO Auto-generated method stub
		
	}
}