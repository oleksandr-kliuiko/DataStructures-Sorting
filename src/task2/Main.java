package task2;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> carNumbers = new LinkedList<>();

        LOOP:
        for (;;) {
            System.out.print("Car number: ");
            String number = scanner.nextLine();

            switch (number.toUpperCase()) {
                case "LIST": {
                    print(carNumbers);
                    continue;
                }
                case "STOP":
                    break LOOP;
            }

            System.out.print("Position number: ");
            int numPosition = scanner.nextInt();
            scanner.nextLine();

            if (numPosition >= carNumbers.size()) {
                carNumbers.add(number);
            } else {
                carNumbers.add(numPosition - 1, number);
            }
        }
        scanner.close();
    }

    static void print(List<String> list) {
        for (String s : list) {
            System.out.println(s);
        }
    }
}
