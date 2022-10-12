package com.example.servlet_laptop_manf_hw;

import com.example.servlet_laptop_manf_hw.dao.NewsDAO;
import com.example.servlet_laptop_manf_hw.model.News;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

@WebServlet(name = "NewsServlet", value = "/news")
public class NewsServlet extends HttpServlet {

    private static NewsDAO newsDAO;

    public void init() {
        newsDAO = new NewsDAO();
    }


    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

    }
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException{
        List<News> listNews = newsDAO.selectAllNews();
        request.setAttribute("listNews", listNews);
        RequestDispatcher dispatcher = request.getRequestDispatcher("news.jsp");
        dispatcher.forward(request, response);
    }


}
