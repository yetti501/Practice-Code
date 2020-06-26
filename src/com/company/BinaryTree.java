package com.company;

import java.util.Random;

public class BinaryTree {

    private int [] _binaryTree;

    void createBinaryTree(int _size){
        Random rand = new Random();
        _binaryTree = new int[_size];

        for(int i = 0; i < _size; i++){
            _binaryTree[i] = rand.nextInt(100);
        }

        System.out.println(_size + " number of elements were added to the Binary Tree...\n");

        printBinaryTree();
    }

    void printBinaryTree(){
        System.out.println(" INDEX \t: \tVALUE ");
        for(int i = 0; i < _binaryTree.length; i++){
            System.out.println("\t " + i + " \t: \t" + _binaryTree[i]);
        }
    }
}
