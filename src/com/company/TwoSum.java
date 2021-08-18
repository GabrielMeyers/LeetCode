package com.company;

// https://leetcode.com/problems/two-sum/
class Solution {
    public Solution(){}
    public int[] twoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i +1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target){
                    return new int[]{i ,j};
                }
            }
        }
        return new int[]{-1, -1};
    }
}

class Main {
    public static void main(String[] args) {
        Solution s = new Solution();
        int[] input = {5,3,2,4};
        int[] res = s.twoSum(input, 6);
        for (int index :
                res) {
            System.out.println("index = " + index);
        }
    }
}
