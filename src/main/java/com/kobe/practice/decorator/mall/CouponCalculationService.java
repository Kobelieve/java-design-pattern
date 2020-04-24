package com.kobe.practice.decorator.mall;

import java.math.BigDecimal;

/**
 * @ClassName CouponCalculationService
 * @Description CouponCalculationService
 * @Author Tao
 * @Date: 2020-04-24 13:42
 */
public interface CouponCalculationService extends SkuCalculationService {

    BigDecimal couponCost();

}
