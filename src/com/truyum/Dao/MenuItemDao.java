package com.truyum.Dao;
import com.cognizant.truyum.model.*;
import java.util.*;
public interface MenuItemDao {

	
	public List<MenuItem>getMenuItemListAdmin();
	public List<MenuItem>getMenuItemListcustomer();
	public void modifyMenuItem(MenuItem menuItem);
	public MenuItem getMenuItem(long MenuItemid);
	
	
	
}
