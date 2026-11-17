class Solution {
    public int lengthOfLongestSubstring(String s) {
        int l = 0;
        int r = 0;
        int max = 0;
        int[] map = new int[300];

        Arrays.fill(map, -1);

        while (r < s.length()){
            if (map[s.charAt(r)] != -1)
                l = Math.max(l, map[s.charAt(r)] + 1);
            map[s.charAt(r)] = r;
            max = Math.max(r - l + 1, max);
            r++;
        }

        return max;
    }
}
