class Solution {
    // Function to return a list containing the preorder traversal of the tree.
    static ArrayList<Integer> preorder(Node root) {
        // write code here
        ArrayList<Integer> res = new ArrayList<>();
        preorder(root,res);
        return res;
    }
    public static void preorder(Node root , ArrayList<Integer> res){
        if(root == null) return;
        res.add(root.data);
        preorder(root.left,res);
        preorder(root.right,res);
    }
}
