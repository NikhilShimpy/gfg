/*
class Node {
    int data;
    Node left, right;

    Node(int item) {
        data = item;
        left = right = null;
    }
}
*/
class Solution {
    public ArrayList<ArrayList<Integer>> levelOrder(Node root) {
        // Your code here
        ArrayList<ArrayList<Integer>> res = new ArrayList<>();
        if (root == null) return res;

        Queue<Node> que = new LinkedList<>();
        que.offer(root);

        while (!que.isEmpty()) {
            int size = que.size();
            ArrayList<Integer> level = new ArrayList<>();

            for (int i = 0; i < size; i++) {
                Node node = que.poll();
                level.add(node.data);

                if (node.left != null) que.offer(node.left);
                if (node.right != null) que.offer(node.right);
            }

            res.add(level);
        }
        return res;
    }
}
