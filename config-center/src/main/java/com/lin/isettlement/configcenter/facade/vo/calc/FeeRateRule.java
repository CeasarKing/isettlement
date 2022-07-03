package com.lin.isettlement.configcenter.facade.vo.calc;

import lombok.Data;

import java.math.BigDecimal;
import java.util.List;

/**
 * 费率规则，用于得出计算中需要使用的比率和固定值
 */
@Data
public class FeeRateRule {

    /**
     * 费率类型：指定费率、费率单位、金额单位、金额+费率
     */
    private String feeRateType;

    /**
     * 是否指定计费
     */
    private Boolean specificFeeAmount;

    /**
     * 固定金额
     */
    private BigDecimal fixedAmount;

    /**
     * 计算封顶值
     */
    private BigDecimal topFeeAmount;

    /**
     * 计算保底值
     */
    private BigDecimal bottomFeeAmount;

    /**
     * 费率表
     */
    private List<FeeRateItem> feeRates;

}
