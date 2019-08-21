package com.kobe.practice.decorator;

public class Mango extends Condiment {

    private Beverage beverage;

    public Mango(Beverage beverage) {
        this.beverage = beverage;
    }

    public String getDescription() {
        return beverage.getDescription() + ", 加芒果";
    }

    public double cost() {
        return beverage.cost() + 3;
    }
}
