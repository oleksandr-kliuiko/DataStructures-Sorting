package task5;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        final int size = 1000000;
        List<Integer> arrayList = new ArrayList<>();
        List<Integer> linkedList = new LinkedList<>();
        Random random = new Random();

        // Заповнення списків випадковими числами
        for (int i = 0; i < size; i++) {
            int randomNumber = random.nextInt();
            arrayList.add(randomNumber);
            linkedList.add(randomNumber);
        }

        // Операція додавання в кінець списку
        long startTime = System.nanoTime();
        arrayList.add(random.nextInt());
        long endTime = System.nanoTime();
        System.out.println("ArrayList add at end: " + (endTime - startTime) + " ns");

        startTime = System.nanoTime();
        linkedList.add(random.nextInt());
        endTime = System.nanoTime();
        System.out.println("LinkedList add at end: " + (endTime - startTime) + " ns");

        //Операція додавання в першу половину списку
        startTime = System.nanoTime();
        arrayList.add(size / 2, random.nextInt());
        endTime = System.nanoTime();
        System.out.println("ArrayList add in first half: " + (endTime - startTime) + " ns");

        startTime = System.nanoTime();
        linkedList.add(size / 2, random.nextInt());
        endTime = System.nanoTime();
        System.out.println("LinkedList add in first half: " + (endTime - startTime) + " ns");

        //Операція отримання елемента з кінця списку
        startTime = System.nanoTime();
        arrayList.get(size - 1);
        endTime = System.nanoTime();
        System.out.println("ArrayList get from end: " + (endTime - startTime) + " ns");

        startTime = System.nanoTime();
        linkedList.get(size - 1);
        endTime = System.nanoTime();
        System.out.println("LinkedList get from end: " + (endTime - startTime) + " ns");

        //Операція отримання елемента з першої половини списку
        startTime = System.nanoTime();
        arrayList.get(size / 4);
        endTime = System.nanoTime();
        System.out.println("ArrayList get from first half: " + (endTime - startTime) + " ns");

        startTime = System.nanoTime();
        linkedList.get(size / 4);
        endTime = System.nanoTime();
        System.out.println("LinkedList get from first half: " + (endTime - startTime) + " ns");

        //Операція видалення елемента з кінця списку
        startTime = System.nanoTime();
        arrayList.remove(size - 1);
        endTime = System.nanoTime();
        System.out.println("ArrayList remove from end: " + (endTime - startTime) + " ns");

        startTime = System.nanoTime();
        linkedList.remove(size - 1);
        endTime = System.nanoTime();
        System.out.println("LinkedList remove from end: " + (endTime - startTime) + " ns");

        //Операція видалення елемента з першої половини списку
        startTime = System.nanoTime();
        arrayList.remove(size / 4);
        endTime = System.nanoTime();
        System.out.println("ArrayList remove from first half: " + (endTime - startTime) + " ns");

        startTime = System.nanoTime();
        linkedList.remove(size / 4);
        endTime = System.nanoTime();
        System.out.println("LinkedList remove from first half: " + (endTime - startTime) + " ns");
    }
}