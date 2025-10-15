//package com.example.trees; ?
class Node{
    int data;
    Node leftChild;
    Node rightChild;
    public Node(int key){
        data = key;
        leftChild = rightChild = null;
    }
}

public class BinaryTree{
    Node root = null;
    void inorder_traversal(Node node){
        if(node!=null){
            inorder_traversal(node.leftChild);
            System.out.println(node.data + " ");
            inorder_traversal(node.rightChild);
        }
    }

    void preorder_traversal(Node node){
        if(node!=null){
            System.out.println(node.data + " ");
            preorder_traversal(node.leftChild);
            preorder_traversal(node.rightChild);
        }
    }

    void postorder_traversal(Node node){
        if(node != null){
            postorder_traversal(node.leftChild);
            postorder_traversal(node.rightChild);
            System.out.println(node.data + " ");
        }
    }

    public static void main(String[] args){
        BinaryTree tree = new BinaryTree();

        tree.root = new Node(27);
        tree.root.leftChild = new Node(12);
        tree.root.rightChild = new Node(3);
        tree.root.leftChild.leftChild = new Node(44);
        tree.root.leftChild.rightChild = new Node(17);
        tree.root.rightChild.leftChild = new Node(56);

        System.out.println("Inorder Traversal: ");
        tree.inorder_traversal(tree.root);

        System.out.println("\nPreorder Traversal: ");
        tree.preorder_traversal(tree.root);

        System.out.println("\nPostorder Traversal: ");
        tree.postorder_traversal(tree.root);
    }
}
