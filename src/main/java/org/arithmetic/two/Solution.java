package org.arithmetic.two;

/**
 * 题目为leetCode{@see https://leetcode-cn.com/problems/add-two-numbers/}
 *
 * @author wei.cai@hand-china.com 2021/1/18
 */
public class Solution {

    public static class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }


    /**
     * 思路
     * 对两个连表进行递归,如果某一个节点的值大于10,则对某一个连表的后一个节点进行+1。
     *
     * @param l1 链表1
     * @param l2 链表2
     * @return 链表
     */
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int val = l1.val + l2.val;
        ListNode node = new ListNode(val % 10);

        if (val >= 10) {
            if (null == l1.next) {
                l1.next = new ListNode(1);
            } else {
                l1.next.val = l1.next.val + 1;
            }
        }

        addTwoNumbers(l1.next, l2.next, node);

        return node;
    }

    public void addTwoNumbers(ListNode l1, ListNode l2, ListNode node) {
        if (null == l1 && null == l2) {
            return;
        }

        int val = 0;
        ListNode nouNullNode = l1;
        if (null != l1 && null != l2) {
            val = l1.val + l2.val;
        } else if (null == l1) {
            nouNullNode = l2;
            val = l2.val;
        } else {
            val = l1.val;
        }

        if (val >= 10) {
            if (null == nouNullNode.next) {
                nouNullNode.next = new ListNode(1);
            } else {
                nouNullNode.next.val = nouNullNode.next.val + 1;
            }
        }
        node.next = new ListNode(val % 10);

        addTwoNumbers((null == l1 || null == l1.next) ? null : l1.next, (null == l2 || null == l2.next) ? null : l2.next, node.next);
    }





    public static void main(String[] args) {

        ListNode l1 = new ListNode(2);
        l1.next = new ListNode(4);
        l1.next.next = new ListNode(3);

        ListNode l2 = new ListNode(5);
        l2.next = new ListNode(6);
        l2.next.next = new ListNode(4);


        final ListNode listNode = new Solution().addTwoNumbers(l1, l2);


        System.out.println("result:" + listNode);

    }


}
