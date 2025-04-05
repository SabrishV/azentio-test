import java.util.Scanner;

public class linked {

    static class Node {
        int value;
        Node nextNode; 

        Node(int value) { 
            this.value = value;
            this.nextNode = null; 
        }
    }

    public static boolean checkCycle(Node head) { 
        if (head == null) {
            return false; 
        }

        Node slowPointer = head; 
        Node fastPointer = head;

        while (fastPointer != null && fastPointer.nextNode != null) { 
            slowPointer = slowPointer.nextNode; 
            fastPointer = fastPointer.nextNode.nextNode; 

            if (slowPointer == fastPointer) { 
                return true;
            }
        }
        return false;
    }

    public static Node buildLinkedList(int[] arr) {
        if (arr.length == 0) return null;

        Node headNode = new Node(arr[0]);
        Node currentNode = headNode;

        for (int i = 1; i < arr.length; i++) {
            currentNode.nextNode = new Node(arr[i]);
            currentNode = currentNode.nextNode;
        }

        return headNode;
    }

    public static void main(String args[]) {
        
        int[] arr = {1, 4, 7, 9, 5}; 

        Node headNode = buildLinkedList(arr);

        //cycle 
        headNode.nextNode.nextNode.nextNode.nextNode = headNode.nextNode; 

        if (checkCycle(headNode)) { 
            System.out.println("Cycle detected in the linked list.");
        } else {
            System.out.println("No cycle in the linked list.");
        }
    }
}