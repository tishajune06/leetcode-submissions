class Solution {
    public String decodeMessage(String key, String message) {
        HashMap<Character, Integer> map = new HashMap<>();
        int num = 0;
        for(int i = 0; i< key.length(); i++){
            char c = key.charAt(i);
            if(c!= ' ' && !map.containsKey(c)){
                map.put(c,num);
                num++;
            }
        }
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i< message.length(); i++){
            char c = message.charAt(i);
            if(c == ' '){
                sb.append(' ');
            }else{
            char letter = (char)('a' + map.get(c));
            sb.append(letter);
            }
        }
        return sb.toString();
    }
}