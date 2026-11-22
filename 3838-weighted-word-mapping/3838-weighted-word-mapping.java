class Solution {
    public String mapWordWeights(String[] words, int[] weights) {
        StringBuilder sb = new StringBuilder();
        for(int i =0; i<words.length; i++){
            int sum = 0;
            for(int j = 0; j< words[i].length(); j++){
                char c = words[i].charAt(j);
                sum += weights[c-'a'];
            }
            int rem = sum%26;
            char letter = (char)('z'-rem);
            sb.append(letter);

        }
        return sb.toString();
    }
}