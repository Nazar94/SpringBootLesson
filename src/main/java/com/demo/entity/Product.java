package com.demo.entity;

import java.math.BigDecimal;

public class Product {
	
	private long id;
	
	private String name;
	
	private String photo;
	
	private BigDecimal price;
	
	private int quantity;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhoto() {
		return photo;
	}

	public void setPhoto(String photo) {
		this.photo = photo;
	}

	public BigDecimal getPrice() {
		return price;
	}

	public void setPrice(BigDecimal price) {
		this.price = price;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	

	public Product() {
	}

	public Product(long id, String name, String photo, BigDecimal price, int quantity) {
		super();
		this.id = id;
		this.name = name;
		this.photo = photo;
		this.price = price;
		this.quantity = quantity;
	}
	
	 
	
	

}
