package com.kobe.practice.decorator;

public class Test {

    public static void main(String[] args) {

        // 一份绿茶
        Beverage beverage = new GreenTea();

        // 开始装饰
        // 加柠檬
        beverage = new Lemon(beverage);
        // 加芒果
        beverage = new Mango(beverage);

        System.out.println(beverage.getDescription() + "," + beverage.cost());

        new Mango(new Lemon(new Lemon(new BlackTea())));

    }

}
