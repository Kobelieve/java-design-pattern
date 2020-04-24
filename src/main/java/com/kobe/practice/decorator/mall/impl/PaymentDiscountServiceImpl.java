package com.kobe.practice.decorator.mall.impl;

import com.kobe.practice.decorator.mall.PaymentDiscountService;
import com.kobe.practice.decorator.mall.SkuCalculationService;

import java.math.BigDecimal;

/**
 * @ClassName PaymentDiscountServiceImpl
 * @Description PaymentDiscountServiceImpl
 * @Author Tao
 * @Date: 2020-04-24 17:26
 */
public class PaymentDiscountServiceImpl implements PaymentDiscountService {

    private SkuCalculationService skuCalculationService;

    @Override
    public BigDecimal cost() {
        return skuCalculationService.cost().subtract(paymentDiscountCount());
    }

    @Override
    public void setSkuCalculationService(SkuCalculationService skuCalculationService) {
        this.skuCalculationService = skuCalculationService;
    }

    @Override
    public BigDecimal paymentDiscountCount() {
        BigDecimal price = new BigDecimal("20");
        System.out.println("支付优惠金额: " + price);
        return price;
    }
}
