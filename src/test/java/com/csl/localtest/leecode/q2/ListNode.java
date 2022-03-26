package com.csl.localtest.leecode.q2;

/**
 * @ClassName ListNode
 * @Description TODO
 * @Author mrlei
 * @Date 2022/2/10 22:23
 * @Version 1.0
 **/
public class ListNode {
    int val;
    ListNode next;
    ListNode(){}

    ListNode(int x) {
        val = x;
    }

    ListNode(int x, ListNode next) {
        this.val = x;
        this.next = next;
    }
}
