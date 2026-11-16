class Solution {
    public boolean isHappy(int n) {
        if(n<0){
            return false;
        }
    
        HashSet<Integer> set = new HashSet<>();
        while(n != 1 && !set.contains(n)){
            set.add(n);
            n= check(n);
        }
        return n == 1;
    }
    public int check(int n){
        int sum = 0;
            while(n>0){
                int digit = n%10;
                sum = digit*digit + sum;
                n = n/10;
            }
        return sum;
    }

}