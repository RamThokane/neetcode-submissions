

class Solution {
    public int longestConsecutive(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }

        // Put all elements in a HashSet for O(1) fast lookup
        Set<Integer> numSet = new HashSet<>();
        for (int num : nums) {
            numSet.add(num);
        }

        List<Integer> longestSeq = new ArrayList<>();

        // Iterate through each element in the original array
        for (int num : nums) {
            // Check if 'num' is the start of a sequence (no 'num - 1' exists)
            if (!numSet.contains(num - 1)) {
                List<Integer> currentSeq = new ArrayList<>();
                int currentNum = num;

                // Keep adding elements that have a difference of 1
                while (numSet.contains(currentNum)) {
                    currentSeq.add(currentNum);
                    currentNum += 1;
                }

                // Keep track of the longest sequence found so far
                if (currentSeq.size() > longestSeq.size()) {
                    longestSeq = currentSeq;
                }
            }
        }

        // Sort the stored consecutive elements array/list at the end
        Collections.sort(longestSeq);

        // Print the sorted consecutive elements (Optional)
        System.out.println("Longest consecutive sequence elements (sorted): " + longestSeq);

        // Return the length of the longest consecutive sequence
        return longestSeq.size();
    }
}