class Solution {
    private static final String[] PHONE_MAP = {
        "", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"
    };

    public List<String> letterCombinations(String digits) {
        List<String> combinations = new ArrayList<>();

        if (digits.isEmpty()) {
            return combinations;
        }

        findCombinations(0, digits, new StringBuilder(), combinations);

        return combinations;
    }

    public void findCombinations(int index, String digits, StringBuilder path, List<String> combinations) {
        if (index == digits.length()) {
            combinations.add(path.toString());

            return;
        }

        String convertedLetter = PHONE_MAP[digits.charAt(index) - '0'];

        for (char letter : convertedLetter.toCharArray()) {
            path.append(letter);

            findCombinations(index+1,digits, path, combinations);

            path.deleteCharAt(path.length() - 1); 
        }
    }

}