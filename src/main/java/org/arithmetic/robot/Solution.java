package org.arithmetic.robot;

/**
 * Description
 *
 * @author cWww 2020/8/28
 */
public class Solution {

    public boolean judgeCircle(String moves) {
        if (null == moves || 0 == moves.length()) {
            return true;
        }

        final int length = moves.length();

        if (0 != length % 2) {
            return false;
        }
        final char[] chars = moves.toCharArray();

        final char r = 'R';
        final char l = 'L';
        final char u = 'U';
        final char d = 'D';

        int x = 0;
        int y = 0;
        for (int i = 0 ; i < length ; i++) {
            switch (chars[i]) {
                case r:
                    x++;
                    break;
                case l:
                    x--;
                    break;
                case u:
                    y++;
                    break;
                case d:
                    y--;
                    break;
                default:
                    break;
            }
        }
        return x == 0 && y == 0;
    }

    public static void main(String[] args) {

        final boolean ud = new Solution().judgeCircle("UD");

        System.out.println(ud);


    }

}
