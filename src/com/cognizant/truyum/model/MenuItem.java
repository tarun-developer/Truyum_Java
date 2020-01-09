package com.cognizant.truyum.model;

public class MenuItem {

	
	
	
	public boolean equals(MenuItem m1) {
		if(this.getId()==m1.getId()){
			return true;
		}
		return false;
	}
	
	@Override
	public String toString() {
		return "MenuItem [id=" + id + ", price=" + price + ", name=" + name + ", category=" + category
				+ ", freeDelivery=" + freeDelivery + ", active=" + active + "]";
	}

	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCategory() {
		return category;
	}

	public boolean isFreeDelivery() {
		return freeDelivery;
	}
	public void setFreeDelivery(boolean freeDelivery) {
		this.freeDelivery = freeDelivery;
	}
	private long id;
	public MenuItem(long id, float price, String name, String category, boolean freeDelivery, boolean active) {
		super();
		this.id = id;
		this.price = price;
		this.name = name;
		this.category = category;
		this.freeDelivery = freeDelivery;
		this.active = active;
	}
	
	
	
	
	private float price;
	private String name;
	private String category;
	private boolean freeDelivery;
	private boolean active;
	public boolean isActive() {
		return active;
	}
	public void setActive(boolean active) {
		this.active = active;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	


	
}
