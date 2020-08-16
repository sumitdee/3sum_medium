package javaapp1;


import java.util.*;

import java.util.List;

public class Solution {
    public List<List<Integer>> threesum(int num[]) {

        List<List<Integer>> pair = new ArrayList<>();
        
        TreeSet<String> set = new TreeSet<String>();

        Arrays.sort(num);

        for (int i = 0; i < (num.length) - 2; i++) {

            int j = i + 1;
            int k = num.length - 1;

            while (j < k) {
                List<Integer> list = new ArrayList<>();
                if (num[i] + num[j] + num[k] == 0) {

                    String str = num[i] + ":" + num[j] + ":" + num[k];

                    if (!set.contains(str)) {
                        list.add(num[i]);
                        list.add(num[j]);
                        list.add(num[k]);
                        System.out.println(list);
                        pair.add(list);
                        set.add(str);
                        System.out.println(num[i] + ":" + num[j] + ":" + num[k]);
                    }
                    j++;
                    k--;
                } else if (num[i] + num[j] + num[k] < 0) {
                    j++;
                } else {
                    k--;
                }
            }

        }


        return pair;
    }
}
