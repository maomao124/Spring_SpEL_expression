import org.springframework.expression.Expression;
import org.springframework.expression.ExpressionParser;
import org.springframework.expression.spel.standard.SpelExpressionParser;

/**
 * Project name(项目名称)：Spring_SpEL表达式
 * Package(包名): PACKAGE_NAME
 * Class(类名): test1
 * Author(作者）: mao
 * Author QQ：1296193245
 * GitHub：https://github.com/maomao124/
 * Date(创建日期)： 2022/3/5
 * Time(创建时间)： 14:10
 * Version(版本): 1.0
 * Description(描述)： 无
 */

public class test1
{
    public static void main(String[] args)
    {
        // 构造解析器
        ExpressionParser parser = new SpelExpressionParser();
        // 解析器解析字符串表达式
        Expression exp = parser.parseExpression("'Hello，你好'");
        // 获取表达式的值
        String message = (String) exp.getValue();
        System.out.println(message);
    }
}
