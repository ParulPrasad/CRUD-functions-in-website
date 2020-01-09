package com.deloitte.estore.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.deloitte.estore.model.Product;
import com.deloitte.estore.service.ProductService;
import com.deloitte.estore.service.ProductServiceImpl;

/**
 * Servlet implementation class ShowProductController
 */
@WebServlet("/search")
public class ShowProductController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		ProductService service=new ProductServiceImpl();
		int pid=Integer.parseInt(request.getParameter("txtpid"));
		try {
			Product p=service.getProductById(pid);
			HttpSession ssn=request.getSession();
			ssn.setAttribute("product",p);
			if(p!=null) {
				
				response.sendRedirect("showprod.jsp");
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
