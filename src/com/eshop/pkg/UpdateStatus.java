package com.eshop.pkg;

import java.sql.DriverManager;
import java.util.Timer;
import java.util.TimerTask;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.Statement;

public class UpdateStatus implements Runnable {
	private Connection con;
	private Statement st;
	private String query;

	public void run() {
		try {
			Class.forName("com.mysql.jdbc.Driver").newInstance();
			con = (Connection) DriverManager.getConnection(
					"jdbc:mysql://localhost:3306/eshop", "root", "");
			st = (Statement) con.createStatement();

			query = "UPDATE orderdetails SET status= 'Completed' "
					+ "WHERE DATE_ADD(orderdate, INTERVAL 3 DAY) = CURDATE();";
			st.executeUpdate(query);
			
			con.close();
		} catch (Exception ex) {
			ex.printStackTrace();
		}

		// query = "Select orderdate from orderdetails where status = " +
	}

	public static void main(String[] args) {

		Timer timer = new Timer();
		
		timer.scheduleAtFixedRate(new TimerTask() {

			@Override
			public void run() {
				UpdateStatus sc = new UpdateStatus();
				Thread t = new Thread(sc);
				t.start();
			}
		}, 0, 5000 * 60 );
	}
}