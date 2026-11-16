class Solution {
    public boolean halvesAreAlike(String s) {
        int n = s.length()/2;
        int count = 0;
        for(int i = 0; i< n; i++){
            char c = s.charAt(i);
            if(isvowel(c)){
                count++;
            }
        }
        int num = 0;
        for(int i = n; i< s.length(); i++){
            char c = s.charAt(i);
            if(isvowel(c)){
                num++;
            }
        }
        if(count != num){
            return false;
        }
        return true;

    }
    public boolean isvowel(char c){
        if( c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' || c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U' ){
            return true;
        }
        return false;
    }
}