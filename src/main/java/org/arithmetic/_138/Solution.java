package org.arithmetic._138;

import java.util.HashMap;
import java.util.Map;

/**
 * 138. 复制带随机指针的链表
 *
 * @author wei.cai@hand-china.com 2021/7/22
 */
public class Solution {

    static class Node {
        int val;
        Node next;
        Node random;

        public Node(int val) {
            this.val = val;
            this.next = null;
            this.random = null;
        }
    }


    public static Node copyRandomList(Node head) {
        Node node = head;
        if (null == node) {
            return null;
        }

        //第一次循环,用于循环复制连表
        final Map<Node, Node> oldAndNew = new HashMap<>();
        while (node != null) {
            oldAndNew.put(node, new Node(node.val));
            node = node.next;
        }

        //第二次循环,用于循环random
        node = head;
        while (node != null) {
            oldAndNew.get(node).next = oldAndNew.get(node.next);
            oldAndNew.get(node).random = oldAndNew.get(node.random);
            node = node.next;
        }

        return oldAndNew.get(head);
    }

    public static void main(String[] args) {

        final Node one = new Node(1);
        final Node two = new Node(5);

        one.next = two;
        one.random = two;
        two.random = two;

        final Node node = copyRandomList(one);

        System.out.println(node);


    }
}
