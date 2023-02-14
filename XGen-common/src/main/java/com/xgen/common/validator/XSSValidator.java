package com.xgen.common.validator;

import com.google.common.base.Strings;
import com.xgen.common.annoation.ForbiddenXSS;
import com.xgen.common.constant.ValidatorConstant;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static com.xgen.common.constant.ValidatorConstant.HTML_SCRIPT_PATTERN;

/**
 * 验证器，验证文本中是否含有脚本
 */
public class XSSValidator implements ConstraintValidator<ForbiddenXSS, String> {
    /**
     * valid input value.
     * @param s
     * @param constraintValidatorContext
     * @return Boolean
     */
    @Override
    public boolean isValid(String s, ConstraintValidatorContext constraintValidatorContext) {
        if(Strings.isNullOrEmpty(s))
            return true;
        return !hasScript(s);
    }

    /**
     * 检测html文本中是否含有script标签
     * @param htmlText
     * @return Boolean
     */
    private static Boolean hasScript(String htmlText){
        Pattern pattern=Pattern.compile(HTML_SCRIPT_PATTERN);
        Matcher matcher=pattern.matcher(htmlText);
        return matcher.matches();
    }
}
