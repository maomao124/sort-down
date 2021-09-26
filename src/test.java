import java.util.Arrays;
import java.util.Collections;

/**
 * Project name(项目名称)：sort()数组排序 降序
 * Package(包名): PACKAGE_NAME
 * Author(作者）: mao
 * Author QQ：1296193245
 * Date(创建日期)： 2021/9/26
 * Time(创建时间)： 19:52
 * Version(版本): 1.0
 * Description(描述)： 1）利用 Collections.reverseOrder() 方法
 */

public class test
{
    public static void main(String[] args)
    {
        Integer[] scores = {1, 8, 6, 5, 7, 3, 6};
        System.out.println("排序前：");
        for (int i : scores)
        {
            System.out.print(i + "\t");
        }
        System.out.println();
        System.out.println("排序后：");
        Arrays.sort(scores, Collections.reverseOrder());
        for (int i : scores)
        {
            System.out.print(i + "\t");
        }
        System.out.println();
    }
}
