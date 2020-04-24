package com.kobe.practice.decorator.mall;

import java.math.BigDecimal;

/**
 * @ClassName PaymentDiscountService
 * @Description PaymentDiscountService
 * @Author Tao
 * @Date: 2020-04-24 17:24
 */
public interface PaymentDiscountService extends SkuCalculationService {

    BigDecimal paymentDiscountCount();

}
