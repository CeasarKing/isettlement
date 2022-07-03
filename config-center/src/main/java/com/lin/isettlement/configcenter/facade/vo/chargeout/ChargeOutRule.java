package com.lin.isettlement.configcenter.facade.vo.chargeout;

import lombok.Data;

/**
 * 出账规则
 */
@Data
public class ChargeOutRule {

    /**
     * 编码
     */
    private String chargeOutRuleCode;
    /**
     * 版本
     */
    private Integer version;
    /**
     * 结算模式
     */
    private String settleMode;
    /**
     * 结算周期
     */
    private String settleCycle;
    /**
     * 结算对象
     */
    private String settleTarget;

}
