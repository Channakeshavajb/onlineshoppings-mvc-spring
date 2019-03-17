package com.xworkz.web.dto;

import java.io.Serializable;

public class BatteAngadiDTO implements Serializable{
	
	private String brand;
	private String category;
	private int quantity;
	private String size;
	private String color;
	

	public BatteAngadiDTO() {
		System.out.println("created\t" + this.getClass().getSimpleName());
	}


	public String getBrand() {
		return brand;
	}


	public void setBrand(String brand) {
		this.brand = brand;
	}


	public String getCategory() {
		return category;
	}


	public void setCategory(String category) {
		this.category = category;
	}


	public int getQuantity() {
		return quantity;
	}


	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}


	public String getSize() {
		return size;
	}


	public void setSize(String size) {
		this.size = size;
	}


	public String getColor() {
		return color;
	}


	public void setColor(String color) {
		this.color = color;
	}


	@Override
	public String toString() {
		return "BatteAngadiDTO [brand=" + brand + ", category=" + category + ", quantity=" + quantity + ", size=" + size
				+ ", color=" + color + "]";
	}

	
	
}
