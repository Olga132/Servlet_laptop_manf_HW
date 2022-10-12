package com.example.servlet_laptop_manf_hw;

import com.example.servlet_laptop_manf_hw.dao.LaptopDAO;
import com.example.servlet_laptop_manf_hw.model.Laptop;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.util.List;

@WebServlet(name = "LaptopServlet", value = "/laptop")
public class LaptopServlet extends HttpServlet {

    private static LaptopDAO laptopDAO;

    public void init() {
        laptopDAO = new LaptopDAO();
    }


    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

    }
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException{
        List<Laptop> listLaptop = laptopDAO.selectAllLaptop();
        request.setAttribute("listLaptop", listLaptop);
        RequestDispatcher dispatcher = request.getRequestDispatcher("laptop.jsp");
        dispatcher.forward(request, response);
    }

}
