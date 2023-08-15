package question1;

import java.util.*;

public class PairWithSumFinder {

    public static void main(String[] args) {

        int[] nums = {5, 2, 6, 8, 1,9};
        int target = 10;
        findPairs(nums,target);

    }

    public static void findPairs(int[] nums, int target) {
        Map<Integer, List<Integer>> numIndexMap = new HashMap<>();
        List<String> pairs = new ArrayList<>();

        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (numIndexMap.containsKey(complement)) {
                int finalI = i;
                numIndexMap.get(complement).forEach(index -> pairs.add("(" + nums[finalI] + ", " + nums[index] + ")"));
            }

            numIndexMap.computeIfAbsent(nums[i], k -> new ArrayList<>()).add(i);
        }

        System.out.println(pairs.isEmpty() ? "No pairs found" : "Pairs found: " + pairs);
    }
}



