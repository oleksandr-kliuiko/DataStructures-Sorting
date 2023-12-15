package task1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> list = new ArrayList<>();

        LOOP:
        for (;;) {
            String number = scanner.nextLine();
            switch (number) {
                case "LIST": {
                    print(list);
                    continue;
                }
                case "STOP": break LOOP;
                default: list.add(number);
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
