package com.example.carapp;

public class CarModel {
    private String carName;
    private String year;
    private String color;
    private String price;
    private String engineSize;

    public void setCarName(String carName) {
        this.carName = carName;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public void setEngineSize(String engineSize) {
        this.engineSize = engineSize;
    }

    public String getCarName() {
        return carName;
    }

    public String getYear() {
        return year;
    }

    public String getColor() {
        return color;
    }

    public String getPrice() {
        return price;
    }

    public String getEngineSize() {
        return engineSize;
    }
}
