class Solution {
    int diameter=0;
    public int diameterOfBinaryTree(TreeNode root) {
        height(root);
        return diameter;
    }
    private int height(TreeNode node){
        if(node == null){
            return 0;
        }
        int leftheight=height(node.left);
        int rightheight=height(node.right);
        diameter=Math.max(diameter,leftheight+rightheight);
        return 1+Math.max(leftheight,rightheight);
    }
}