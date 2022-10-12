package com.example.servlet_laptop_manf_hw.model;

public class Laptop {
    private int id;
    private String name;
    private String characteristics;
    private String srcImg;

    public Laptop(int id, String name, String characteristics, String srcImg) {
        this.id = id;
        this.name = name;
        this.characteristics = characteristics;
        this.srcImg = srcImg;
    }

    public String getName() {
        return name;
    }

    public String getCharacteristics() {
        return characteristics;
    }

    public String getSrcImg() {
        return srcImg;
    }
}
