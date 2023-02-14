package com.xgen.common.enums;

import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.Date;

/**
 * java基本数据类型的枚举类
 */
public enum JavaType {
    INT_("int"),
    FLOAT_("float"),
    DOUBLE_("double"),
    BYTE_("byte"),
    SHORT_("short"),
    LONG_("long"),
    BOOLEAN_("boolean"),
    CHAR_("char"),
    BOOLEAN(Boolean.class),
    CHAR(Character.class),
    BYTE(Byte.class),
    SHORT(Short.class),
    INT(Integer.class),
    LONG(Long.class),
    FLOAT(Float.class),
    DOUBLE(Double.class),
    STRING(String.class),
    BIG_DECIMAL(BigDecimal.class),
    TIME_STAMP(Timestamp.class),
    DATE(Date.class),
    TIME(java.sql.Time.class),
    NO_MAPPING("no mapping");
    String typeName;
    String address;
    Boolean notBasic=false;
    private JavaType(String typeName){
        this.typeName=typeName;
    }
    private JavaType(Class clazz){
        this.typeName=clazz.getSimpleName();
        this.address =clazz.getName();
        this.notBasic=true;
    }
    public String getName(){
        return this.typeName;
    }
    public String getAddress(){
        return address;
    }
}
