package com.eshop.pkg;


import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.Driver;

import java.sql.*;
import java.util.Date;

import com.mysql.jdbc.Statement;

public class DBconnect {
	private Connection con;
	private Statement st;
   	private ResultSet rs;
	private String query;
	private String username = "";
	private String password = "";
	
			
		public DBconnect(){
			System.out.println("trying to connect");
			try{
				Class.forName("com.mysql.jdbc.Driver").newInstance();
				con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/eshop", "root", "");
				st =(Statement) con.createStatement();
			}catch(Exception ex){
				ex.printStackTrace();
			}
		}
			
		// TODO Auto-generated constructor stub
	
		
public String SignUp( String username, String password){
	
	String sql = "insert into user values (?,?,?)";
	try {
		PreparedStatement prep = con.prepareStatement(sql);
		prep.setInt(1, 0);
		prep.setString(2, username);
		prep.setString(3, password);
		int i = prep.executeUpdate();
			if(i!=0){  
                      System.out.println("Record has been inserted");  
                      }  
         else{  
                      System.out.println("failed to insert the data");
          } 
		prep.close();
		} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}

	return "";
}

public String Login(String username, String password){
	
	System.out.println("login function");
	String passwd = "";
	try{
	query = "Select password from user where username = " + "'" + username +"'";
	rs = st.executeQuery(query);
	System.out.println("rs"+rs);
	while(rs.next()){
		passwd = rs.getString("Password");
	}
	if(passwd.equals(password)){
		return "ok";
	}
	
	}catch (Exception ex) {
		System.out.println("mismatch" + ex);
	}
	
	return"";
}

public void updateOrder(String brand, int orderNumb, String status, java.sql.Date date)
{
	String sql = "insert into orderdetails values (?,?,?,?)";
	try {
		PreparedStatement prep = con.prepareStatement(sql);
		
		prep.setString(1, brand);
		prep.setInt(2, orderNumb);
		prep.setString(3, status);
		
		
		System.out.println(date);
		prep.setDate(4, date);
		
		int i = prep.executeUpdate();
         if(i!=0){  
                      System.out.println("Record has been inserted");  
                      }  
         else{  
                      System.out.println("failed to insert the data");
          } 
		prep.close();
		} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
		}
}
	

public int GetQuantity(String product){

		System.out.println("Get Quantity reached!!");
		int Quantity=0;
		try{
			System.out.println("Find inventory for brand " + product);
			Statement st = (Statement) con.createStatement();
			String sql = "SELECT itemquantity from inventory where brand = " + "'" + product +"'";
			ResultSet rs = st.executeQuery(sql);
			System.out.println("rs" + rs);
			while(rs.next()){
				Quantity = rs.getInt("itemquantity");
			}
		}catch(SQLException e){
			e.printStackTrace();
		}
		return Quantity;
	}



public int GetOrderNo(String product){

	System.out.println("Get Order reached!!");
	int OrderNumber=0;
	try{
		System.out.println("Find order details for brand " + product);
		Statement st = (Statement) con.createStatement();
		String sql = "SELECT orderNumb from orderdetails where brand = " + "'" + product +"'";
		ResultSet rs = st.executeQuery(sql);
		System.out.println("rs" + rs);
		while(rs.next()){
			OrderNumber = rs.getInt("orderNumb");
		}
	}catch(SQLException e){
		e.printStackTrace();
	}
	return OrderNumber;
}


public String UpdateInventory(String brand, int itemquantity){

	System.out.println("Update Inventory Function!!");
	String sql = "UPDATE inventory SET itemquantity =" + "'" + itemquantity + "'" + "WHERE brand = " + "'" + brand +"'";
	try{
		PreparedStatement statement = (PreparedStatement) con.prepareStatement(sql);
		int row = statement.executeUpdate(sql);
		if (row > 0) {
			System.out.println("Inventory updated!!");
		}
		else{
			System.out.println("Failed to update inventory!!");
		}
	}catch(SQLException e){
		e.printStackTrace();
	}
	return "";
	}

public String updateStatus(String status , String date) {
	
	return"";
	
}

public void OrderCancel(String b){
	
	try{
	query = "UPDATE orderdetails SET status= 'Cancelled' "
			+ "WHERE DATE_ADD(orderdate, INTERVAL 3 DAY) <= CURDATE();";
	st.executeUpdate(query);
	
	System.out.println("cancel executed");
	
	}catch(SQLException e){
		e.printStackTrace();
	}
	
}

public String getCart(){
	
	String sql = "SELECT * FROM itemdetails";
	
		return"";
}

public String Billing(String firstname, String lastname, String email, String phone, String Address1, String Address2, String City, String ZipCode, String State, String Country, String CardNumber, String CardName, String CVV)
{
		
	String sql = "insert into billingdetails values (?,?,?,?,?,?,?,?,?,?,?,?,?)";
	try {
		PreparedStatement prep = con.prepareStatement(sql);
		prep.setString(1, firstname);
		prep.setString(2, lastname);
		prep.setString(3, email);
		prep.setString(4, phone);
		prep.setString(5, Address1);
		prep.setString(6, Address2);
		prep.setString(7, City);
		prep.setString(8, ZipCode);
		prep.setString(9, State);
		prep.setString(10, Country);
		prep.setString(11, CardNumber);
		prep.setString(12, CardName);
		prep.setString(13, CVV);

		int i = prep.executeUpdate();
		 String msg=" ";
         if(i!=0){  
                      System.out.println("Record has been inserted");  
                      }  
         else{  
                      System.out.println("failed to insert the data");
          } 
		prep.close();
		} catch (SQLException e) {
		e.printStackTrace();
	}
	return "pending";
}




/*public static void main(String[] args){
	DBconnect db = new DBconnect();
	db.login("abc", "a");

}*/
 
}
