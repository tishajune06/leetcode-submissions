class Solution {
    public boolean isPalindrome(int x) {
        int before = x;
        int after = 0;
        if(x < 0){
            return false;
        }else{
            while(x>0){
                int num = x%10;
                after = after*10 + num;
                x = x/10;
            }

        }
        return before == after;
    }
}