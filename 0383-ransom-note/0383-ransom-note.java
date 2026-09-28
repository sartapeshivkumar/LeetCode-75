class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {

        int[] count = new int[26];

        // Count characters in magazine
        for (char ch : magazine.toCharArray()) {
            count[ch - 'a']++;
        }

        // Use characters for ransomNote
        for (char ch : ransomNote.toCharArray()) {

            count[ch - 'a']--;

            // Not enough characters
            if (count[ch - 'a'] < 0) {
                return false;
            }
        }

        return true;
    }
}