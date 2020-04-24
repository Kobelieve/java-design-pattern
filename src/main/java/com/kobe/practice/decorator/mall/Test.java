package com.kobe.practice.decorator.mall;

import com.kobe.practice.decorator.mall.impl.CouponCalculationServiceImpl;
import com.kobe.practice.decorator.mall.impl.PaymentDiscountServiceImpl;
import com.kobe.practice.decorator.mall.impl.SkuCalculationServiceImpl;

import java.math.BigDecimal;

/**
 * @ClassName Test
 * @Description Test
 * @Author Tao
 * @Date: 2020-04-24 13:40
 */
public class Test {

    public static SkuCalculationService skuCalculationService = new SkuCalculationServiceImpl();
    public static CouponCalculationService couponCalculationService = new CouponCalculationServiceImpl();
    public static PaymentDiscountService paymentDiscountService = new PaymentDiscountServiceImpl();

    public static void main(String[] args) {

        paymentDiscountService.setSkuCalculationService(skuCalculationService);
        couponCalculationService.setSkuCalculationService(paymentDiscountService);
        BigDecimal cost = couponCalculationService.cost();
        System.out.println("最终的价格: " + cost);

    }


}
