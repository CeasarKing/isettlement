package com.lin.isettlement.configcenter.facade.vo;

import com.lin.isettlement.configcenter.facade.vo.accumulate.AccumulateRule;
import com.lin.isettlement.configcenter.facade.vo.calc.FeeCalcRule;
import com.lin.isettlement.configcenter.facade.vo.chargeout.ChargeOutRule;
import com.lin.isettlement.configcenter.facade.vo.tax.TaxCalcRule;
import lombok.Data;

import java.util.List;

/**
 * 费用计算契约规则，用于定义系统与用户确定的计算逻辑。契约在确定之后应该被长期履行配置
 */
@Data
public class FeeContractRule {

    /**
     * 规则编码
     */
    private String ruleCode;
    /**
     * 规则版本
     */
    private Integer version;

    /**
     * 业务场景
     */
    private String bizScene;

    // ===== 用于决策是否使用当前规则 =====
    /**
     * 决策模式
     */
    private String decisionMode;
    /**
     * 决策因子
     */
    private List<DecisionFactor> decisionFactors;


    // ===== 业务规则 =====
    /**
     * 计费规则
     */
    private FeeCalcRule feeCalcRule;
    /**
     * 计税规则
     */
    private TaxCalcRule taxCalcRule;
    /**
     * 累量规则
     */
    private AccumulateRule accumulateRule;
    /**
     * 出账规则
     */
    private ChargeOutRule chargeOutRule;

}
