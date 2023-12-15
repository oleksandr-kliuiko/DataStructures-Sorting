package task4;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String, String> map = new HashMap<>();

        LOOP:
        for (;;) {
            System.out.print("Car number: ");
            String number = scanner.nextLine();

            switch (number.toUpperCase()) {
                case "LIST": {
                    print(map);
                    continue;
                }
                case "CAR": {
                    printCar(map);
                    continue;
                }
                case "OWNER": {
                    printOwner(map);
                    continue;
                }
                case "STOP":
                    break LOOP;
            }

            System.out.print("Owner: ");
            String owner = scanner.nextLine();

            map.put(number, owner);
        }
        scanner.close();
    }

    static void print(Map<String, String> map) {
        for (String s : map.keySet()) {
            System.out.println("Number: " + s + "\tOwner: " + map.get(s));
        }
    }

    static void printCar(Map<String, String> map) {
        for (String s : map.keySet()) {
            System.out.println(s);
        }
    }

    static void printOwner(Map<String, String> map) {
        for (String s : map.values()) {
            System.out.println(s);
        }
    }
}
