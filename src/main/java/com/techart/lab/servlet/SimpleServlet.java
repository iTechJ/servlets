package com.techart.lab.servlet;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Created by alexander on 2/27/17.
 */
public class SimpleServlet extends HttpServlet {

    public SimpleServlet() {}

    @Override
    public void init() {
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        PrintWriter pw = response.getWriter();
        pw.write("Simple Servlet!");
    }

    @Override
    public void destroy() {
    }
}
