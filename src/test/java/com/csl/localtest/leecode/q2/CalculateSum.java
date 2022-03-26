package com.csl.localtest.leecode.q2;

import java.util.ArrayList;

/**
 * @ClassName CalculateSum
 * @Description TODO
 * @Author mrlei
 * @Date 2022/2/9 18:16
 * @Version 1.0
 **/
public class CalculateSum {
    public static void main(String[] args) {
        ListNode l1 = new ListNode(2, new ListNode(4, new ListNode(3)));
        ListNode l2 = new ListNode(5, new ListNode(6, new ListNode(4)));
        Solution solution = new Solution();
        ListNode listNode = solution.addTwoNumbers(l1, l2);
        ArrayList<Integer> integers = new ArrayList<>();
        while (listNode != null) {
            integers.add(listNode.val);
            listNode = listNode.next;
        }
        System.out.println("integers = " + integers);

    }
}
