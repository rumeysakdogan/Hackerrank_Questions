package DataStructures.tree;

/*
A binary search tree is a binary tree so it has a left node and right node,
But it's one where, for any given node, all the nodes on its left are smaller than it
and all the nodes on the right are bigger than it.
class Node {
    int data;
    Node left;
    Node right;
}
 */
public class Binary_Search_Tree {

    boolean checkBST(Node root, int min, int max) { /* inclusive ranges */
        if (root == null) {
            return true;
        }
        if (root.data < min || root.data > max) {
            return false;
        }
        return checkBST(root.left, min, root.data - 1) && checkBST(root.right, root.data + 1, max);
    }

    boolean checkBST(Node root) {
        return checkBST(root, Integer.MIN_VALUE ,Integer.MAX_VALUE);
    }

}

