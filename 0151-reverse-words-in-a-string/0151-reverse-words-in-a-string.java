
class Solution {
    public String reverseWords(String s) {

        // Remove starting and ending spaces
        s = s.trim();

        // Split the string using one or more spaces
        String[] words = s.split("\\s+");

        // Store words in reverse order
        StringBuilder result = new StringBuilder();

        for (int i = words.length - 1; i >= 0; i--) {

            result.append(words[i]);

            if (i > 0) {
                result.append(" ");
            }
        }

        return result.toString();
    }
}
