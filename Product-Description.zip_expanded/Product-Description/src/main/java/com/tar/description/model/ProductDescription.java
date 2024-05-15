package com.tar.description.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class ProductDescription {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String Brand;
    private String model;
    private double price;
	public Object getBrand() {
		// TODO Auto-generated method stub
		return null;
	}
	public void setBrand(Object brand2) {
		// TODO Auto-generated method stub
		
	}
	public Object getModel() {
		// TODO Auto-generated method stub
		return null;
	}
	public void setModel(Object model2) {
		// TODO Auto-generated method stub
		
	}
	
	
	public Object getPrice() {
		// TODO Auto-generated method stub
		return null;
	}
	public void setPrice(Object price2) {
		// TODO Auto-generated method stub
		
	}
	
	}
