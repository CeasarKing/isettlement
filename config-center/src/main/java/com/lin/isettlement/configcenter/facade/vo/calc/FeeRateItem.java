package com.lin.isettlement.configcenter.facade.vo.calc;

import com.lin.isettlement.configcenter.facade.vo.DecisionFactor;
import lombok.Data;

import java.math.BigDecimal;
import java.util.List;

@Data
public class FeeRateItem {

    /**
     * 决策因子
     */
    private List<DecisionFactor> decisionFactors;

    /**
     * 开始范围，阶梯计费时的开始范围计算
     */
    private BigDecimal startRange;

    /**
     * 结束范围，阶梯计费时的结束范围计算
     */
    private BigDecimal endRange;

    /**
     * 计算比率
     */
    private BigDecimal rateValue;

    /**
     * 固定金额
     */
    private BigDecimal amountValue;

}
