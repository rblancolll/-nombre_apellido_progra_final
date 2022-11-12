<%-- 
    Document   : delete
    Created on : 12/11/2022, 00:48:12
    Author     : PC GAMING
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page import="java.sql.*"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
          <head>
                    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
                    <title>JSP Page</title>
          </head>
          <body>
                    <%

                              Connection conn;
                              String url = "jdbc:mysql://localhost:3306/practica";
                              String Driver = "com.mysql.jdbc.Driver";
                              String user = "Romeo";
                              String pass = "";
                              try {
                                        Class.forName(Driver);
                                        conn = DriverManager.getConnection(url, user, pass);
                                        PreparedStatement ps;

                                        String id = request.getParameter("id");
                                        ps = conn.prepareStatement("delete from practica.libro where id_libro=" + id);
                                        ps.executeUpdate();
                                        response.sendRedirect("LibroReport.jsp");
                              } catch (Exception e) {
                                        request.setAttribute("error", 1);
                                        request.setAttribute("message", "No puede ser eliminado por que esta conectado aun profesor ");
                                        request.getRequestDispatcher("/LibroReport.jsp").forward(request, response);
                              }
                    %>
          </body>
</html>
