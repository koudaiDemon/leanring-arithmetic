package org.arithmetic._1877;

import java.util.Arrays;

/**
 * 1877. 数组中最大数对和的最小值
 *
 * @author wei.cai@hand-china.com 2021/7/20
 */
public class Solution {

    public static int minPairSum(int[] nums) {
        Arrays.sort(nums);

        int res = 0;
        int start = 0;
        int end = nums.length - 1;

        while (start < end) {
            res = Math.max(nums[start] + nums[end], res);
            start++;
            end--;
        }
        return res;
    }

    public static void main(String[] args) {



    }

}
