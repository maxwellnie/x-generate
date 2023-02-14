package com.xgen.common.config;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;
@Component
@ConfigurationProperties(prefix ="xgen" )    //将配置文件中的值绑定到此类的属性上
public class AppConfig {
    private static String name;
    private static String version;
    private static String author;

    public static String getName() {
        return name;
    }

    public static String getVersion() {
        return version;
    }

    public static String getAuthor() {
        return author;
    }

    public void setName(String name){
        AppConfig.name=name;
    }

    public static void setVersion(String version) {
        AppConfig.version = version;
    }

    public static void setAuthor(String author) {
        AppConfig.author = author;
    }
}
