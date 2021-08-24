package com.bridgelabz;
/**
 * Purpose - To create Binary Search Tree
 * @author - Sakshi Shetty
 * @version - 16.0
 * @since - 2021-08-23
 */
public class BinarySearchTree {
    public static void main(String[] args) {
        System.out.println("Welcome to the Program");
        BinaryTree<Integer> myTree = new BinaryTree<>();
        myTree.add(56);
        myTree.add(30);
        myTree.add(70);
        myTree.print(myTree.root);
    }
}
