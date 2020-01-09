package com.truyum.Dao;

import java.sql.SQLException;
import java.util.List;

import com.cognizant.truyum.model.MenuItem;

public class MenuItemDaoSqlImplTest {

	public static void main(String args[]){
		
		//testGetMenuItem();
		//System.out.println("\n");
		 //testGetCustomerItem();
		//EditMenuItemTest();
		//System.out.println("\n");
		//testGetMenuItem();
		testGetCustomerItemId();
	}

	public static void testGetMenuItem() {
		// TODO Auto-generated method stub
		MenuItemDaoSqlImpl menu=new MenuItemDaoSqlImpl();
		List<MenuItem>L=menu.getMenuItemListAdmin();
		
		
		for(MenuItem m : L){
			System.out.println(m);
		}
	}
	
	

	public static void EditMenuItemTest()  {
	
		MenuItemDaoSqlImpl menu=new MenuItemDaoSqlImpl();
		menu.EditMenuItem(1);
	
	}
	public static void testGetCustomerItem() {
		// TODO Auto-generated method stub
		MenuItemDaoSqlImpl menu=new MenuItemDaoSqlImpl();
		List<MenuItem>L=menu.getMenuItemListCustomer();
		
		
		for(MenuItem m : L){
			System.out.println(m);
		}
	}
	
	public static void testGetCustomerItemId() {
		// TODO Auto-generated method stub
		MenuItemDaoSqlImpl menu=new MenuItemDaoSqlImpl();
		 MenuItem L=menu.getMenuItemId(1);
		 System.out.println(L);
	
	}
	
}
