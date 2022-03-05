import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Project name(项目名称)：Spring_SpEL表达式
 * Package(包名): PACKAGE_NAME
 * Class(类名): test6
 * Author(作者）: mao
 * Author QQ：1296193245
 * GitHub：https://github.com/maomao124/
 * Date(创建日期)： 2022/3/5
 * Time(创建时间)： 14:20
 * Version(版本): 1.0
 * Description(描述)： 无
 */

public class test6
{
    public static void main(String[] args)
    {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("beans.xml");
        Number number = (Number) applicationContext.getBean("number");
        System.out.println(number);
    }
}
