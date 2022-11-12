/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */

import Class.ProfesorArray;
import Class.ProfesorModel;
import java.io.IOException;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


/**
 *
 * @author PC GAMING
 */
@WebServlet(urlPatterns = {"/profesorController"})
public class profesorController extends HttpServlet {
ProfesorModel profe;
ProfesorArray registerTrans;
StringBuffer objectResponse = new StringBuffer();
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
          try ( PrintWriter out = response.getWriter()) {
                    
                           registerTrans = new ProfesorArray ();
                           
                           String control = request.getParameter("control");
                           if(control.toUpperCase().equals("GUARDAR")){
                                    profe= new ProfesorModel (
                                             Integer.parseInt(request.getParameter("dpi")),
                                             request.getParameter("name"),
                                             request.getParameter("apellido"),
                                             request.getParameter("clase"),
                                             Integer.parseInt(request.getParameter("code")));
                                             
                                             registerTrans.saveTrans(profe);
                                             
                                             
                           }
                           
                           else if(control.toUpperCase().equals("ELIMINAR")){
                                    int codeDelete = Integer.parseInt(request.getParameter("dpi_profesor"));
                                    registerTrans.deleteTrans(codeDelete);
                                              
                            
                           }
          
            out.write(objectResponse.toString()); 
       
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
