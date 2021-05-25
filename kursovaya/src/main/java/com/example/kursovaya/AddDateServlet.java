package com.example.kursovaya;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(value = "/AddDateServlet")
public class AddDateServlet extends HttpServlet {

    public static final String EMPTY_NAME_ERROR_MESSAGE = "Date can't be empty.";
    public static final String ERROR_PARAMETER_NAME = "error=";

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String date1 = request.getParameter("date");
        String IdStr = request.getParameter("Id");

        int Id = Integer.parseInt(IdStr);

        if (date1 == null || date1.isEmpty()) {
            response.sendRedirect("Info.jsp?Id=" + IdStr + "&" +
                    ERROR_PARAMETER_NAME +
                    EMPTY_NAME_ERROR_MESSAGE);
        }
        else {
            Date date = new Date(date1);
            Data.getInstance().addDate(Id, date);
            response.sendRedirect("Info.jsp?Id=" + IdStr );
        }


    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }


}
