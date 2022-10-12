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
import java.util.List;

@WebServlet(name = "FullNewsServlet", value = "/fullNews")
public class FullNewsServlet extends HttpServlet {

    private static NewsDAO newsDAO;

    public void init() {
        newsDAO = new NewsDAO();
    }
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        int id = Integer.parseInt(req.getParameter("id"));
        News existingNews = newsDAO.selectNews(id);
        String existingTextNews = newsDAO.getFullTextNewsById(id);
        List<String> existingImg = newsDAO.getUrlImgNewsById(id);
        RequestDispatcher dispatcher = req.getRequestDispatcher("full-news.jsp");
        req.setAttribute("nameNews",existingNews.getName());
        req.setAttribute("news", existingNews);
        req.setAttribute("imgList", existingImg);
        req.setAttribute("textNews",existingTextNews);
        dispatcher.forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

    }
}
