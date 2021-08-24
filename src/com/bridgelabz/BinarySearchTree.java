package com.bridgelabz;
/**
 * Purpose - To add values in Binary Search Tree and check whether 63 is present.
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
        myTree.add(22);
        myTree.add(40);
        myTree.add(11);
        myTree.add(3);
        myTree.add(16);
        myTree.add(60);
        myTree.add(95);
        myTree.add(65);
        myTree.add(63);
        myTree.add(67);
        myTree.print(myTree.root);
        boolean flag = myTree.search(63);
        if (flag == true)
            System.out.println("\n63 is present");
        else
            System.out.println("\n63 is not present");
    }
}
