package javaapp1;

import java.util.List;

public class ThreeSum {
    public static void main(String[] args) {
        
        int nums[] = {-1, 0, 1, 2, -1, -4};
        Solution s = new Solution();
        List<List<Integer>> result = s.threesum(nums);
        System.out.println(result);
    }
}

