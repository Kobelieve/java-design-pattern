package com.kobe.practice.decorator.mall.impl;

import com.kobe.practice.decorator.mall.CouponCalculationService;
import com.kobe.practice.decorator.mall.SkuCalculationService;

import java.math.BigDecimal;

/**
 * @ClassName CouponCalculationServiceImpl
 * @Description CouponCalculationServiceImpl
 * @Author Tao
 * @Date: 2020-04-24 13:43
 */
public class CouponCalculationServiceImpl implements CouponCalculationService {

    private SkuCalculationService skuCalculationService;

    @Override
    public BigDecimal couponCost() {
        BigDecimal price = new BigDecimal("10");
        System.out.println("满减优惠券: " + price);
        return price;
    }

    @Override
    public BigDecimal cost() {
        return skuCalculationService.cost().subtract(couponCost());
    }

    @Override
    public void setSkuCalculationService(SkuCalculationService skuCalculationService) {
        this.skuCalculationService = skuCalculationService;
    }

}
