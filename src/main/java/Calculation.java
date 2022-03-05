/**
 * Project name(项目名称)：Spring_SpEL表达式
 * Package(包名): PACKAGE_NAME
 * Class(类名): Calculation
 * Author(作者）: mao
 * Author QQ：1296193245
 * GitHub：https://github.com/maomao124/
 * Date(创建日期)： 2022/3/5
 * Time(创建时间)： 14:24
 * Version(版本): 1.0
 * Description(描述)： 无
 */

public class Calculation
{
    private int number;

    public int getNumber()
    {
        return number;
    }

    public void setNumber(int number)
    {
        this.number = number;
    }

    public int cube()
    {
        return number * number * number;
    }
}
