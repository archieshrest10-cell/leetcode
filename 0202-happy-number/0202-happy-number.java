class Solution {
     
     
       public static int squared(int n){
        int d;
        int sum=0;
          while(n!=0){
            d=n%10;
            sum+=d*d;
            n/=10;
         }
             n=sum;
             sum=0; 
             return n; 
        }
        
    public boolean isHappy(int n) {
        
        if(n==1){
            return true;
        }
         if (n == 4) {          
            return false;
        }
        else{
            return isHappy(squared(n));
        }
        

    }
}