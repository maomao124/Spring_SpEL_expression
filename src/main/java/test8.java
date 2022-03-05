import org.springframework.expression.ExpressionParser;
import org.springframework.expression.spel.standard.SpelExpressionParser;
import org.springframework.expression.spel.support.StandardEvaluationContext;

/**
 * Project name(项目名称)：Spring_SpEL表达式
 * Package(包名): PACKAGE_NAME
 * Class(类名): test8
 * Author(作者）: mao
 * Author QQ：1296193245
 * GitHub：https://github.com/maomao124/
 * Date(创建日期)： 2022/3/5
 * Time(创建时间)： 14:24
 * Version(版本): 1.0
 * Description(描述)： 无
 */

public class test8
{
    public static void main(String[] args)
    {
        Calculation calculation = new Calculation();
        StandardEvaluationContext context = new StandardEvaluationContext(calculation);
        ExpressionParser parser = new SpelExpressionParser();
        parser.parseExpression("number").setValue(context, "5");
        System.out.println(calculation.cube());
    }
}
