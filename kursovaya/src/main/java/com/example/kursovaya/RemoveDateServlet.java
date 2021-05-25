package com.example.kursovaya;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(value = "/RemoveDateServlet")
public class RemoveDateServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String curId = request.getParameter("Id");
        String dateId = request.getParameter("dateId");
        int cId = Integer.parseInt(curId);
        int dId = Integer.parseInt(dateId);
        Currency currency = Data.getInstance().getCurrencyById(cId);
        Date date = Data.getInstance().getDateById(cId,dId);
        Data.getInstance().removeDate(currency, date);
        response.sendRedirect("Info.jsp?Id=" + curId );
    }



}
