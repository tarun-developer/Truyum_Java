package com.truyum.Dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import Test.Dao;

public class UserDao {

	public static boolean validate(String email,String pass) throws SQLException, ClassNotFoundException{
		Connection con=Dao.checkLogin();
	
		 String sql = "SELECT * FROM user where email=? and password=?";
         PreparedStatement st = con.prepareStatement(sql);
		st.setString(1,email);
		 st.setString(2,pass);
		 
	 ResultSet result =st.executeQuery();
         
	 if(result.next()){
		 return true;
	 }   
         return false;
         
		
	}
	
	
}
