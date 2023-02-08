/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ps_sqr_shft;

import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author LENOVO
 */
public class LargestPositiveNegative {

    public static void main(String[] args) {

        int[] arr = {-5, 1, 41, -60, 3, 5, -41, 60};

        int val = 0;
        try {
            val = findLargestPosNegVal(arr);
        } catch (Exception ex) {
            ex.printStackTrace();
        }

        System.out.println(val);

    }

    static int findLargestPosNegVal(int[] arr) throws Exception {
        if (arr == null) {
            throw new Exception("Input array should not be null");
        }

        if (arr.length < 2) {
            throw new Exception("Input should have atleast 2 values");
        }

        Set<Integer> setVal = new HashSet<>();
        int largestVal = Integer.MIN_VALUE;

        for (int i : arr) {
            if (setVal.contains(-1 * i)) {
                if (Math.abs(i) > largestVal) {
                    largestVal = Math.abs(i);
                }
            } else {
                setVal.add(i);
            }
        }
        return largestVal;
    }
}
