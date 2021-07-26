package org.arithmetic._1893;

/**
 * 1893. 检查是否区域内所有整数都被覆盖
 *
 * @author wei.cai@hand-china.com 2021/7/23
 */
public class Solution {

    public static boolean isCovered(int[][] ranges, int left, int right) {
        for (int i = left; i <= right; i++) {
            boolean check = false;
            for (int[] ints : ranges) {
                int start = ints[0];
                int end = ints[1];

                if (i >= start && i <= end) {
                    check = true;
                    break;
                }
            }
            if (!check) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {

        int[][] ranges = {{2, 2}, {3, 3}, {1, 1}};

        System.out.println(isCovered(ranges, 1, 3));


    }

}
