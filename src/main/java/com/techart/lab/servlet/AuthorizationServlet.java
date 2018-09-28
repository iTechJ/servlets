package com.techart.lab.servlet;

import com.techart.lab.entity.User;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(value = "/authorization")
public class AuthorizationServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String login = request.getParameter("login");
        String password = request.getParameter("password");

        User user = new User(login, password);

        request.setAttribute("user", user);

        RequestDispatcher requestDispatcher = getServletContext().getRequestDispatcher("/success-authorization.jspx");
        requestDispatcher.forward(request, response);
    }
}
