package com.kobe.practice.decorator;

public class Lemon extends Condiment {

    private Beverage beverage;

    public Lemon(Beverage beverage) {
        this.beverage = beverage;
    }

    public String getDescription() {
        return beverage.getDescription() + "，加柠檬";
    }

    public double cost() {
        return beverage.cost() + 2;
    }
}
