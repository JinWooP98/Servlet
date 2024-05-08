package com.jsp;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/Hello")
public class Hello extends HttpServlet {

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("hello!!!!! my website!");

        resp.setContentType("text/html");
        resp.setCharacterEncoding("UTF-8");

        PrintWriter w = resp.getWriter();

        w.write("<!DOCTYPE html>\n");
        w.write("<html>\n");
        w.write("<head>\n");
        w.write("</head>\n");
        w.write("<body>\n");
        w.write("   \t<h1>안녕하십니까??\n");
        w.write("   </h1>\n");
        w.write("</body>\n");
        w.write("</html>");
    }
}
