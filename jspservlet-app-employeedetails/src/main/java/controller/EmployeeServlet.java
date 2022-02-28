package controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import java.io.*;

import javax.servlet.http.HttpServlet;


public class EmployeeServlet extends HttpServlet {
public void doGet(HttpServletRequest req,HttpServletResponse res)  
throws ServletException,IOException
{  
res.setContentType("text/html");
PrintWriter pw=res.getWriter();  
 
pw.println("<html><body>");  
pw.println("Welcome to servlet");  
pw.println("</body></html>");  
  
pw.close();
}} 

