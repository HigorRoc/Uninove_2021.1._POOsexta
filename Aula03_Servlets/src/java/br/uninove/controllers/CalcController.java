package br.uninove.controllers;

import br.uninove.model.MathClass;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class CalcController extends HttpServlet {

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
            
            double numberOne, numberTwo, result;
            String operation = request.getParameter("btCalc");
            
            numberOne = Double.parseDouble(request.getParameter("valueA"));
            numberTwo = Double.parseDouble(request.getParameter("valueB"));
            
            switch(operation){
                case "Somar": 
                    result = MathClass.somar(numberOne, numberTwo);
                    break;
                    
                case "Subtrair":
                    result = MathClass.subtrair(numberOne, numberTwo);
                    break;
                    
                case "Multiplicar":
                    result = MathClass.multiplicar(numberOne, numberTwo);
                    break;    
                    
                case "Dividir":
                    result = MathClass.dividir(numberOne, numberTwo);
                    break;
                    
                case "Elevar":
                    result = MathClass.elevar(numberOne, numberTwo);
                    break;
                    
                default:
                    result = 666;
            }
            
            response.sendRedirect("index.jsp?result=" + result + 
                    "&numberOne=" + numberOne +
                    "&numberTwo" + numberTwo);
            
            /*
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet CalcController</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Result = " + result + "</h1>");
            out.println("</body>");
            out.println("</html>");
            */
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