package com.example.kursovaya;


        import javax.servlet.ServletException;
        import javax.servlet.annotation.WebServlet;
        import javax.servlet.http.HttpServlet;
        import javax.servlet.http.HttpServletRequest;
        import javax.servlet.http.HttpServletResponse;
        import java.io.IOException;
        import java.util.Set;

@WebServlet("/currencyInfo.jsp")
public class CurrencyInfoServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setAttribute("currencies", Data.getInstance().getCurrencies());
        request.setAttribute("error",request.getParameter("error"));
        getServletContext().getRequestDispatcher("/currency.jsp").forward(request, response);
    }
    @Override
    public void destroy() {
    }

}
