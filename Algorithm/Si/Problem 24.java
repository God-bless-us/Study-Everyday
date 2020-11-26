/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode reverseList(ListNode head) {
        //定义三个指针，一个指针指前面，一个指针指当前，另外一个指针是为了防止断裂所以定义的暂时存储当前值的指针。
        ListNode cur= head, pre=null;
        while(cur != null){
            ListNode tmp= cur.next;//先暂存
            cur.next = pre;
            pre = cur;
            cur = tmp ;
        }

        return pre;//我有点搞不清楚为什么return pre，因为pre暂存了cur吗？pre不是一个指针吗？怎么就返回一个指针的值了呢？

    }
}