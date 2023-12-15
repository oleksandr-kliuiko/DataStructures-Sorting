package GenericsWildcard;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
//        List<Programmer> listP = new ArrayList<>();
//        listP.add(new Programmer("Bob", 12321));
//        listP.add(new Programmer("Ben", 13111));
//        print(listP);
//
//        List<Manager> listM = new ArrayList<>();
//        listM.add(new Manager("Jack", 120304));
//        listM.add(new Manager("Bart", 95959));
//        print(listM);
//
//        List<Worker> listW = new ArrayList<>();
//        listW.add(new Worker("John", 100404));
//        listW.add(new Worker("Den", 949494));
//        print(listW);

//        List<Director> listD = new ArrayList<>();
//        listD.add(new Director("Boris", 9999999));
//        print(listD);
    }


//    static void print(List<Worker> workers) {
//        for (Object w : workers) {
//            System.out.println(((Worker) w).getName());
//        }
//    }

//    static void print(List<?> list) {
//        for (Object o : list) {
//            System.out.println(o);
//        }
//    }

//    static void print(List<? extends Worker> workers) {
//        for (Worker w : workers) {
//            System.out.println(w.getName());
//        }
//    }

    static void print(List<? super Programmer> workers) {
        for (Object w : workers) {
            System.out.println(((Worker) w).getName());
        }
    }


}
