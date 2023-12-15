package task6;

import java.util.Comparator;

class User implements Comparable<User> {
    private int personalNumber;
    private String firstName;
    private String lastName;
    private int age;

    public User(int personalNumber, String firstName, String lastName, int age) {
        this.personalNumber = personalNumber;
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    public int getPersonalNumber() {
        return personalNumber;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }

    @Override
    public int compareTo(User otherUser) {
        return Integer.compare(this.personalNumber, otherUser.getPersonalNumber());
    }

    @Override
    public String toString() {
        return "User{" +
                "personalNumber=" + personalNumber +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                '}';
    }
}

class UserNumberComparator implements Comparator<User> {
    @Override
    public int compare(User o1, User o2) {
        return o1.getPersonalNumber() - o2.getPersonalNumber();
    }
}