import org.springframework.expression.ExpressionParser;
import org.springframework.expression.spel.standard.SpelExpressionParser;

/**
 * Project name(项目名称)：Spring_SpEL表达式
 * Package(包名): PACKAGE_NAME
 * Class(类名): test7
 * Author(作者）: mao
 * Author QQ：1296193245
 * GitHub：https://github.com/maomao124/
 * Date(创建日期)： 2022/3/5
 * Time(创建时间)： 14:22
 * Version(版本): 1.0
 * Description(描述)： 无
 */

public class test7
{
    public static void main(String[] args)
    {
        ExpressionParser parser = new SpelExpressionParser();
        // 算术运算符
        System.out.println(parser.parseExpression("'Hello SPEL'+'!'").getValue());
        System.out.println(parser.parseExpression("10 * 10/2").getValue());
        System.out.println(parser.parseExpression("'今天是：'+ new java.util.Date()").getValue());
        // 逻辑运算符
        System.out.println(parser.parseExpression("true and true").getValue());
        // 关系运算符
        System.out.println(parser.parseExpression("'sonoo'.length()==5").getValue());
    }
}
