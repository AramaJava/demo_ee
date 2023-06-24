package ru.maxima;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "helloServlet", value = "/hello-servlet")
public class FirstServlet extends HttpServlet {
    private String message;

   /* ТЕКСТ ЗАДАНИЯ
    Сделать JSP с презентацией себя,
    где в заголовке будет ваша ФИО,
    в <head></head> будет краткая информация о вас,
    и в <body></body> будет 2-3 строки о вас чуть более полно.
    Необходимо информацию в теле страницы сделать минимум 2 размерами/шрифтами
    */

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

}
