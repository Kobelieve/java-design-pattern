package com.kobe.practice.decorator.mall.impl;

import com.kobe.practice.decorator.mall.SkuCalculationService;

import java.math.BigDecimal;

/**
 * @ClassName SkuCalculationServiceImpl
 * @Description SkuCalculationServiceImpl
 * @Author Tao
 * @Date: 2020-04-24 13:34
 */
public class SkuCalculationServiceImpl implements SkuCalculationService {

    @Override
    public BigDecimal cost() {
        BigDecimal price = new BigDecimal(100);
        System.out.println("sku从数据库查出来的价格:" + price);
        return price;
    }

}
