package ru.maxima;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "getCookiesServlet", value = "/get-cookies-servlet")
public class GetCookiesServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {

        Cookie[] cookies = req.getCookies();
        PrintWriter pw = resp.getWriter();
        pw.println("<html>");

        if (cookies.length > 1) {
            for (Cookie c : cookies) {
                pw.println("<h1>" + c.getName() + " : " + c.getValue() + "</h1>");
            }
        } else {
            pw.println("<h1> You not have cookies, click link to set cookies </h1>");
            pw.println("<a href=" + "set-cookies-servlet"
            + ">http://localhost:8080/set-cookies-servlet</a>");
        }
        pw.println("</html>");
    }
}
