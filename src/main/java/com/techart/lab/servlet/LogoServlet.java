package com.techart.lab.servlet;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.PushBuilder;
import java.io.IOException;

@WebServlet("/logo")
public class LogoServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        PushBuilder pushBuilder = request.newPushBuilder();
        if (pushBuilder != null) {
            pushBuilder
                    .path("images/logo.png")
                    .push();
            pushBuilder
                    .path("styles/logo.css")
                    .push();
        }

        RequestDispatcher requestDispatcher = getServletContext().getRequestDispatcher("/logo.jsp");
        requestDispatcher.forward(request, response);
    }
}
