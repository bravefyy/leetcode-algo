/*
* File: sfo_46_translate_numbers_into_strings_s2.java
* Created Time: 2021-12-09
* Author: Krahets (krahets@163.com)
*/

package sfo_46_translate_numbers_into_strings_s2;

import include.*;

// ===== Solution Code =====
class Solution {
    public int translateNum(int num) {
        String s = String.valueOf(num);
        int a = 1, b = 1;
        for (int i = s.length() - 2; i > -1; i--) {
            String tmp = s.substring(i, i + 2);
            int c = tmp.compareTo("10") >= 0 && tmp.compareTo("25") <= 0 ? a + b : a;
            b = a;
            a = c;
        }
        return a;
    }
}

public class sfo_46_translate_numbers_into_strings_s2 {
    public static void main(String[] args) {
        // ======= Test Case =======
        int num = 12258;
        // ====== Driver Code ======
        Solution slt = new Solution();
        int res = slt.translateNum(num);
        System.out.println(res);
    }
}
