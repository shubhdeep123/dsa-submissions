class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        int count = 0;
        for (int num : nums) {
            set.add(num);
        }

        for (int num : nums) {
            if (!set.contains(num-1)) {
                int current = num;
                int seqCount = 0;
                while (set.contains(current)) {
                    current++;
                    seqCount++;
                }
                count = Math.max(count,seqCount);
            }

        }

        return count;
    }

}
