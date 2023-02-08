/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ps_sqr_shft;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author LENOVO
 */
public class FindPairSum {

    public static void main(String[] args) {
        int[] arr = {9, 1, 8, 3, 7, 2, 6, 20, -11};

        int sum = 9;

        try {
            findSumPair(arr, sum);
        } catch (Exception ex) {
            ex.printStackTrace();
        }

    }

    static void findSumPair(int[] arr, int sum) throws Exception {
        if (arr == null) {
            throw new Exception("Input array should not be null");
        }

        if (arr.length < 2) {
            throw new Exception("Input should have atleast 2 values");
        }
        Map<Integer, Integer> hm = new HashMap<>();

        for (int i : arr) {
            if (hm.containsKey(i)) {
                hm.put(sum - i, i);
                System.out.println("pairs { " + i + " , " + hm.get(i) + " }");
            } else {
                hm.put(sum - i, i);
            }
        }

    }

}
