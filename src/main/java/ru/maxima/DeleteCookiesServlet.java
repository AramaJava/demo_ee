package ru.maxima;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebServlet(name = "DeleteCookiesServlet", value = "/delete-cookies-servlet")
public class DeleteCookiesServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {
        Cookie cookie1 = new Cookie("jsessionId", "");
        Cookie cookie2 = new Cookie("jsessionName", "");
        cookie1.setMaxAge(0);
        cookie2.setMaxAge(0);
        resp.addCookie(cookie1);
        resp.addCookie(cookie2);
    }
}
