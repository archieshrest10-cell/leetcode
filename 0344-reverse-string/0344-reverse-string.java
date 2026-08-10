class Solution {
    public void reverseString(char[] s) {
        int k=s.length-1;
        char ch;
        for(int i=0;i<=k;i++){
            ch=s[i];
            s[i]=s[k];
            s[k]=ch;
            k--;
            
        }
    }
}