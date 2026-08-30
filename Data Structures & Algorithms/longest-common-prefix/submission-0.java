class Solution {
    public String longestCommonPrefix(String[] strs) {
        StringBuilder prefix = new StringBuilder("");
        int count = 0;

        while (count >= 0) {
            char word = count < strs[0].length() ? strs[0].charAt(count) : '-';

            if (word == '-') break;

            for (int i=1; i<strs.length; i++) {
                if (strs[i].length() <= count) {
                    count = -1;
                    break;
                }

                if (count < strs[i].length() && strs[i].charAt(count) != word) {
                    count = -1;
                    break;
                }
            }

            if (count >= 0) {
                prefix.append(word);
                count++;
            } else {
                break;
            }
        }

        return prefix.toString();

    }
}
