package _力扣;

/**
 * @Author:Tod
 * @Description: 给定一个数组 nums 和一个值 val，
 * 你需要原地移除所有数值等于 val 的元素，返回移除后数组的新长度。
 * 不要使用额外的数组空间，
 * 你必须在原地修改输入数组并在使用 O(1) 额外空间的条件下完成。
 * 元素的顺序可以改变。你不需要考虑数组中超出新长度后面的元素。
 * @Date: Create in 0:11 2019/10/4
 * @ModifiedBy:
 */
public class _04移除元素 {
    public static void main(String[] args) {
        int[] nums = {0,1,2,2,3,2,4,2};
        int val = 2;
        System.out.println(removeElement(nums,val));
    }

    public static int removeElement(int[] nums, int val) {
        int gap = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == val) {
                gap++;
            } else {
                nums[i - gap] = nums[i];
            }
        }
        return nums.length-gap;
    }
}