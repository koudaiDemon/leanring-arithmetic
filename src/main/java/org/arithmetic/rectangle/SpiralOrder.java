package org.arithmetic.rectangle;


import java.util.ArrayList;
import java.util.List;

/**
 * 螺旋矩阵
 *
 * @author wei.cai@hand-china.com 2020/6/22
 */
public class SpiralOrder {

    /**
     * 螺旋矩阵
     * @param matrix 矩阵
     * @return 排序以后的矩阵信息
     */
    public static List<Integer> spiralOrder(int[][] matrix) {
        final List<Integer> list = new ArrayList<>();

        if (null == matrix || 0 == matrix.length || 0 == matrix[0].length) {
            return list;
        }

        final int rowLen = matrix.length;
        final int colLen = matrix[0].length;

        int top = 0;
        int left = 0;
        int bottom = rowLen - 1;
        int right = colLen - 1;

        while (top <= bottom && left <= right) {
            for (int col = left; col <= right ; col++) {
                list.add(matrix[top][col]);
            }
            for (int row = top + 1; row <= bottom ; row++) {
                list.add(matrix[row][right]);
            }
            if (top < bottom && left < right) {
                for (int col = right - 1; col > left ; col--) {
                    list.add(matrix[bottom][col]);
                }
                for (int row = bottom; row > top ; row--) {
                    list.add(matrix[row][left]);
                }
            }
            top++;
            left++;
            bottom--;
            right--;
        }
        return list;
    }

    public static void main(String[] args) {

        final int[][] matrix = {
                {1,2,3,4},
                {5,6,7,8},
                {9,10,11,12},
                {13,14,15,16},
        };

        final int[][] matrix2 = {
                {1,2,3,4},
                {5,6,7,8},
                {9,10,11,12},
        };


        final int[][] matrix3 = {
                {1,2,3},
                {4,5,6}
        };

        final int[][] matrix4 = {
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };

        final int[][] matrix5 = {
                {3},
                {2}
        };

        final List<Integer> list = spiralOrder(matrix);

        System.out.println(list);

    }

}
