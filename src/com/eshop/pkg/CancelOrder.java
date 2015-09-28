package com.eshop.pkg;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class CancelOrder
 */
@WebServlet("/CancelOrder")
public class CancelOrder extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String brand = (String) request.getSession().getAttribute("productId");
		
		DBconnect db = new DBconnect();
		db.OrderCancel(brand);
		
		//System.out.println("cancelling done");
		
		response.sendRedirect("/273Assign2/Login.jsp");
	}

}
