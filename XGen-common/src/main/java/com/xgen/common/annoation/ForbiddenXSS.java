package com.xgen.common.annoation;

import com.xgen.common.validator.XSSValidator;

import javax.validation.Constraint;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * 打上注解的数据库映射类的Setter或者字段、参数等将免受XSS注入，注解形式校验，侵入性低
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(value = { ElementType.METHOD, ElementType.FIELD, ElementType.CONSTRUCTOR, ElementType.PARAMETER })
@Constraint(validatedBy = { XSSValidator.class })
public @interface ForbiddenXSS {
    String message() default "您输入的数据可能含有脚本，为了避免造成危险，服务器禁止此类数据进入！";
}
