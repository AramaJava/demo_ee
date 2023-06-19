package ru.maxima;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name="helloServlet", value = "/hello-servlet")
public class FirstServlet extends HttpServlet {
    private String message;

    public void init() {
        message = "It's from Servlet";
    }
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        resp.setContentType("text/html");

        PrintWriter pw = resp.getWriter();
        pw.println("<html><body>");
        pw.println("<h1>" + message + "</h1>");
        pw.println("</body></html>");
    }

    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doPost(req, resp);
    }
}