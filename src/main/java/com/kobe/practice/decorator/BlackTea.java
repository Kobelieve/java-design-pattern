package com.kobe.practice.decorator;

public class BlackTea extends Beverage {
    public String getDescription() {
        return "红茶";
    }

    public double cost() {
        return 10;
    }
}
