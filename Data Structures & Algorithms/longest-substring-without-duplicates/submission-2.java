class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashSet<Character> solution = new HashSet<>();
        int a_pointer = 0;
        int b_pointer = 0;
        int max = 0;

        while(b_pointer < s.length()) {
            if(!solution.contains(s.charAt(b_pointer))) {
                solution.add(s.charAt(b_pointer));
                b_pointer++;
                max = Math.max(solution.size(), max);
            }
            else{
                solution.remove(s.charAt(a_pointer));
                a_pointer++;
            }

        }
        return max;
    }
}
