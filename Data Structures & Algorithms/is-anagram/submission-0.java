class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()) {
            return false;
        }

        HashMap<Character,Integer> map = new HashMap<>();
        char[] sArray = s.toCharArray();
        char[] tArray = t.toCharArray();

        for (char word : sArray) {
            if (map.containsKey(word)) {
                map.put(word,map.get(word)+1);
            } else {
                map.put(word,1);
            }
        }

        for (char word : tArray) {
            if (map.containsKey(word)) {
                map.put(word,map.get(word)-1);
            } else {
                return false;
            }
        }

        for (Map.Entry<Character,Integer> mapElement : map.entrySet()) {
            int value = mapElement.getValue();
            if (value!=0) {
                return false;
            }
        }

        return true;

    }
}
