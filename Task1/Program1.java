package org.example.hw230424.Task1;

import java.util.LinkedList;
import java.util.Scanner;

public class Program1 {
    public static void main(String[] args) {
        LinkedList<Integer> someList = new LinkedList<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите длину списка:");
        int length = sc.nextInt();
        System.out.println("Введите элементы списка:");
        for (int i = 0; i < length; i++) {
            someList.add(sc.nextInt());
        }
        sc.close();
        PrintReverseLinkedList(someList);
    }

public static void PrintReverseLinkedList(LinkedList<Integer> incList) {
    System.out.println("Список в обратном порядке:");
    while (incList.size() > 0) {
        System.out.printf(incList.peekLast() + " ");
        incList.removeLast();
    }
}
}
