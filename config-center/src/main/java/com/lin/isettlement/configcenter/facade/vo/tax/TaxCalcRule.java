package com.lin.isettlement.configcenter.facade.vo.tax;

import lombok.Data;

/**
 * 计税规则
 */
@Data
public class TaxCalcRule {

    /**
     * 规则编码
     */
    private String taxRuleCode;
    /**
     * 版本
     */
    private Integer version;

}
