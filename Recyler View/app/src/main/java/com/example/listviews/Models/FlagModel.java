package com.example.listviews.Models;

public class FlagModel {
    private int image1;  // Image resource for flag
    private String text; // Name of the country

    // Constructor
    public FlagModel(int image1, String text) {
        this.image1 = image1;
        this.text = text;
    }

    // Getter and Setter methods
    public int getImage1() {
        return image1;
    }

    public void setImage1(int image1) {
        this.image1 = image1;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
}
