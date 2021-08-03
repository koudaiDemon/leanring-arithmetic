package org.arithmetic._581;


import java.util.Arrays;

/**
 * 581. 最短无序连续子数组
 *
 * @author wei.cai@hand-china.com 2021/8/3
 */
public class Solution {

    public static int findUnsortedSubarray(int[] nums) {
        int[] copy = Arrays.copyOf(nums, nums.length);

        Arrays.sort(nums);

        int start = 0;
        int end = nums.length - 1;
        while ((start < end) && (nums[start] == copy[start] || nums[end] == copy[end])) {
            if (nums[start] == copy[start]) {
                start++;
            }

            if (nums[end] == copy[end]) {
                end--;
            }
        }
        return end == start ? 0 : (end - start) + 1;
    }

    public static void main(String[] args) {

        int[] ints = {1, 3, 2, 7, 7, 7};

        System.out.println(findUnsortedSubarray(ints));

    }

}
