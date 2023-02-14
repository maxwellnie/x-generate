package com.xgen.system.pojo;

import lombok.Getter;
import lombok.Setter;


/**
 * (ColumnData)实体类
 *
 * @author xg
 * @since 2023-02-14 14:38:07
 */
@Getter
@Setter
public class ColumnData{
    /**
     * 列id
     */
    private Long columnId;
    /**
     * 归属表
     */
    private Long tableId;
    /**
     * 列名
     */
    private String columnName;
    /**
     * 是否是主键
     */
    private Boolean primaryKey;
    /**
     * 类型
     */
    private String columnType;
    /**
     * 列对应的Java类型
     */
    private String columnJavaType;
    /**
     * 表单输入类型（选择框、下拉框.....）
     */
    private String inputType;
    /**
     * 注释
     */
    private String columnComment;
    /**
     * 外键
     */
    private String foreignKey;
    /**
     * 是否必填项目
     */
    private Boolean required;
    /**
     * 操作项（添加修改删除）
     */
    private String dataHandle;
    /**
     * 查询方式
     */
    private String queryType;

}

