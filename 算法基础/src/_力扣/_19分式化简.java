package _力扣;

import util.Util;

/**
 * @Author:Tod
 * @Description:
 * 有一个同学在学习分式。他需要将一个连分数化成最简分数，你能帮助他吗？
 * 连分数是形如上图的分式。在本题中，所有系数都是大于等于0的整数。
 * 输入的cont代表连分数的系数（cont[0]代表上图的a0，以此类推）。返回一个长度为2的数组[n, m]，使得连分数的值等于n / m，且n, m最大公约数为1。
 * 输入：cont = [3, 2, 0, 2]
 * 输出：[13, 4]
 * 解释：原连分数等价于3 + (1 / (2 + (1 / (0 + 1 / 2))))。
 * 注意[26, 8], [-13, -4]都不是正确答案。
 *
 * 输入：cont = [0, 0, 3]
 * 输出：[3, 1]
 * 解释：如果答案是整数，令分母为1即可。
 * @ModifiedBy:
 */
public class _19分式化简 {
    public static void main(String[] args) {
//        int[] cont = new int[]{3,2,0,2};
        int[] cont = new int[]{0,0,3};
        Util.print(fraction(cont));
    }
    public static int[] fraction(int[] cont) {
        int[] res = new int[]{cont[cont.length-1],1};
        int temp;
        for (int i = cont.length-2; i >= 0; i--) {
            temp = res[0];
            res[0]=res[1];
            res[1]=temp;
            res[0] = cont[i]*res[1]+res[0];
        }
        return res;
    }
}

