package com.company;

import javax.swing.tree.TreeNode;
import java.util.Scanner;

public class Main {

    private Scanner scanner = new Scanner(System.in);

    private Potato _potato = new Potato();
    private BinaryTree _binaryTree = new BinaryTree();
    private LinkedListPractice _linkedList = new LinkedListPractice();
    private TwoCityScheduling _twoCityScheduling = new TwoCityScheduling();
    private CharacterString _characterString = new CharacterString();
    private RandomPick _randomPick = new RandomPick();

    public static void main(String[] args) {
        System.out.println("Hello World.");
        Main _main = new Main();
        _main.testPotato();
//        _main.binaryTree();
//        _main.linkedList();
//        _main.twoCityScheduling();
//        _main.characterString();
        _main._randomPick();
    }

    void testPotato(){
        _potato.getPotato();
    }

    void binaryTree(){
        System.out.print("Enter a size for a Binary Tree: ");
        int bt_size = scanner.nextInt();
        _binaryTree.createBinaryTree(bt_size);
    }

    void linkedList(){
        System.out.print("Enter a size for a Linked List: ");
        int ll_size = scanner.nextInt();
        _linkedList.createLinkedList(ll_size);

        System.out.print("Do you want to delete an element from the Linked List (Y/N): ");
        String ll_delete = scanner.next();
        while (!(ll_delete.contentEquals("Y") || ll_delete.contentEquals("y") ||
                ll_delete.contentEquals("n") || ll_delete.contentEquals("n"))){
            System.out.println("You have not entered a valid input, please try again...");
            System.out.print("Do you want to delete an element from the Linked List (Y/N): ");
            ll_delete = scanner.next();
        }

        if(ll_delete.contentEquals("Y") || ll_delete.contentEquals("y")){
            _linkedList.printLinkedList();
            System.out.print("Enter the value you wish to delete: ");
            _linkedList.deleteLinkedListElement((scanner.nextInt()));
            _linkedList.printLinkedList();
        }


        System.out.print("Do you want to delete the whole Linked List: (Y/N) ");
        String ll_delete_all = scanner.next();
        while (!(ll_delete.contentEquals("Y") || ll_delete.contentEquals("y") ||
                ll_delete.contentEquals("n") || ll_delete.contentEquals("n"))) {
            System.out.println("You have not entered a valid input, please try again...");
            System.out.print("Do you want to delete the whole Linked List: (Y/N) ");
            ll_delete_all = scanner.next();
        }
        if (ll_delete_all.contentEquals("Y") || ll_delete_all.contentEquals("y")) {
            _linkedList.printLinkedList();
            System.out.println("Deleting all elements in the Linked List...");
            _linkedList.deleteWholeLinkedList();
            _linkedList.printLinkedList();
        }
        _linkedList.sortLinkedList();
    }

    void twoCityScheduling(){
        _twoCityScheduling.printData();
        int cost = _twoCityScheduling.citySelector();
        System.out.println("COST: " + cost);
    }

    void characterString(){
        System.out.println("Please enter a short sentence: ");
        String strInput = scanner.nextLine();
        char[] input = new char[strInput.length()];
        for(int i = 0; i < strInput.length(); i++){
            input[i] = strInput.charAt(i);
        }
        for(int j = 0; j < input.length; j++) {
            System.out.println("STRING: " + input[j]);
        }
        _characterString.reverseCharacterString(input);

    }

    void _randomPick(){
        _randomPick.weighterPick();

    }

}
