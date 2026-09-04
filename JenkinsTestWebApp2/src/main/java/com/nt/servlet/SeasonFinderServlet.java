package com.nt.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDate;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/season")

public class SeasonFinderServlet extends HttpServlet {
	
	
	public  void  doGet(HttpServletRequest  req, HttpServletResponse res)throws ServletException,IOException{
		System.out.println("SeasonFinderServlet.doGet()");
		//get PrintWriter
		PrintWriter pw=res.getWriter();
		//set response content type
		res.setContentType("text/html");
		//get  system  date 
		LocalDate ldt=LocalDate.now();
		//get current month value
		int month=ldt.getMonthValue();
		
		if(month>=3 && month<=6)
		        pw.println("<h1  style='color:red;text-align:center'> Summer Season</h1> ");
		else if (month>=7 && month<=10)
		      pw.println("<h1  style='color:pink;text-align:center'> Rainy Season !!!</h1> ");
		else 
			  pw.println("<h1  style='color:green;text-align:center'> winter Season</h1> ");
		//add home hyperlink
		pw.println("<br> <a href='index.jsp'> home  </a>");
		
		
		//close  stream
		pw.close();
	}
	
	public void  doPost(HttpServletRequest req,HttpServletResponse res)throws ServletException,IOException{
		System.out.println("SeasonFinderServlet.doPost()");
		doGet(req,res);
	}
	
}
