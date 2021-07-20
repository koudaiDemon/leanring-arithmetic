package org.arithmetic._1838;

import java.util.*;

/**
 * 1838. 最高频元素的频数
 *
 * @author wei.cai@hand-china.com 2021/7/19
 */
public class Solution {

    public static int maxFrequency(int[] nums, int k) {
        Arrays.sort(nums);


        //数学公式
        //fun(l,r+1) - fun(l,r) = (nums[r+1] - nums[r]) * (r - l + 1)
        //fun(0,0) = 0
        //fun(0,r) = sum
        //fun(l+1,r) - fun(l,r) = -(nums[r] - nums[l])

        long total = 0;
        int l = 0;
        int res = 1;
        for (int r = 1; r < nums.length; r++) {
            total = total + (long)((nums[r] - nums[r - 1]) * (r - l));
            while (total > k) {
                total = total - (nums[r] - nums[l]);
                l++;
            }
            res = Math.max(res, r - l + 1);
        }
        return res;
    }

    public static void main(String[] args) {

//        int[] nums = {3, 9, 6};
//        System.out.println(maxFrequency(nums, 3));

        int[] nums = {9930, 9923, 9983, 9997, 9934, 9952, 9945, 9914, 9985, 9982, 9970, 9932, 9985, 9902, 9975, 9990, 9922, 9990, 9994, 9937, 9996, 9964, 9943, 9963, 9911, 9925, 9935, 9945, 9933, 9916, 9930, 9938, 10000, 9916, 9911, 9959, 9957, 9907, 9913, 9916, 9993, 9930, 9975, 9924, 9988, 9923, 9910, 9925, 9977, 9981, 9927, 9930, 9927, 9925, 9923, 9904, 9928, 9928, 9986, 9903, 9985, 9954, 9938, 9911, 9952, 9974, 9926, 9920, 9972, 9983, 9973, 9917, 9995, 9973, 9977, 9947, 9936, 9975, 9954, 9932, 9964, 9972, 9935, 9946, 9966};
        System.out.println(maxFrequency(nums, 3056));


    }

}
