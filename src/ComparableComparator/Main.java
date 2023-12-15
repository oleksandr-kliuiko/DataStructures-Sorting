package ComparableComparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Worker w1 = new Worker(2, "Nick");
        Worker w2 = new Worker(22, "Bob");
        Worker w3 = new Worker(1, "Jack");

        List<Worker> list = new ArrayList<>();
        list.add(w1);
        list.add(w2);
        list.add(w3);

        Collections.sort(list);

        System.out.println(list);
    }
}

class Worker implements Comparable<Worker> {
    private int id;
    private String name;

    public Worker(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public int compareTo(Worker o) {
        return this.id - o.id;
    }

//    @Override
//    public int compareTo(Worker o) {
//        return this.name.compareTo(o.name);
//    }

    @Override
    public String toString() {
        return "Worker{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }
}

class NameLenghtComparator implements Comparator<Worker> {

    @Override
    public int compare(Worker w1, Worker w2) {
        int result = w1.getName().length() - w2.getName().length();
        if (result == 0) {
            result = w1.getName().compareTo(w2.getName());
        }
        return result;
    }
}
