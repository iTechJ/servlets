package com.techart.lab.servlet;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Created by alexander on 2/27/17.
 */
@WebServlet(value = "/annotation-servlet")
public class AnnotationServlet extends HttpServlet {

    public AnnotationServlet() {}

    @Override
    public void init() {
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        PrintWriter pw = response.getWriter();
        pw.write("Annotation Servlet!");
    }

    @Override
    public void destroy() {
    }
}
