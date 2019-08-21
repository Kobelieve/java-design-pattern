package com.kobe.practice.decorator;

public class Coffee extends Beverage {

    public String getDescription() {
        return "咖啡";
    }

    public double cost() {
        return 11;
    }
}
