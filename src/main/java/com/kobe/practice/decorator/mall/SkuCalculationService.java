package com.kobe.practice.decorator.mall;

import java.math.BigDecimal;

/**
 * @InterfaceName SkuCalculationService
 * @Description TODO
 * @Author Tao
 * @Date: 2020-04-24 13:33
 */
public interface SkuCalculationService {

    BigDecimal cost();

    default void setSkuCalculationService(SkuCalculationService skuCalculationService) {

    }
}
