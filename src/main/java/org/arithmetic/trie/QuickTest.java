package org.arithmetic.trie;

import lombok.extern.slf4j.Slf4j;

import java.util.HashSet;
import java.util.Set;

/**
 * Description
 *
 * @author wei.cai@hand-china.com 2021/4/14
 */
@Slf4j
public class QuickTest {

    public static class Trie {

        private final Set<String> words;


        /**
         * Initialize your data structure here.
         */
        public Trie() {
            words = new HashSet<>();
        }

        /**
         * Inserts a word into the trie.
         */
        public void insert(String word) {
            words.add(word);
        }

        /**
         * Returns if the word is in the trie.
         */
        public boolean search(String word) {
            return words.contains(word);
        }

        /**
         * Returns if there is any word in the trie that starts with the given prefix.
         */
        public boolean startsWith(String prefix) {
            for (String str : words) {
                if (str.startsWith(prefix)) {
                    return true;
                }
            }

            return false;
        }

    }


    public static void main(String[] args) {

        Trie obj = new Trie();
        obj.insert("word");
        boolean param2 = obj.search("word");
        boolean param3 = obj.startsWith("prefix");


        log.info("param2:[{}]", param2);
        log.info("param3:[{}]", param3);

    }

}
