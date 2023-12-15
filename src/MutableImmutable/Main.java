package MutableImmutable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> mutableList = new ArrayList<>();
        mutableList.add(1);
        mutableList.add(2);
        mutableList.add(3);
        System.out.println(mutableList);

        List<String> immutableList = List.of("1", "2");
        //immutableList.add("3");
        System.out.println(immutableList);


        List<Integer> l = Collections.unmodifiableList(mutableList);

        //mutableList = List.copyOf(mutableList);
        //mutableList.add(4);

        //List<Integer> list = List.copyOf(mutableList);
        //System.out.println(list);

    }
}
