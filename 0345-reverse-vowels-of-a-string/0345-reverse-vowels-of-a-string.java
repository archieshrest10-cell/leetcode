class Solution {
    public String reverseVowels(String s) {
        char ch;
        int count = 0;

        for (int i = 0; i < s.length(); i++) {
            ch = s.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' ||
                ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') {
                count++;
            }
        }

        char arr[] = new char[count];
        int a = 0;

        for (int i = 0; i < s.length(); i++) {
            ch = s.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' ||
                ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') {
                arr[a++] = ch;
            }
        }

        int k = arr.length - 1;

        for (int i = 0; i <= k; i++) {
            char ch1 = arr[i];
            arr[i] = arr[k];
            arr[k] = ch1;
            k--;
        }

        char result[] = s.toCharArray();
        int j = 0;

        for (int i = 0; i < result.length; i++) {
            ch = result[i];

            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' ||
                ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') {
                result[i] = arr[j];
                j++;
            }
        }

        return new String(result);
    }
}