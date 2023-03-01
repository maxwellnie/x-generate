package com.xgen.common.mapping;


import com.xgen.common.TypeNotMappingException;
import com.xgen.common.enums.JavaType;
import com.xgen.common.map.BestMap;

import static com.xgen.common.enums.JavaType.*;

/**
 * 数据库数据类型-java数据类型映射
 */
public class DefaultTypeMapping {
    /**
     * 数据库数据类型&java数据类型映射池
     */
    private static final BestMap<String, JavaType> map= new BestMap<>();
    static {
        map.coiledPut("tinyint",BYTE)
                .coiledPut("smallint",SHORT)
                .batchPut(INT,"mediumint","int","integer")
                .coiledPut("bit",BOOLEAN)
                .coiledPut("bigint",LONG)
                .coiledPut("float",FLOAT)
                .coiledPut("double",DOUBLE)
                .batchPut(STRING,"char", "varchar", "nvarchar","tinytext", "text", "mediumtext", "longtext")
                .coiledPut("decimal",BIG_DECIMAL)
                .batchPut(DATE,"date","datetime","timestamp")
                .coiledPut("time", TIME);
    }
    /**
     * 根据数据库数据类型获取java数据类型
     * @param dbType 数据库数据类型
     * @return java数据类型
     */
    public static JavaType getJavaType(String dbType) throws TypeNotMappingException {
        JavaType javaType=map.get(dbType);
        return requireMappingJavaType(javaType);
    }
    private static JavaType requireMappingJavaType(JavaType javaType) throws TypeNotMappingException {
        if(javaType!=null)
            return javaType;
        else
            throw new TypeNotMappingException();
    }
}
