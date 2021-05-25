package com.example.kursovaya;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;



@WebServlet(value = "/AddCurrencyServlet")
public class AddCurrencyServlet extends HttpServlet {
    public static final String EMPTY_NAME_ERROR_MESSAGE = "Currency name can't be empty.";
    public static final String NON_UNIQUE_NAME_ERROR_MESSAGE = "Currency already exists";
    public static final String ERROR_PARAMETER_NAME = "error=";

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String currencyName = request.getParameter("currency");


        if (currencyName == null || currencyName.isEmpty()) {
            response.sendRedirect("currencyInfo.jsp?" +
                    ERROR_PARAMETER_NAME +
                    EMPTY_NAME_ERROR_MESSAGE);
        } else if (Data.getInstance().hasCurrency(currencyName)) {
            response.sendRedirect("currencyInfo.jsp?" +
                    ERROR_PARAMETER_NAME +
                    NON_UNIQUE_NAME_ERROR_MESSAGE);
        } else {
            Currency currency = new Currency(currencyName);
            Data.getInstance().addCurrency(currency);
            response.sendRedirect("currencyInfo.jsp");
        }


    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
    @Override
    public void destroy() {
    }
}