package com.eshop.pkg;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class BillngInfo
 */
@WebServlet("/BillngInfo")
public class BillngInfo extends HttpServlet {
	
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
	        // gets values of text fields
	        String Firstname = request.getParameter("firstname");
	        String Lastname = request.getParameter("lastname"); 
	        String Email = request.getParameter("email");
	        String Phone = request.getParameter("phone");   
	        String Address1 = request.getParameter("Address1");   
	        String Address2 = request.getParameter("Address2");   
	        String City = request.getParameter("City");   
	        String ZipCode = request.getParameter("ZipCode");   
	        String State = request.getParameter("State");   
	        String Country = request.getParameter("Country");   
	        String CardNumber = request.getParameter("Card_Number");   
	        String CardName = request.getParameter("Name"); 
	        String CVV = request.getParameter("CVV"); 
	        
	       	               
	        DBconnect db = new DBconnect();
	        GetSHA1hashed sh = new GetSHA1hashed();
	      	        
	        String brand = (String) request.getSession().getAttribute("productId");
	        int InventoryCount = db.GetQuantity(brand);
            System.out.println("total Available :" + db.GetQuantity(brand));
                                  
            int Quant =  (int) request.getSession().getAttribute("Quantity");
            
            System.out.println("Quant in bill" + Quant);
                        
            if(InventoryCount > 0 && InventoryCount >= Quant) {
            	
            	InventoryCount = InventoryCount - Quant;
            	System.out.println("IC: " + InventoryCount);
            	 
            	db.UpdateInventory(brand, InventoryCount);
            	
            	String status = db.Billing(Firstname, Lastname, Email, Phone, Address1, Address2, City, ZipCode, State, Country, CardNumber, CardName, sh.makeSHA1Hash(CVV));
            	
            	Random generateRand = new Random();
            	//int orderNumb = generateRand.nextInt();
            	int orderNumb = generateRand.nextInt( Integer.MAX_VALUE ) + 1;
            	
            	//Date date = new Date();
            	//String orderdate = date.toString();
            	
            	SimpleDateFormat sdf = new SimpleDateFormat("mm/dd/yyyy");
            	 
             	System.out.println(sdf.format(new Date()));
            	
            	db.updateOrder(brand, orderNumb, status, new java.sql.Date((new Date()).getTime()));
        		//response.sendRedirect("/273Assign2/OrderConfirmation.jsp");
                request.setAttribute("order", orderNumb);
        		request.getRequestDispatcher("OrderConfirmation.jsp").forward(request, response);
            	
            }
        	
            else
            	
            	response.sendRedirect("/273Assign2/Cart.jsp");
		
	}

}
