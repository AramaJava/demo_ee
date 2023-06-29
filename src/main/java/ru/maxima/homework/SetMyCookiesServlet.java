package ru.maxima.homework;

import jakarta.servlet.*;
import jakarta.servlet.http.*;

import java.io.IOException;

public class SetMyCookiesServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Cookie cookie1 = new Cookie("some_id", "123");
        Cookie cookie2 = new Cookie("some_name", "Tom");
        cookie1.setMaxAge(86400);
        cookie2.setMaxAge(86400);

        response.addCookie(cookie1);
        response.addCookie(cookie2);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
