package com.lin.isettlement.calcengine.model;

import lombok.Data;

import java.math.BigDecimal;
import java.util.Date;
import java.util.Map;

/**
 * 费用计算事件，其中包含
 */
@Data
public class FeeCalcEvent {

    /**
     * 业务编码
     */
    private String bizId;
    /**
     * 关联的业务编码，如果是逆向的单据则会有逆向的业务编码
     */
    private String relBizId;
    /**
     * 指定契约编码，如果业务知道确定的契约编码则可以直接计算
     */
    private String specifyContractId;
    /**
     * 业务发生时间
     */
    private Date bizDate;
    /**
     * 业务类型
     */
    private String bizType;
    /**
     * 业务发生对象信息
     */
    private String bizObject;
    /**
     * 业务发生机构信息
     */
    private String bizOrganization;
    /**
     * 业务发生的用户编码
     */
    private String userId;
    /**
     * 业务发生场景
     */
    private String bizScene;
    /**
     * 业务发生金额
     */
    private BigDecimal svcAmount;
    /**
     * 业务发生笔数，如果业务不需要累量，而是通过上游传递则使用当前字段作为按笔数计费依据值
     */
    private Integer svcCount;
    /**
     * 指定的计费金额，由上游计算完成得到的金额，不需要系统再次计算。很多系统交互中，某个费用会有这种场景
     */
    private BigDecimal specifyAmount;
    /**
     * 其他类型的依据类型
     */
    private String basicType;
    /**
     * 其他类型的依据数值，比如按照距离计算、按照重量体积计算等。目前暂定只需要使用一个值作为度量
     */
    private BigDecimal basicValue;
    /**
     * 逆向的业务发生金额，假如业务撤销时会发生当前逻辑。
     */
    private BigDecimal reverseSvcAmount;
    /**
     * 指定的逆向计算费用金额
     */
    private BigDecimal specifyReverseAmount;
    /**
     * 来源系统
     */
    private String sourceSystem;
    /**
     * 计算因子, 用于决策配置和费率需要使用因子和取值。
     */
    private Map<String, Object> factorProperty;
    /**
     * 扩展信息，用于传递一些特殊的业务字段，或者是特殊的计算类型字段。
     */
    private Map<String, Object> extInfo;

}
