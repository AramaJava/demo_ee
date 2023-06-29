package ru.maxima;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "helloServlet", value = "/hello-servlet")
public class FirstServlet extends HttpServlet {

   /* ТЕКСТ ЗАДАНИЯ
    Сделать JSP с презентацией себя,
    где в заголовке будет ваша ФИО,
    в <head></head> будет краткая информация о вас,
    и в <body></body> будет 2-3 строки о вас чуть более полно.
    Необходимо информацию в теле страницы сделать минимум 2 размерами/шрифтами
    */

    public void init() {
        String message = "It's from Servlet";
    }

    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException {
      /*  String name = req.getParameter("name");
        String surname = req.getParameter("surname");*/
        HttpSession session = req.getSession();

        Integer count = (Integer) session.getAttribute("count");
        if (count == null) {
            session.setAttribute("count", 1);
        } else {
            session.setAttribute("count", count + 1);
        }

        resp.setContentType("text/html");

        PrintWriter pw = resp.getWriter();
        pw.println("<html><body>");

    //  pw.println("<h1>" + message + "</h1>");
    //  pw.println("<h1> Hello " + name + " " + surname + "</h1>");

        pw.println("<h1> Count = " + count + "</h1>");
        pw.println("</body></html>");
    }

}
