package com.xgen;

import com.xgen.common.TypeNotMappingException;
import com.xgen.common.config.AppConfig;
import com.xgen.common.mapping.DefaultTypeMapping;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class Test1 {
    @Test
    public void a(){
        try {
            System.out.println(DefaultTypeMapping.getJavaType("longtext").getAddress());
        } catch (TypeNotMappingException e) {
            System.out.println("无相关映射");
        }
        System.out.println(AppConfig.appInfo());
    }
}
