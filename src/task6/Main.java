package task6;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<User> users = new ArrayList<>();
        users.add(new User(14235, "John", "Doe", 25));
        users.add(new User(475673, "Jane", "Smith", 30));
        users.add(new User(1232, "Alice", "Johnson", 22));
        users.add(new User(90755, "Bob", "Williams", 35));
        users.add(new User(465452, "Eva", "Brown", 28));
        users.add(new User(2355788, "David", "Taylor", 32));
        users.add(new User(1234, "Emma", "Miller", 27));
        users.add(new User(12444, "Frank", "Davis", 40));
        users.add(new User(190969, "Grace", "Anderson", 31));
        users.add(new User(435, "Henry", "Moore", 26));

        System.out.println("Список користувачів до сортування:");
        for (User user : users) {
            System.out.println(user);
        }

        Collections.sort(users, new UserNumberComparator());

        System.out.println("\nСписок користувачів після сортування:");
        for (User user : users) {
            System.out.println(user);
        }
    }
}
