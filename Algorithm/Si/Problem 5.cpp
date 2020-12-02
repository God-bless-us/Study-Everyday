// class Solution {
//     public String replaceSpace(String s) {
//         //扫描，遇到空格替换（前提是因为字符串变长了，那么内存也应该相应地边长，增加。
//     //     String s;
//     //     for(i=0;i<s.length;i++)
//     //     {
//     //         if(s[i]=" ")
//     //         s[i]="%20";
//     //     }
//     //     return s;
//     // }
//     //以上的思路是错的，因为，没有考虑到内存的扩展
//     //一个喜欢的评论
//     //return s.replace(" ","%20");
//     //基本思路大家都有，但是这个库函数不一定大家都知道hahha like it


// }

//prefer use C++ though, much more clear
class Solution {
public:
    string replaceSpace(string s) {
        int count = 0; // count the blank
        int sOldSize = s.size();
        for (int i = 0; i < s.size(); i++) {
            if (s[i] == ' ') {
                count++;
            }
        }
        // resize
        s.resize(s.size() + count * 2);
        int sNewSize = s.size();
        // 从后先前遍历将空格替换为"%20"
        for (int i = sNewSize - 1, j = sOldSize - 1; j < i; i--, j--) {
            if (s[j] != ' ') {
                s[i] = s[j];
            } else {
                s[i] = '0';
                s[i - 1] = '2';
                s[i - 2] = '%';
                i -= 2;
            }
        }
        return s;
    }
};
```