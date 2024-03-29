package _力扣;

import java.util.Iterator;

/**
 * @Author:Tod
 * @Description: 给定一个非空数组，返回此数组中第三大的数。如果不存在，则返回数组中最大的数。要求算法时间复杂度必须是O(n)。
 * 示例 1:
 * 输入: [3, 2, 1]
 * 输出: 1
 * 解释: 第三大的数是 1.
 * 示例 2:
 * 输入: [1, 2]
 * 输出: 2
 * 解释: 第三大的数不存在, 所以返回最大的数 2 .
 * 示例 3:
 * 输入: [2, 2, 3, 1]
 * 输出: 1
 * 解释: 注意，要求返回第三大的数，是指第三大且唯一出现的数。
 * 存在两个值为2的数，它们都排第二。
 * @Date: Create in 15:55 2019/10/26
 * @ModifiedBy:
 */
public class _59第三大的数 {
    public static void main(String[] args) {

    }

    public static int thirdMax(int[] nums) {
        long Min = Long.MIN_VALUE;
        long one = nums[0];
        long two = Min;
        long three = Min;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == one || nums[i] == two || nums[i] == three) {
                continue;
            }
            if (nums[i] > one) {
                three = two;
                two = one;
                one = nums[i];
            } else if (nums[i] > two) {
                three = two;
                two = nums[i];
            } else if (nums[i] > three) {
                three = nums[i];
            }
        }
        if (three == Min) {
            return (int) one;
        }
        return (int) three;
    }
}
