/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lista.one.inicio;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Gomes
 */
@WebServlet(name = "exercicio1", urlPatterns = {"/exercicio1.do"})
public class exercicio1 extends HttpServlet {

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
            out.println("<style> "
                    + "body{background-color:#ddd;}"
                    + "tabela{margin: 0 auto;}"
                    + "</style>");
            out.println("<title>Exercicio 1</title>");            
            out.println("</head>");
            out.println("<body >");
            
            out.println("<h1>Tabela 2xN</h1>");
            out.println("<table  id=\"tabela\" bgcolor=#fff >");
            for(int i = 1;i<=20;i++){
                out.println("<tr> ");
                out.println("<td ><img src=\"/Listaone/img/"+i+".jpeg\" alt=\"cerveja\" height=\"242\" width=\"242\"> </td>");
                i++;
                out.println("<td><img src=\"/Listaone/img/"+i+".jpeg\" alt=\"cerveja\" height=\"242\" width=\"242\"></td>");            
                out.println("</tr>");
            }
            out.println("<tr> ");
            out.println("<td colspan=\"2\" ><img src=\"/Listaone/img/x.jpeg\" alt=\"cerveja\" height=\"450\" width=\"470\"> </td>");
            out.println("</tr>");
            
            out.println("</table>");
            
            out.println("<h1>Tabela 3xN</h1>");
            out.println("<table  id=\"tabela\" bgcolor=#fff >");
            for(int i = 1;i<=20;i++){
                out.println("<tr> ");
                out.println("<td ><img src=\"/Listaone/img/"+i+".jpeg\" alt=\"cerveja\" height=\"242\" width=\"242\"> </td>");
                i++;
                out.println("<td><img src=\"/Listaone/img/"+i+".jpeg\" alt=\"cerveja\" height=\"242\" width=\"242\"></td>");            
                i++;
                out.println("<td><img src=\"/Listaone/img/"+i+".jpeg\" alt=\"cerveja\" height=\"242\" width=\"242\"></td>");            
                out.println("</tr>");
            }
            
            out.println("<tr> ");
            out.println("<td colspan=\"3\" ><img src=\"/Listaone/img/x.jpeg\" alt=\"cerveja\" height=\"550\" width=\"670\"> </td>");
            out.println("</tr>");
            out.println("</table>");
            
            out.println("<h1>Tabela 7xN</h1>");
            out.println("<table  id=\"tabela\" bgcolor=#fff >");
            for(int i = 1;i<=20;i++){
                out.println("<tr> ");
                out.println("<td ><img src=\"/Listaone/img/"+i+".jpeg\" alt=\"cerveja\" height=\"242\" width=\"242\"> </td>");
                i++;
                out.println("<td><img src=\"/Listaone/img/"+i+".jpeg\" alt=\"cerveja\" height=\"242\" width=\"242\"></td>");            
                i++;
                out.println("<td><img src=\"/Listaone/img/"+i+".jpeg\" alt=\"cerveja\" height=\"242\" width=\"242\"></td>");            
                i++;
                out.println("<td><img src=\"/Listaone/img/"+i+".jpeg\" alt=\"cerveja\" height=\"242\" width=\"242\"></td>");            
                i++;
                out.println("<td><img src=\"/Listaone/img/"+i+".jpeg\" alt=\"cerveja\" height=\"242\" width=\"242\"></td>");            
                i++;
                out.println("<td><img src=\"/Listaone/img/"+i+".jpeg\" alt=\"cerveja\" height=\"242\" width=\"242\"></td>");            
                i++;
                out.println("<td><img src=\"/Listaone/img/"+i+".jpeg\" alt=\"cerveja\" height=\"242\" width=\"242\"></td>");            
                out.println("</tr>");
            }
            out.println("<tr> ");
            out.println("<td colspan=\"7\" ><img src=\"/Listaone/img/x.jpeg\" alt=\"cerveja\" height=\"900\" width=\"1270\"> </td>");
            out.println("</tr>");
            out.println("</table>");
            
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
        processRequest(request, response);
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
