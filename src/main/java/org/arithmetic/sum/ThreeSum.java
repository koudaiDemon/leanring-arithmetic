package org.arithmetic.sum;

import java.util.*;

/**
 * 三数之和
 *
 * @author wei.cai@hand-china.com 2020/6/24
 */
public class ThreeSum {

    public static List<List<Integer>> threeSum(int[] nums) {
        final int target = 0;
        int len = nums.length;
        final List<List<Integer>> result = new ArrayList<>();
        for (int i = 0; i < len - 1 - 1; i++) {
            for (int j = i + 1; j < len - 1; j++) {
                for (int k = j + 1; k < len; k++) {
                    if (target == nums[i] + nums[j] + nums[k]) {
                        final List<Integer> list = Arrays.asList(nums[i], nums[j], nums[k]);

                        if (result.stream().noneMatch(e -> {
                            final Set<Integer> eSet = new HashSet<>(e);
                            final Set<Integer> listSet = new HashSet<>(list);
                            return eSet.equals(listSet);
                        })) {
                            result.add(list);
                        }
                    }
                }
            }
        }
        return result;
    }


    public static void main(String[] args) {

//        int[] nums = {-1, 0, 1, 2, -1, -4};

        int[] nums2 = {-4, -2, 1, -5, -4, -4, 4, -2, 0, 4, 0, -2, 3, 1, -5, 0};

        final List<Integer> list = Arrays.asList(1, 2, 3);
        final List<Integer> list1 = Arrays.asList(2, 1, 3);


        final HashSet<Integer> set = new HashSet<>(list);
        final HashSet<Integer> set1 = new HashSet<>(list1);

//        System.out.println(new Integer(1).);

//        System.out.println(threeSum(nums2));

//        System.out.println(set.equals(set1));

    }


}
