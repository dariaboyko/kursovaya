package com.example.kursovaya;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;


@WebServlet(value = "/SearchDateServlet")
public class SearchDateServlet extends HttpServlet {
    public static final String EMPTY_NAME_ERROR_MESSAGE = "Date name can't be empty.";
    public static final String UNIQUE_NAME_ERROR_MESSAGE = "Date doesn`t exist";

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {



    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String dateName = request.getParameter("date");


        if (dateName == null || dateName.isEmpty()) {
            response.sendRedirect("table.jsp?" +
                    EMPTY_NAME_ERROR_MESSAGE);
        } else if (Data.getInstance().hasDate(dateName)) {
            Data.getInstance().anotherFindCurrency(dateName);
            response.sendRedirect("currencyTable.jsp");

        } else {
            response.sendRedirect("table.jsp?" +
                    UNIQUE_NAME_ERROR_MESSAGE);
        }

    }
    @Override
    public void destroy() {
    }
}