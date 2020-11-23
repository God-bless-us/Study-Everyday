/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public int[] reversePrint(ListNode head) {

        Stack<ListNode> stack= new Stack<ListNode>();//创建栈的基本写法
        ListNode temp=head;
        while(temp!=null)//栈的本质是循环，not if its while
        {
            //误区：和head这里没什么关系了，已经把head赋值给temp了
            stack.push(temp);
            //head.next=temp;
            temp=temp.next;
        }
        int size=stack.size();
        int [] print=new int[size];
        for(int i=0;i<size;i++)
        {
            print[i]=stack.pop().val;
        }
        return print;

    }
}
//多训练小细节 比如初始化int 等

