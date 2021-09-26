import java.util.Arrays;
import java.util.Comparator;

/**
 * Project name(项目名称)：sort()数组排序 降序
 * Package(包名): PACKAGE_NAME
 * Author(作者）: mao
 * Author QQ：1296193245
 * Date(创建日期)： 2021/9/26
 * Time(创建时间)： 19:58
 * Version(版本): 1.0
 * Description(描述)： 实现 Comparator 接口的复写 compare() 方法
 */

public class test2
{
    public static void main(String[] args)
    {
        /*
         * 注意，要想改变默认的排列顺序，不能使用基本类型（int,double,char）而要使用它们对应的类
         */
        Integer[] a = {9, 8, 7, 2, 3, 4, 1, 0, 6, 5};
        // 定义一个自定义类MyComparator的对象
        Comparator cmp = new MyComparator();
        Arrays.sort(a, cmp);
        for (int arr : a)
        {
            System.out.print(arr + " ");
        }
    }
}

// 实现Comparator接口
class MyComparator implements Comparator<Integer>
{
    @Override
    public int compare(Integer o1, Integer o2)
    {
        /*
         * 如果o1小于o2，我们就返回正值，如果o1大于o2我们就返回负值， 这样颠倒一下，就可以实现降序排序了,反之即可自定义升序排序了
         */
        return o2 - o1;
    }
}
