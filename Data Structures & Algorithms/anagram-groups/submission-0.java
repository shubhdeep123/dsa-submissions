class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String,List<String>> map = new HashMap<>();
        List<List<String>> ansList = new ArrayList<>();
        for (String word : strs) {
            String key = createKey(word);
            map.computeIfAbsent(key, k -> new ArrayList<>()).add(word);
        }

        for (List<String> list : map.values()) {
            ansList.add(list);
        }

        return ansList;

    }

    public String createKey(String inputKey) {
        char[] charArray = inputKey.toCharArray();
        Arrays.sort(charArray);
        return new String(charArray);
    }
}
