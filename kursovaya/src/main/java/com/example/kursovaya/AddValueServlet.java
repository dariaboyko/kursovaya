package com.example.kursovaya;


import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;



@WebServlet(value = "/AddValueServlet")
public class AddValueServlet extends HttpServlet {

    public static final String EMPTY_NAME_ERROR_MESSAGE = "can't be empty.";
    public static final String ERROR_PARAMETER_NAME = "error=";

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String value = request.getParameter("value");
        String IdStr = request.getParameter("Id");
        if (value == null || value.isEmpty()) {
            response.sendRedirect("Info.jsp?Id=" + IdStr + "&" +
                    ERROR_PARAMETER_NAME +
                    EMPTY_NAME_ERROR_MESSAGE);}

            else {
            Value val1 = new Value(value);
            int id = Integer.parseInt(IdStr);
            Data.getInstance().addValue(id, val1);
            response.sendRedirect("Info.jsp?Id=" + IdStr);
            }




    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
    @Override
    public void destroy() {
    }

}
