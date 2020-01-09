package com.cognizant.truyum.model;

import java.util.*;

public class Cart {
private List<MenuItem>MenuItemList;
private double total;
public List<MenuItem> getMenuItemList() {
	return MenuItemList;
}
public void setMenuItemList(List<MenuItem> menuItemList) {
	MenuItemList = menuItemList;
}
public double getTotal() {
	return total;
}
public void setTotal(double total) {
	this.total = total;
}
public Cart(List<MenuItem> menuItemList, double total) {
	super();
	MenuItemList = menuItemList;
	this.total = total;
}
}
