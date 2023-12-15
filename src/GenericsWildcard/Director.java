package GenericsWildcard;

public class Director {
    private String name;
    private int salary;

    public Director(String name, int salary) {
        this.name = name;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Director{" +
                "name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }
}
