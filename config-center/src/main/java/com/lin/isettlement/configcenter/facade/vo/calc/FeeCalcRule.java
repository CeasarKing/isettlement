package com.lin.isettlement.configcenter.facade.vo.calc;

import lombok.Data;

@Data
public class FeeCalcRule {

    /**
     * 规则编码
     */
    private String calcRuleCode;

    /**
     * 规则版本
     */
    private Integer version;

    /**
     * 费用类型
     */
    private String feeType;

    /**
     * 计算的金额依据：按照基础金额、按照计费笔数
     */
    private String calcBasis;

    /**
     * 计算公式：特定的计算公式
     */
    private String calFormula;

    /**
     * 计算模式：按笔计费、按周期计费、按数量计费
     */
    private String calMode;

    /**
     * 计算周期：按天、按周、按月、按季度、按年
     */
    private String calCycle;

    /**
     * 费用小数四舍五入规则
     */
    private String feeAmountRounding;

    /**
     * 费率规则
     */
    private FeeRateRule feeRate;

}
