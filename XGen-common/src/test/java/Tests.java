import com.xgen.common.validator.XSSValidator;

public class Tests {
    public static void main(String[] args) {
        XSSValidator xssValidator=new XSSValidator();
        System.out.println(xssValidator.isValid(null,null));
    }
}
