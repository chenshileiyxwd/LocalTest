package com.csl.localtest.leecode.q3;

import org.junit.Test;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

/**
 * @ClassName CalculateNoRepeatSubString
 * @Description TODO
 * @Author mrlei
 * @Date 2022/2/10 23:20
 * @Version 1.0
 **/
public class CalculateNoRepeatSubString {
    @Test
    public void test() {
        int abcabcdefg = lengthOfLongestSubstring("abcabcdefg");
        System.out.println("abcabcdefg = " + abcabcdefg);

    }
    public int lengthOfLongestSubstring(String s) {
        // 记录字符上一次出现的位置
        int[] last = new int[128];
        for (int i = 0; i < 128; i++) {
            last[i] = -1;
        }
        int n = s.length();

        int res = 0;
        int start = 0; // 窗口开始位置
        for (int i = 0; i < n; i++) {
            int index = s.charAt(i);
            start = Math.max(start, last[index] + 1);
            res = Math.max(res, i - start + 1);
            last[index] = i;
        }

        return res;
    }

}
