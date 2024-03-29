package _力扣;

/**
 * @Author:Tod
 * @Description: 泰波那契序列 Tn 定义如下：
 * T0 = 0, T1 = 1, T2 = 1, 且在 n >= 0 的条件下 Tn+3 = Tn + Tn+1 + Tn+2
 * 给你整数 n，请返回第 n 个泰波那契数 Tn 的值。
 * <p>
 * 示例 1：
 * 输入：n = 4
 * 输出：4
 * 解释：
 * T_3 = 0 + 1 + 1 = 2
 * T_4 = 1 + 1 + 2 = 4
 * <p>
 * 示例 2：
 * 输入：n = 25
 * 输出：1389537
 * <p>
 * 提示：
 * 0 <= n <= 37
 * 答案保证是一个 32 位整数，即 answer <= 2^31 - 1。
 * @Date: Create in 0:40 2019/10/20
 * @ModifiedBy:
 */
public class _39第N个泰波那契数 {
    public static void main(String[] args) {
        System.out.println(tribonacci(25));
    }

    public static int tribonacci(int n) {
        if (n == 0) {
            return 0;
        }
        if (n == 1) {
            return 1;
        }
        int[] table = new int[n + 1];
        table[0] = 0;
        table[1] = 1;
        table[2] = 1;
        for (int i = 3; i < table.length; i++) {
            table[i] = table[i - 1] + table[i - 2] + table[i - 3];
        }
        return table[n];
    }

    public static int fibonacci(int n) {
        double rootFive = Math.sqrt(5.0);
        double factor1 = Math.pow((1.0 + rootFive) / 2.0, n);
        double factor2 = Math.pow((1.0 - rootFive) / 2.0, n);
        return (int) ((1.0 / rootFive) * (factor1 - factor2));
    }

}
