package ru.maxima.homework;

import jakarta.servlet.*;
import jakarta.servlet.http.*;

import java.io.IOException;
import java.io.PrintWriter;

public class GetMyCookiesServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Cookie[] cookies = request.getCookies();
        PrintWriter pw = response.getWriter();
        pw.println("<html>");

        if (cookies != null) {
            for (Cookie cookie : cookies) {
                pw.println("<h1>" + cookie.getName() + ":" + cookie.getValue() + "</h1>");
            }
        } else {
            pw.println();
            pw.println("<h1> You not have cookies, click link to set cookies </h1>");
            pw.println("<a href=" + "set-cookies" + ">http://localhost:8080/set-cookies</a>");
        }
        pw.println("</html>");
    }


    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

}
