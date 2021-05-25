package com.example.kursovaya;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;


@WebServlet("/Info.jsp")
public class InfoServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String Id = request.getParameter("Id");
        int intId = Integer.parseInt(Id);
        request.setAttribute("value", Data.getInstance().getCurrencyById(intId).getValue());
        request.setAttribute("date", Data.getInstance().getCurrencyById(intId).getDate());
        request.setAttribute("error",request.getParameter("error"));
        getServletContext().getRequestDispatcher("/valueAndDate.jsp?Id="+Id).forward(request, response);
    }
}
