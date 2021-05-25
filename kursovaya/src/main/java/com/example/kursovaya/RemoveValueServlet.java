package com.example.kursovaya;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;


@WebServlet(value = "/RemoveValueServlet")
public class RemoveValueServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String vidStr = request.getParameter("valueId");
        String IdStr = request.getParameter("Id");
        int cId = Integer.parseInt(IdStr);
        int vId = Integer.parseInt(vidStr);
        Currency cur = Data.getInstance().getCurrencyById(cId);
        Value val = Data.getInstance().getValueById(cId, vId);
        Data.getInstance().removeValue(cur, val);
        response.sendRedirect("Info.jsp?Id="+IdStr);
    }
    @Override
    public void destroy() {
    }


}
