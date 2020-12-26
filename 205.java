class Solution {
    public boolean isIsomorphic(String s, String t) {
        if (s.length() != t.length()) return false;
        Map<Character, Character> map = new HashMap<>();
        Set<Character> set = new HashSet<>();
        for (int i = 0; i < s.length(); i++) {
            char c1 = s.charAt(i);
            char c2 = t.charAt(i);
            if (!map.containsKey(c1)) {
                if (set.contains(c2)) return false;
                map.put(c1, c2);
                set.add(c2);
            } else if (map.get(c1) != c2) {
                return false;
            }
        }
        return true;
    }
}