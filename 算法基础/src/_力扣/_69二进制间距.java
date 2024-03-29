package _力扣;

/**
 * @Author:Tod
 * @Description: 给定一个正整数 N，找到并返回 N 的二进制表示中两个连续的 1 之间的最长距离。
 * 如果没有两个连续的 1，返回 0 。
 * 示例 1：
 * 输入：22
 * 输出：2
 * 解释：
 * 22 的二进制是 0b10110 。
 * 在 22 的二进制表示中，有三个 1，组成两对连续的 1 。
 * 第一对连续的 1 中，两个 1 之间的距离为 2 。
 * 第二对连续的 1 中，两个 1 之间的距离为 1 。
 * 答案取两个距离之中最大的，也就是 2 。
 * 示例 2：
 * 输入：5
 * 输出：2
 * 解释：
 * 5 的二进制是 0b101 。
 * 示例 3：
 * 输入：6
 * 输出：1
 * 解释：
 * 6 的二进制是 0b110 。
 * 示例 4：
 * 输入：8
 * 输出：0
 * 解释：
 * 8 的二进制是 0b1000 。
 * 在 8 的二进制表示中没有连续的 1，所以返回 0 。
 * 提示：
 * 1 <= N <= 10^9
 * @Date: Create in 0:40 2019/10/30
 * @ModifiedBy:
 */
public class _69二进制间距 {
    public static void main(String[] args) {
        System.out.println(binaryGap(5));
        System.out.println(binaryGap(8));
        System.out.println(binaryGap(6));
        System.out.println(binaryGap(22));
    }

    public static int binaryGap(int N) {
        int countOf1 = 0;
        int count = 0;
        int max = 0;
        boolean flag = false;
        while (N != 0) {
            if (flag) {
                count++;
            }
            if ((N & 1) == 1) {
                flag = true;
                countOf1++;
                if (count > max) {
                    max = count;
                }
                count = 0;
            }
            N >>= 1;
        }
        if (countOf1 < 2) {
            return 0;
        }
        return max;
    }

    public int binaryGap2(int N) {
        int[] A = new int[32];
        int t = 0;
        for (int i = 0; i < 32; ++i)
            if (((N >> i) & 1) != 0)
                A[t++] = i;

        int ans = 0;
        for (int i = 0; i < t - 1; ++i)
            ans = Math.max(ans, A[i+1] - A[i]);
        return ans;


    }
}
