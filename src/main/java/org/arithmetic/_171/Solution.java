package org.arithmetic._171;

/**
 * 171. Excel表列序号
 *
 * @author wei.cai@hand-china.com 2021/7/30
 */
public class Solution {

    public int titleToNumber(String columnTitle) {
        int result = 0;

        for (int i = 0; i < columnTitle.length(); i++) {
            result = result + (columnTitle.charAt(i) - 64) * (int)Math.pow(26, (columnTitle.length() - 1 - i));
        }
        return result;
    }

    public static void main(String[] args) {

        System.out.println(new Solution().titleToNumber("ZY"));

    }

}
