package org.arithmetic._0305;

import java.util.*;

/**
 * 面试题 03.05. 栈排序
 *
 * @author wei.cai@hand-china.com 2022/4/22
 */
class SortedStack {

    private final List<Integer> array = new ArrayList<>();

    public SortedStack() {

    }

    public void push(int val) {
        array.add(val);
        array.sort(Comparator.reverseOrder());
    }

    public void pop() {
        if (isEmpty()) {
            return;
        }

        array.remove(array.size() - 1);
    }

    public int peek() {
        if (isEmpty()) {
            return -1;
        } else {
            return array.get(array.size() - 1);
        }
    }

    public boolean isEmpty() {
        return array.isEmpty();
    }

    public static void main(String[] args) {
        SortedStack obj = new SortedStack();
        obj.push(1);
        obj.push(2);
        obj.peek();
        obj.pop();
        obj.peek();
        boolean param_4 = obj.isEmpty();

        System.out.println(param_4);
    }
}
