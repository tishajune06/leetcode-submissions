class Solution {
    public long smallestNumber(long num) {
        if(num == 0){
            return 0;
        }
        boolean negative = num < 0;
        String s = Long.toString(Math.abs(num));
        char[] digits = s.toCharArray();
        Arrays.sort(digits);
        if(!negative){
            int i = 0;
            while(digits[i] == '0'){
                i++;
            }
            char temp = digits[0];
            digits[0] = digits[i];
            digits[i] = temp;
        }else{
            reverse(digits);
        }
        return Long.parseLong((negative ? "-":"") + new String(digits));
    }
    private void reverse(char[] arr){
        int i = 0;
        int j = arr.length-1;
        while(i<j){
            char temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
    }
}