package com.xgen.common.config;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;
@Component
@ConfigurationProperties(prefix ="xgen" )    //将配置文件中的值绑定到此类的属性上
public class AppConfig {
    private static String name;
    private static String version;
    private static String author;
    private static Boolean demonstrate;

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

    public void setVersion(String version) {
        AppConfig.version = version;
    }

    public void setAuthor(String author) {
        AppConfig.author = author;
    }

    public static Boolean getDemonstrate() {
        return demonstrate;
    }

    public void setDemonstrate(Boolean demonstrate) {
        AppConfig.demonstrate = demonstrate;
    }

    public static String appInfo(){
        return "application:"+name+"\n"
                +"version:"+version+"\n"
                +"author:"+author+"\n"
                +"演示模式:"+demonstrate;
    }
}
