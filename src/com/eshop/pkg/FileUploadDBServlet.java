package com.eshop.pkg;

import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
 











import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.servlet.http.Part;
 

//@MultipartConfig(maxFileSize = 16177215)    // upload file's size up to 16MB
public class FileUploadDBServlet extends HttpServlet {
     
      
    protected void doPost(HttpServletRequest request,
            HttpServletResponse response) throws ServletException, IOException {
    
        // gets values of text fields
        String Username = request.getParameter("username");
        String Password = request.getParameter("password"); 
        String ConfirmPassword = request.getParameter("confirm_password");
        
        System.out.println("password " + Password + "confirm " + ConfirmPassword );
        
        if(Username != null && Password != null) 
        {
        String register = request.getParameter("join");
        if (register != null){
        if(request.getParameter("join").equals("join")){
        	
        	System.out.println("request "+request.getParameter("join"));
        	if (Password.equals(ConfirmPassword)) {
        		
        		System.out.println("getting details ");
            	
                DBconnect db = new DBconnect();
                
                GetSHA1hashed sh = new GetSHA1hashed();
                
                //sh.makeSHA1Hash(Password);
                
                String status = db.SignUp(Username, sh.makeSHA1Hash(Password)); 
                
                response.sendRedirect("/273Assign2/returnlogin.jsp");
                
              /*  RequestDispatcher dispatcher=request.getRequestDispatcher("/273Assign2/ShopCart.jsp");
                dispatcher.forward(request, response);*/
        		}
        	else
            	System.out.println("password not valid");   
        	 }
        	}
        else {
                
        if (request.getParameter("login").equals("login")){
        	
        	System.out.println("getting details ");
        	
            DBconnect db = new DBconnect();
            GetSHA1hashed sh = new GetSHA1hashed();
            
            String status = db.Login(Username,sh.makeSHA1Hash(Password));
            
            request.setAttribute("productID", (String) request.getSession().getAttribute("productId"));
            request.setAttribute("Desc", (String) request.getSession().getAttribute("Desc"));
            request.setAttribute("price", (String) request.getSession().getAttribute("price"));
            request.setAttribute("Image", (String) request.getSession().getAttribute("image"));
            System.out.println("imageName :" + request.getSession().getAttribute("image"));
            System.out.println("request" + request.getAttribute("Image"));


            //String cost =  (String) request.getSession().getAttribute("price");
           // int IntCost = Integer.parseInt(cost);
            
       
            
            System.out.println(request.getSession().getAttribute("productId"));
            
           
            if(status.equals("ok")){
                //response.sendRedirect("/273Assign2/ShopCart.jsp");
            	request.getRequestDispatcher("ShopCart.jsp").forward(request, response);
            }
            else	
            {
            System.out.println("Your Account Doesnt Exist, Please Sign up");
            response.sendRedirect("/273Assign2/plsSignUp.jsp");
            		}
        	
        		}
        
        	}
        
        }
            
       
     }
    
}
        
              
        
   