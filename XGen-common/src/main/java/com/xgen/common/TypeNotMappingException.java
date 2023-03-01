package com.xgen.common;

/**
 * 列类型无映射异常
 */
public class TypeNotMappingException extends Exception{
    public TypeNotMappingException() {
    }

    public TypeNotMappingException(String message) {
        super(message);
    }
}
