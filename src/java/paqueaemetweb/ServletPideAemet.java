/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paqueaemetweb;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.jdom2.Document;

/**
 *
 * @author Mañanas
 */
@WebServlet(name = "ServletPideAemet", urlPatterns = {"/ServletPideAemet"})
public class ServletPideAemet extends HttpServlet {

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
        
        String municipio=request.getParameter("municipio");
        String provincia=request.getParameter("id_provincia");
        //Fabricar el codigo para la peticion
        //XXYYY XX es provincia y YYY es municipio
        if(provincia.length()<2) 
        {
            provincia="0"+provincia;
        }
        while(municipio.length()<3)
        {
            municipio="0"+municipio;
        }
        String codigo=provincia+municipio;
        String xml_respuesta=AccesoWeb.pedirXML(codigo);
        Document documento_xml=ParseaXML.convertirStringEnDocument(xml_respuesta);
        Clima c=ParseaXML.parsearXML(documento_xml);
        request.setAttribute("clima", c);
        request.getRequestDispatcher("verclima.jsp").forward(request, response);
        //Hacer peticion
        //Parsear
        //Enviar a verclima.jsp y que aquí se pinte una tabla
        
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
