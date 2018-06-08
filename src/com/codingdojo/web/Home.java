package com.codingdojo.web;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Home
 */
@WebServlet("/Home")
public class Home extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Home() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
//		response.setContentType("text/html");
//		PrintWriter out = response.getWriter();
//		out.write("<h1>Hello World! how are you today!?</h1>");
		String firstName = request.getParameter("first_name");
		String lastName = request.getParameter("last_name");
		String favLang = request.getParameter("favLang");
		String homeTown = request.getParameter("homeTown");
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        out.write("<h1>Welcome, " + firstName + " " + lastName + "</h1>");
        out.write("<h3>Your favorite language is: " + favLang + "</h3>");
        out.write("<h3>Your Home Town is: " + homeTown + "</h3>");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
