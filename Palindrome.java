/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ps_sqr_shft;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author LENOVO
 */
public class Palindrome {

    public static void main(String[] args) {
        String str = "God isabasi doG";
        boolean result = false;
        try {
            result = isPalindromeArraySplit(str);
            
            
            System.out.println("isPalindrome: " + result);
        } catch (Exception ex) {
            ex.printStackTrace();
        }

        
    }

    static boolean isPalindromeArraySplit(String str) throws Exception {
        if (str == null || str.length() < 1) {
            throw new Exception("Check input String");
        }
        for (int i = 0; i < str.length() / 2; i++) {
            if (str.charAt(i) != str.charAt(str.length() - 1 - i)) {
                return false;
            }
        }
        return true;
    }
}
