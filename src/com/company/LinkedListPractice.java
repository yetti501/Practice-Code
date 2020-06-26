package com.company;

import java.util.*;

public class LinkedListPractice {
    private LinkedList<Integer> _linkedList = new LinkedList<Integer>();

    void createLinkedList(int _size){
        Random rand = new Random();
        for(int i = 0; i < _size; i++) {
            _linkedList.add(rand.nextInt(100));
        }
        printLinkedList();
    }

    void deleteLinkedListElement(int _delete){
        ListIterator<Integer> iterator = _linkedList.listIterator();
        if(_linkedList.contains(_delete)) {
            _linkedList.remove((Integer)_delete);
//            while(iterator.hasNext()){
//                if(_linkedList.equals(_delete)){
//                    _linkedList.remove();
//                }
//            }
        } else {
            Scanner scanner = new Scanner(System.in);
            String input;
            System.out.println("The elements you wish to remove does not exist in the linked list.");
            System.out.print("Would you like to delete a value (Y/N): ");
            input = scanner.next();
            while (!(input.contentEquals("Y") || input.contentEquals("y") ||
                    input.contentEquals("n") || input.contentEquals("n"))) {
                System.out.println("You have not entered a valid input, please try again...");
                System.out.print("Would you like to delete a value (Y/N): ");
                input = scanner.next();
            }
            if(input.contentEquals("Y") || input.contentEquals("y")){
                printLinkedList();
                System.out.print("Enter a value that you wish to remove: ");
                int delete = scanner.nextInt();
                deleteLinkedListElement(delete);
            } else {
                return;
            }
        }
    }

    void deleteWholeLinkedList(){
        ListIterator<Integer> iterator = _linkedList.listIterator();
        System.out.println("Removing all elements from the Linked List...");
        while(iterator.hasNext()){
            _linkedList.remove(iterator.next());
        }
    }

    void sortLinkedList(){
        printLinkedList();
        Collections.sort(_linkedList);
        printLinkedList();
    }

    void printLinkedList() {
        ListIterator<Integer> iterator = _linkedList.listIterator();
        System.out.println("Printing all elements in the Linked List: ");
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
