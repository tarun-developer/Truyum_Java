package com.truyum.Dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.*;

import com.cognizant.truyum.model.MenuItem;

import Test.Dao;

public class MenuItemDaoSqlImpl {

	public List<MenuItem>getMenuItemListAdmin(){
		List<MenuItem>al=new ArrayList<>();
		MenuItem m;
		try {
			Connection con=Dao.checkLogin();
		PreparedStatement ps=con.prepareStatement("Select * from MenuItem");
		ResultSet rs=ps.executeQuery();
		while(rs.next()){
			
			long  id=rs.getInt("me_id");

			float price=rs.getFloat("me_price");

			String  category=rs.getString("me_category");

			boolean active=false;
			
			if(rs.getString("me_active").equalsIgnoreCase("YES")){
				active=true;
			}
			
			String name=rs.getString("me_name");
			boolean free_delivery=false;
			
			if(rs.getString("me_free_delivery").equalsIgnoreCase("YES")){
				free_delivery=true;
				
			}
			
			m=new MenuItem(id,price,name,category,free_delivery,active);
			al.add(m);
			
		}
		
		
		
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
	
		return al;
		
	}
	
	public List<MenuItem>getMenuItemListCustomer(){
		List<MenuItem>al=new ArrayList<>();
		MenuItem m;
		try {
			Connection con=Dao.checkLogin();
		PreparedStatement ps=con.prepareStatement("Select * from MenuItem where me_active='yes'");
		ResultSet rs=ps.executeQuery();
		while(rs.next()){
			
			long  id=rs.getInt("me_id");

			float price=rs.getFloat("me_price");

			String  category=rs.getString("me_category");

			boolean active=true;
			
		
			
			String name=rs.getString("me_name");
			boolean free_delivery=false;
			
			if(rs.getString("me_free_delivery").equalsIgnoreCase("YES")){
				free_delivery=true;
				
			}
			
			m=new MenuItem(id,price,name,category,free_delivery,active);
			al.add(m);
			
		}
		
		
		
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
	
		return al;
		
	}
	public void EditMenuItem(long itemId) {
		Connection con;
		try {
			con = Dao.checkLogin();
			PreparedStatement ps=con.prepareStatement("update MenuItem set me_name=? , me_price=? , me_active=? where me_id=?");
			ps.setFloat(2, (float) 88.00);
		ps.setString(1, "Panneer KolaPuri");
		ps.setString(3, "YES");
		ps.setInt(4, 1);
		
	int ans=	ps.executeUpdate();
	if(ans!=0){
		System.out.println("row updated");
	}
		
		
		} catch (ClassNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
			
		
	}
	
	
	
		public MenuItem getMenuItemId(long itemId) {
			Connection con;
			MenuItem m = null;
			try {
				con = Dao.checkLogin();
				PreparedStatement ps=con.prepareStatement("select * from Menuitem where me_id=?");
				ps.setInt(1, (int) itemId);
				ResultSet rs=ps.executeQuery();
				while(rs.next()){
					boolean b=false;
					if(rs.getString("me_active").equalsIgnoreCase("YES")){
						b=true;
					}
					
					boolean b1=false;
					if(rs.getString("me_free_delivery").equalsIgnoreCase("YES")){
						b1=true;
					}
			m=new MenuItem(rs.getLong("me_id"),rs.getFloat("me_price"), rs.getString("me_name"), rs.getString("me_category"), b1,b);
			
					
					
				}
			
			
			} catch (ClassNotFoundException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			} catch (SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			return m;
				
		
		
		
		
	}
	
	
	
}
