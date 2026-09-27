class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, ArrayList<String>> map = new HashMap<>();

        for (String s : strs) {
            int[] freq = new int[26];
            for (char c : s.toCharArray()) {  
                freq[c-'a']++;
            }

            String key = Arrays.toString(freq);

            if (map.containsKey(key)) {
                map.get(key).add(s);
            } else {
                ArrayList<String> strList = new ArrayList<>();
                strList.add(s);
                map.put(key, strList);
            }
        }

        return new ArrayList<>(map.values());

    }
}
