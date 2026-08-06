class Solution {
    public int strStr(String haystack, String needle) {
        int j=needle.length();
        int count=-1;
        for(int i=0;i<=haystack.length()-needle.length();i++){
            if(haystack.substring(i,j).equals(needle)){
                count=i;
                break;
            }
            j++;
        }
        return count;
    }
}