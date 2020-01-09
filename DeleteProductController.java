package com.deloitte.estore.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.deloitte.estore.model.Product;
import com.deloitte.estore.service.ProductService;
import com.deloitte.estore.service.ProductServiceImpl;

@WebServlet("/delete")
public class DeleteProductController extends HttpServlet {
	@Override
	public void service(HttpServletRequest req,HttpServletResponse res) throws ServletException, IOException {
		int prodId=Integer.parseInt(req.getParameter("pid"));
		ProductService service=new ProductServiceImpl();
		Product p;
		try {
			p = service.getProductById(prodId);
			 if( service.deleteProduct(p)) {
				 res.sendRedirect("getall");
			 }
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	  	
	}

}
