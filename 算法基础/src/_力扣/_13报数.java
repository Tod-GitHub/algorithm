package _力扣;

/**
 * @Author:Tod
 * @Description: 报数序列是一个整数序列，按照其中的整数的顺序进行报数，得到下一个数。其前五项如下：
 * 1.     1
 * 2.     11
 * 3.     21
 * 4.     1211
 * 5.     111221
 * 1 被读作  "one 1"  ("一个一") , 即 11。
 * 11 被读作 "two 1s" ("两个一"）, 即 21。
 * 21 被读作 "one 2",  "one 1" （"一个二" ,  "一个一") , 即 1211。
 * 给定一个正整数 n（1 ≤ n ≤ 30），输出报数序列的第 n 项。
 * 注意：整数顺序将表示为一个字符串。
 * @Date: Create in 15:14 2019/10/8
 * @ModifiedBy:
 */
public class _13报数 {
    public static void main(String[] args) {
        System.out.println(countAndSay(30));
    }

    public static String countAndSay(int n) {
        StringBuilder str = new StringBuilder("1");
        int i = 1, count, j, now;
        while (i < n) {
            StringBuilder temp = new StringBuilder(str);
            str.delete(0, str.length());
            j = 0;
            while (j < temp.length()) {
                count = 1;
                while (j + 1 < temp.length() && temp.charAt(j) == temp.charAt(j + 1)) {
                    count++;
                    j++;
                }
                str.append((char) (count + '0'));
                str.append(temp.charAt(j));
                j++;
            }
            i++;
        }
        return str.toString();
    }
}
