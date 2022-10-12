package com.example.servlet_laptop_manf_hw.dao;

import com.example.servlet_laptop_manf_hw.model.News;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class NewsDAO {

    private static final String SELECT_ALL_NEWS = "select * from news";
    private static final String SELECT_NEWS_BY_ID = "select idnews, news_name, news_text, news_img,news_src_img from news where idnews =?";

    private static final String SELECT_IMG_NEWS_BY_ID = "SELECT news_src_img FROM images where news_id = ?;";

    private static final String SELECT_TEXT_NEWS_BY_ID = "SELECT full_text FROM full_news_text where idnews = ?;";

    public List<News> selectAllNews() {

        List<News> newsList = new ArrayList<>();

        try (Connection connection = DBConnection.openDBConnection()) {
            assert connection != null;
            Statement statement = connection.createStatement();

            ResultSet resultSet = statement.executeQuery(SELECT_ALL_NEWS);

            while (resultSet.next()) {
                int id = resultSet.getInt(1);
                String name = resultSet.getString(2);
                String text = resultSet.getString(3);
                byte[] img = resultSet.getBytes(4);
                String srcImg = resultSet.getString(5);
                newsList.add(new News(id,name,text,img,srcImg));
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

        return newsList;
    }

    public News selectNews(int id) {

        News news = null;

        try (Connection connection = DBConnection.openDBConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(SELECT_NEWS_BY_ID)) {
            preparedStatement.setInt(1, id);
            ResultSet rs = preparedStatement.executeQuery();

            while (rs.next()) {
                String name = rs.getString(2);
                String text = rs.getString(3);
                byte[] img = rs.getBytes(4);
                String srcImg = rs.getString(5);
                news = new News(id, name, text, img, srcImg);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return news;
    }

    public List<String> getUrlImgNewsById(int id){

        List<String> listUrlImg = new ArrayList<>();
        try (Connection connection = DBConnection.openDBConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(SELECT_IMG_NEWS_BY_ID)) {
            preparedStatement.setInt(1, id);
            ResultSet rs = preparedStatement.executeQuery();

            while (rs.next()) {
                listUrlImg.add(rs.getString(1));
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

        return listUrlImg;
    }

    public String getFullTextNewsById(int id){
        String fullText = "";

        try (Connection connection = DBConnection.openDBConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(SELECT_TEXT_NEWS_BY_ID)) {
            preparedStatement.setInt(1, id);
            ResultSet rs = preparedStatement.executeQuery();

            while (rs.next()) {
                fullText = rs.getString(1);
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return fullText;

    }



}
