/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.cinema.controller;

import com.example.cinema.dao.UserDAO;
import com.google.gson.Gson;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;


/**
 *
 * @author cuong
 */
@WebServlet(name = "dangkyController", urlPatterns = {"/dang-ky/*"})
public class dangkyController extends HttpServlet {
    UserDAO userDAO = new UserDAO();
    Gson gson = new Gson();
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("UTF-8");
        
        String email = req.getParameter("email");
        String passWord = req.getParameter("matKhau");
//        if(userDAO.checkExistsUser(email)){
//            userDAO.insert(new User(email, passWord));
//        }
//        else{
//            
//        }
        req.setAttribute("thong-bao", "Thanh cong");
        resp.getWriter().print(gson.toJson("Thành công"));
        
    }

    

}
