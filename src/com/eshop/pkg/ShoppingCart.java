package com.eshop.pkg;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class ShoppingCart
 */
public class ShoppingCart extends HttpServlet {
    
    
    protected void doPost(HttpServletRequest request,
            HttpServletResponse response) throws ServletException, IOException {
    	System.out.println("reached servlet");
    	
    	DBconnect db = new DBconnect();
    	
    	HttpSession session = request.getSession();
    	String Quantity = request.getParameter("Quantity");
    	int Q = Integer.parseInt(Quantity);
    	session.setAttribute("Quantity", Q);
    	System.out.println("quan:"+ session.getAttribute("Quantity"));
    	
    	System.out.println("quantity selected is in shop cart :" + Q);
    	
    	String cost =  (String) request.getSession().getAttribute("price");
        int IntCost = Integer.parseInt(cost);
        
        int total = (IntCost * Q);
        
        request.setAttribute("Total", total);
              
        session.setAttribute("Total", total);
        
        System.out.println("total in shop cart:" +total);
    	System.out.println("total in session:"+ session.getAttribute("Total"));

              
    	
         if(request.getParameter("ConfirmButton")!= null)  
         {  
        	request.setAttribute("Total", total);
     		request.getRequestDispatcher("BillingDetails.jsp").forward(request, response);     
             // response.sendRedirect("/273Assign2/BillingDetails.jsp");     
              
         }  
                              
    }
}


