package com.kobe.practice.decorator;

public class GreenTea extends Beverage {
    public String getDescription() {
        return "绿茶";
    }

    public double cost() {
        return 11;
    }
}
