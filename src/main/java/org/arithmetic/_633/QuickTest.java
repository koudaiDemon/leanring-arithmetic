package org.arithmetic._633;


/**
 * 633. 平方数之和
 *
 * @author wei.cai@hand-china.com 2021/4/28
 */
public class QuickTest {

    public static boolean judgeSquareSum(int c) {
        if (c < 0) {
            return false;
        }

        if (c == 0) {
            return true;
        }

        int left = 0;
        int right = (int) Math.sqrt(c);

        //使用双指针进行计算
        while (left <= right) {
            int count = left * left + right * right;

            if (count < c) {
                left++;
            } else if (count > c) {
                right--;
            } else {
                return true;
            }
        }

        return false;
    }

    public static void main(String[] args) {

        System.out.print(judgeSquareSum(8));

    }

}
