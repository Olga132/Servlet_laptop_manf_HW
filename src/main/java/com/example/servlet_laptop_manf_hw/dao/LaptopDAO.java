package com.example.servlet_laptop_manf_hw.dao;

import com.example.servlet_laptop_manf_hw.model.Laptop;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class LaptopDAO {

    private static final String SELECT_ALL_LAPTOP = "select * from laptop_models";

    public List<Laptop> selectAllLaptop() {

        List<Laptop> laptopList = new ArrayList<>();

        try (Connection connection = DBConnection.openDBConnection()) {
            assert connection != null;
            Statement statement = connection.createStatement();

            ResultSet resultSet = statement.executeQuery(SELECT_ALL_LAPTOP);

            while (resultSet.next()) {
                int id = resultSet.getInt(1);
                String name = resultSet.getString(2);
                String characteristics = resultSet.getString(3);
                String srcImg = resultSet.getString(4);
                laptopList.add(new Laptop(id,name,characteristics,srcImg));
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

        return laptopList;
    }

}
