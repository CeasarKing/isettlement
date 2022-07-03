package com.lin.isettlement.configcenter.facade.vo;

import lombok.Data;

@Data
public class DecisionFactor {

    /**
     * 决策因子键
     */
    private String factorKey;
    /**
     * 决策因子值类型
     */
    private String valueType;
    /**
     * 决策因子取值
     */
    private String optionValues;

}
