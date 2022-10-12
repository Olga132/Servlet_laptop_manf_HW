package com.example.servlet_laptop_manf_hw.model;

import java.util.Arrays;

public class News {
    private int id;
    private String name;
    private String text;
    private byte[] img;
    private String srcImg;

    public News(int id, String name, String text, byte[] img, String srcImg) {
        this.id = id;
        this.name = name;
        this.text = text;
        this.img = img;
        this.srcImg = srcImg;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getText() {
        return text;
    }

    public byte[] getImg() {
        return img;
    }

    public String getSrcImg() {
        return srcImg;
    }

    @Override
    public String toString() {
        return "News{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", text='" + text + '\'' +
                ", urlImg='" + srcImg + '\'' +
                '}';
    }
}
