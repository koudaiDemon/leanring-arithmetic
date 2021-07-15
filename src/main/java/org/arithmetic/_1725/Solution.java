package org.arithmetic._1725;

/**
 * 1725. 可以形成最大正方形的矩形数目
 *
 * @author wei.cai@hand-china.com 2021/7/15
 */
public class Solution {

    public static int countGoodRectangles(int[][] rectangles) {
        int maxLen = 0;
        int max = 0;

        for (int[] array : rectangles) {
            int wide = Math.min(array[0], array[1]);
            if (max < wide) {
                max = wide;
                maxLen = 1;
            } else if (max == wide) {
                maxLen ++;
            }
        }
        return maxLen;
    }

    public static void main(String[] args) {

        int[][] rectangles = {{2,3},{3,7},{4,3},{3,7}};

        System.out.println(countGoodRectangles(rectangles));
    }

}
