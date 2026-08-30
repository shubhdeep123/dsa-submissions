class Solution {
    public int lengthOfLongestSubstring(String s) {
        int[] lastSeen = new int[128];
        int left = 0;
        int maxLength = 0;

        for (int i = 0; i < s.length(); i++) {
            char currentChar = s.charAt(i);

            // lastSeen stores index + 1
            if (lastSeen[currentChar] > left) {
                left = lastSeen[currentChar];
            }

            maxLength = Math.max(maxLength, i - left + 1);
            lastSeen[currentChar] = i + 1;
        }

        return maxLength;
    }
}