package com.bitm.recyclerview;

public class User {
    private String name;
    private int image;
    private String mobileNumber;

    public User() {
    }

    public User(String name, int image, String mobileNumber) {
        this.name = name;
        this.image = image;
        this.mobileNumber = mobileNumber;
    }

    public String getName() {
        return name;
    }

    public int getImage() {
        return image;
    }

    public String getMobileNumber() {
        return mobileNumber;
    }
}
