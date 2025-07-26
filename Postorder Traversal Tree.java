/* A Binary Tree node
class Node {
    int data;
    Node left, right;
   Node(int item)    {
        data = item;
        left = right = null;
    }
} */

class Solution {
    // Function to return a list containing the postorder traversal of the tree.
    ArrayList<Integer> postOrder(Node root) {
        // Your code goes here
        ArrayList<Integer> res = new ArrayList<>();
        postorder(root,res);
        return res;
    }
    public static void postorder(Node root , ArrayList<Integer> res){
        if(root == null) return;
        
        postorder(root.left,res);
        postorder(root.right,res);
        res.add(root.data);
    }
}

