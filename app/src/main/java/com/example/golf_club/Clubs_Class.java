package com.example.golf_club;

public class Clubs_Class {
    private final int img;
    private final String name;
    private final String description;

    public Clubs_Class(int img, String name, String description) {
        this.img = img;
        this.name = name;
        this.description = description;
    }

    public int getImg() {
        return img;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

}
