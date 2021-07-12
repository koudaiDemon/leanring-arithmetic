package org.arithmetic._575;

import java.util.HashSet;
import java.util.Set;

/**
 * 575. 分糖果
 *
 * @author wei.cai@hand-china.com 2021/7/12
 */
public class Solution {

    public static int distributeCandies(int[] candyType) {
        final Set<Integer> set = new HashSet<>();
        for (int candy : candyType) {
            set.add(candy);
        }
        return Math.min(set.size(), candyType.length / 2);
    }

    public static void main(String[] args) {
//        int[] candies = {1,1,2,2,3,3};

        int[] candies = {100000, 0, 100000, 0, 100000, 0, 100000, 0, 100000, 0, 100000, 0};
        final int i = distributeCandies(candies);
        System.out.println(i);
    }

}
