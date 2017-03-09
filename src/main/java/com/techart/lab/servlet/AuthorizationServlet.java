package com.techart.lab.servlet;

import com.techart.lab.entity.User;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by alexander on 3/5/17.
 */
@WebServlet(value = "/authorization-servlet")
public class AuthorizationServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String login = request.getParameter("login");
        String password = request.getParameter("password");
        User user = new User(login, password);
        //check in db
        request.setAttribute("user", user);
        RequestDispatcher requestDispatcher = getServletContext().getRequestDispatcher("/success-authorization.jspx");
        requestDispatcher.forward(request, response);
    }
}
