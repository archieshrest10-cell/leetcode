class Solution {
    public int reverseDegree(String s) {
        int revi=0;
        int idx=0;
        char ch=' ';
        int sum=0;
        for (int i=0;i<s.length();i++){
            ch=s.charAt(i);
            revi='z'-ch+1;
            idx=i+1;
            sum+=(revi*idx);
        }
        return sum;
    }
}