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
import java.text.ParseException;
import java.util.List;

@WebServlet(urlPatterns = {"/main",""})
public class MainServlet extends HttpServlet {

    private static NewsDAO newsDAO;

    public void init() {
        newsDAO = new NewsDAO();
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        doGet(request, response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String action = request.getServletPath();

        try {
            switch (action) {
                case "/fullNews":
                    showFullNews(request, response);
                    break;
                case "/news":
                    listNews(request, response);
                    break;
                default:
                    listHome(request, response);
                    break;
            }
        } catch (SQLException ex) {
            throw new ServletException(ex);
        }
    }


    private void listHome(HttpServletRequest request, HttpServletResponse response)
            throws SQLException, IOException, ServletException {
//        List<Entry> listEntries = entryDAO.selectAllEntries();
//        request.setAttribute("listEntry", listEntries);
//        request.setAttribute("listSum",entryDAO.getSumEntries());
        RequestDispatcher dispatcher = request.getRequestDispatcher("main.jsp");
        dispatcher.forward(request, response);
    }

    private void listNews(HttpServletRequest request, HttpServletResponse response)
            throws SQLException, IOException, ServletException {
        RequestDispatcher dispatcher = request.getRequestDispatcher("news.jsp");
        dispatcher.forward(request, response);
    }

    private void showFullNews(HttpServletRequest request, HttpServletResponse response)
        throws  IOException, ServletException {
//        int id = Integer.parseInt(request.getParameter("id"));
//        News existingNews = newsDAO.selectNews(id);
//        String existingTextNews = newsDAO.getFullTextNewsById(id);
//        List<String> existingImg = newsDAO.getUrlImgNewsById(id);
        RequestDispatcher dispatcher = request.getRequestDispatcher("full-news.jsp");
//        request.setAttribute("news", existingNews);
//        request.setAttribute("imgList", existingImg);
//        request.setAttribute("textNews",existingTextNews);
        dispatcher.forward(request, response);
    }
}
