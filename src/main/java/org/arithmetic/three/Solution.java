package org.arithmetic.three;

import lombok.extern.slf4j.Slf4j;

import java.util.HashSet;
import java.util.Set;

/**
 * Description
 *
 * @author wei.cai@hand-china.com 2021/1/18
 */
@Slf4j
public class Solution {

    public int lengthOfLongestSubstring(String s) {
        int len = s.length();

        if (len == 0) {
            return 0;
        }

        final Set<Character> set = new HashSet<>(len);

        int result = 0;
        int count = 0;
        for (int i = 0 ; i < len; i++) {
            if (result >= (len - i + 1)) {
                break;
            }
            for (int j = i ; j < len ; j++) {
                final char c = s.charAt(j);
                if (set.contains(c)) {
                    count = 0;
                    set.clear();
                }
                set.add(c);
                count++;
                result = Math.max(result, count);
            }
            count = 0;
            set.clear();
        }
        return result;
    }


    public static void main(String[] args) {

        String str = "asjrgapa";

        log.info("str count:[{}]", new Solution().lengthOfLongestSubstring(str));

    }

}
