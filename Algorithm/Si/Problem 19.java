/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
 //该题的核心关键是遍历一遍，然后在遍历的时候将左子树和右子树交换位置。遍历的方法有很多，前序遍历，中序遍历，后续遍历，dfs，bfs，前面这些遍历的递归写法，最好先结合实际的算法画图理解，然后背诵并默写..
class Solution {
    public TreeNode mirrorTree(TreeNode root) {
        //前序遍历，然后两个子节点一直不停地交换位置
        if(root == null)
        {
            return null;
        }
        TreeNode node = root;
        Deque<TreeNode> stack = new LinkedList<>();
        while( node != null || !stack.isEmpty())
        {
            if(node != null)
            {
                //交换位置
                invertTreeNode(node);
                //前序遍历
                stack.push(node);
                //这几行代码的逻辑写得真得跟shit一样，写完运行完，我自己都迷惑了
                node=node.left;
            }
            else{
                node=stack.pop();
                node=node.right;
            }
        }
        return root;
    }

    private void invertTreeNode(TreeNode node){
        TreeNode temp= node.left;
        node.left=node.right;
        node.right=temp;
    }

}
