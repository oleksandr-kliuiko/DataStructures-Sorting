package task3;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Set<String> set = new HashSet<>();

        LOOP:
        for (;;) {
            String number = scanner.nextLine();
            switch (number) {
                case "LIST": {
                    print(set);
                    continue;
                }
                case "STOP": break LOOP;
                default: set.add(number);
            }

        }
        scanner.close();
    }

    static void print(Set<String> set) {
        for (String s : set) {
            System.out.println(s);
        }
    }
}
