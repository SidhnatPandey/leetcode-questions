class Solution {
    public int myAtoi(String s) {
        if(s == null) return 0;
        s = s.trim();
	  if(s.length() == 0) return 0;
        int negative = 1;
        long ans = 0;
        
        if(s.charAt(0) == '-')  negative = -1;
        
        int MAX = Integer.MAX_VALUE, MIN = Integer.MIN_VALUE;
        
        int i = (s.charAt(0) == '+' || s.charAt(0) == '-') ? 1 : 0;
        
        while(i<s.length()){
            if(s.charAt(i) == ' ' || !Character.isDigit(s.charAt(i))) break;
            ans = ans*10 + s.charAt(i)-'0';
            
            if(negative == -1 && -1*ans<MIN) return MIN;
            if(negative == 1 && ans>MAX) return MAX;
            
            i++;
        }
        return (int) (negative*ans);
    }
}