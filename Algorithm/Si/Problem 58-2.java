class Solution {
    public String reverseLeftWords(String s, int n) {
        String res="";
        for(int i=n;i<s.length();i++)
        {
            res += s.charAt(i);
         }
         for(int i=0;i<n;i++)
         {
             res +=s.charAt(i);
         }
         return res;
    }
}
//length就是数数的那个值和内存差1，在这里，就是刚好的长度
//刚开始想的是用双指针，但是结果发现字符串的题不用怎么考虑到指针 内存，有些时候直接跟着想法来就好了。s.length(),charAt();
//思路就是新建一个字符串数组，从后循环，把后面的先装到新的字符串数组里面，再循环前面的，把前面的装进去

