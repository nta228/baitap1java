package fpt.aptech.t2009m1helloworld.controller;

import fpt.aptech.t2009m1helloworld.entity.Account;
import fpt.aptech.t2009m1helloworld.entity.User;
import fpt.aptech.t2009m1helloworld.model.MySqlAccountModel;
import javafx.scene.canvas.GraphicsContext;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class RegisterServlet extends HttpServlet {
    private MySqlAccountModel mySqlAccountModel;
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.getRequestDispatcher("/user/register.jsp").forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("UTF-8");
        resp.setContentType("text/html; charset=UTF-8");
        resp.setCharacterEncoding("UTF-8");
        String username = req.getParameter("username");
        String password = req.getParameter("password");
        String confirmPassword = req.getParameter("confirmPassword");
        String fullName = req.getParameter("fullName");
        String email = req.getParameter("email");
        String phone = req.getParameter("phone");
        String birthday = req.getParameter("birthday");
        Account account = new Account();
        User user = new User();
        account.setUsername(username);
        account.setPassword(password);
        account.setFullName(fullName);
        account.setEmail(email);
        account.setPhone(phone);
        account.setBirthday(birthday);
        mySqlAccountModel.save(user);
        req.setAttribute("account", account);
        req.getRequestDispatcher("/user/register-success.jsp").forward(req, resp);


    }
}
