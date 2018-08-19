/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sgc.controller;

import com.sgc.model.BookDAO;
import com.sgc.model.book;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Saruga
 */
@WebServlet(name = "ListController", urlPatterns = {"/ListController"})
public class ListController extends HttpServlet {
    book book = new book();

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet ListController</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet ListController at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        //processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        //processRequest(request, response);
//             book.setBookId(request.getParameter("BookId"));
//             book.setTitle(request.getParameter("Title"));
//             book.setAuthor(request.getParameter("Author"));
//             book.setMainClassification(request.getParameter("MainClassificationId"));
//             book.setSubClassification(request.getParameter("SubClassificationId"));
//             book.setYearOfPublishing(Integer.parseInt(request.getParameter("YearOfPublishing")));
//             book.setLastPrintedYear(Integer.parseInt(request.getParameter("LastPrintedYear")));
//             book.setIsbnNo(request.getParameter("ISBNNO"));
//             book.setNoOfPages(Integer.parseInt(request.getParameter("NoOfPages")));
 String mname=request.getParameter("mainClassification");
        BookDAO b=new BookDAO();
       List x= b.Subclassificationname(mname);
       List y=b.M_name();
       request.setAttribute("subclassificationList", x);
       request.setAttribute("mainclassificationList", y);
       ServletContext context=getServletContext();
        request.setAttribute("BookId", request.getParameter("BookId"));
        request.setAttribute("Title", request.getParameter("Title"));
        request.setAttribute("Author", request.getParameter("Author"));
        request.setAttribute("MainClassificationId", request.getParameter("MainClassificationId"));
        request.setAttribute("SubClassificationId", request.getParameter("SubClassificationId"));
        request.setAttribute("YearOfPublishing", request.getParameter("YearOfPublishing"));
        request.setAttribute("LastPrintedYear", request.getParameter("LastPrintedYear"));
        request.setAttribute("ISBNNO", request.getParameter("ISBNNO"));
       
        
        
        RequestDispatcher rd=context.getRequestDispatcher("/addBook.jsp");
        rd.forward(request, response);
    }
    

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
