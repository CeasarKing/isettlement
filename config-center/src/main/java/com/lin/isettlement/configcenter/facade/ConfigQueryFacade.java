package com.lin.isettlement.configcenter.facade;

import com.lin.isettlement.configcenter.facade.vo.FeeContractRule;
import com.lin.isettlement.configcenter.facade.vo.calc.FeeCalcRule;
import com.lin.isettlement.configcenter.facade.vo.tax.TaxCalcRule;

import java.util.List;

/**
 * 规则配置查询接口，配置中心对外提供统一规则模型
 */
public interface ConfigQueryFacade {

    /**
     * 根据业务对象、业务场景来查找，满足条件查找计算规则。需要业务自定义配置与业务关联关系
     *
     * @param bizObject 业务对象
     * @param bizScene  业务场景
     * @return
     */
    List<FeeContractRule> queryConfigRule(String bizObject, String bizScene);

    /**
     * 通过业务规则的编码和版本查找费用计算规则
     *
     * @param ruleCode
     * @param version
     * @return
     */
    FeeCalcRule queryFeeCalRule(String ruleCode, Integer version);

    /**
     * 通过业务规则的编码和版本查找税费计算规则
     *
     * @param ruleCode
     * @param version
     * @return
     */
    TaxCalcRule queryTaxCalRule(String ruleCode, Integer version);

}
