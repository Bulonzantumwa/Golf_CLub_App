package com.example.golf_club;

public class Clubs_Class {
    private int img;
    private String name;
    private String email;

    public Clubs_Class(int img, String name, String email) {
        this.img = img;
        this.name = name;
        this.email = email;
    }

    public int getImg() {
        return img;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

}
