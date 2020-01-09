package com.deloitte.estore.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.deloitte.estore.model.Product;
import com.deloitte.estore.service.ProductService;
import com.deloitte.estore.service.ProductServiceImpl;

/**
 * Servlet implementation class AddProductController
 */
@WebServlet("/addproduct")
public class AddProductController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	  int prodId=Integer.parseInt(request.getParameter("txtpid"));
	  String prodName=request.getParameter("txtpname");
	  float price=Float.parseFloat(request.getParameter("txtprice"));
	  
	  Product prod=new Product(prodId,prodName,price);
	  ProductService ps=new ProductServiceImpl();
	  try {
		if(ps.addProduct(prod)) {
			response.sendRedirect("success.jsp");
		}
	} catch (Exception e) {
	
		e.printStackTrace();
	}
//	  try {
//		if(ps.deleteProduct(prod))
//			response.sendRedirect("success.jsp");
//	} catch (Exception e) {
//		// TODO Auto-generated catch block
//		e.printStackTrace();
//	}
//	try {
//		if (ps.updateProduct(prod)) { 
//		response.sendRedirect("success.jsp");	
//		}
//	} catch (Exception e) {
//		// TODO Auto-generated catch block
//		e.printStackTrace();
//	}
	}

}
