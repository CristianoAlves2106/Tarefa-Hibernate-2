/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ifmt.dai.escola;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author 02376421152
 */
public class GravarEventos extends HttpServlet {

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
        String evento =request.getParameter("evento");
        String dataEvento =request.getParameter("dataEvento");
        response.setContentType("text/html;charset=IS0=8859-1");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title> Gravando Eventos no Hibernate</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h2>Gravando Eventos no Hibernate </h2>");
            out.println("evento: "+evento+"<br>");
            out.println("Data: "+dataEvento+"<br>");
            GerenciadorEventos c=new GerenciadorEventos();
            c.salvarEvento(evento, dataEvento);
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
           String evento =request.getParameter("evento");
        String dataEvento =request.getParameter("dataEvento");
        response.setContentType("text/html;charset=IS0=8859-1");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title> Gravando Eventos no Hibernate</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h2>Gravando Eventos no Hibernate </h2>");
            out.println("evento: "+evento+"<br>");
            out.println("Data: "+dataEvento+"<br>");
            GerenciadorEventos c=new GerenciadorEventos();
            c.salvarEvento(evento, dataEvento);
            out.println("</body>");
            out.println("</html>");
        }
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
        processRequest(request, response);
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
