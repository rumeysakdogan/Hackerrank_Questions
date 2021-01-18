package DataStructures.tree;/*
A tree can be taught in this sort of picture.
You have a root node(only one root) at the very top and it has child nodes and each of those child nodes, they have child nodes
themselves, and so on and so on. Root -->> Child -->> Leaf (no children)
A binary tree  means that each node has no more than two child nodes.(0-2 child nodes, left and right)
That is that each node has a left node and a right node. Of course one or both of those could also be null.

A binary search tree is a binary tree which fulfills a specific ordering property. So any subtree the left nodes
are less than the root node which is less than all of the right nodes. This ordering property makes finding a node very very
fast because we have a pretty good idea of where it would be.

                                                Traversing
     InOrderTraversal     **           PreOrderTraversal                     PostOrderTraversal
left ->> root ->> right             root ->> left --> right              left ->> right ->> root
 */


class Node {

    Node left, right;
    int data;

    public Node(int data) {
        this.data = data;
    }

    public void insert(int value) {
        if (value <= data) {
            if ( left == null) {
                left = new Node(value);
            }else {
                left.insert(value);
            }
        }else{
            if (right == null) {
                right = new Node(value);
            }else{
                right.insert(value);
            }
        }
    }

    public boolean contains(int value) {
        if (value == data) {
            return true;
        } else if (value < data) {
            if (left == null) {
                return false;
            } else {
                return left.contains(value);
            }
        }else {
            if (right == null) {
                return false;
            } else {
                return right.contains(value);
            }
        }
    }

    public void printInOrder() {
        if (left != null) {
            left.printInOrder();
        }
        System.out.println(data);
        if (right != null) {
            right.printInOrder();
        }
    }
}

public class Tree {

}
