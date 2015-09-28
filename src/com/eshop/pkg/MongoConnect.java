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
 * Servlet implementation class MongoConnect
 */

public class MongoConnect extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public MongoConnect() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		HttpSession session = request.getSession();
		String id1 = request.getParameter("productId");
		session.setAttribute("productId",id1);
		
		System.out.println("prodID " + session.getAttribute("productId"));
		
		String id2 = request.getParameter("Desc");
		session.setAttribute("Desc",id2);
		
		System.out.println("Desc " + session.getAttribute("Desc"));

		
		String id3 = request.getParameter("price");
		session.setAttribute("price",id3);
		
		String id4 = request.getParameter("image");
		session.setAttribute("image",id4);
		
		System.out.println("price " + session.getAttribute("price"));

		
		//session.setAttribute("Desc",request.getParameter("Desc"));
		//session.setAttribute("price",request.getParameter("price"));
		//System.out.println("price" + request.getParameter("price"));
		
		RequestDispatcher dispatcher=request.getRequestDispatcher("/Login.jsp");
        dispatcher.forward(request, response);
		
	}

}
