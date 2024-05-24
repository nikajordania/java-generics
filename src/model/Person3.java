package model;

public class Person3 implements Comparable<Person3> {
    private String name;
    private int age;

    public Person3(String name, int age) {
        this.name = name;
        this.age = age;
    }


    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public int compareByName(Person3 otherPerson) {
        return this.name.compareTo(otherPerson.getName());
    }

    public int compareByAge(Person3 otherPerson) {
        return Integer.compare(this.age, otherPerson.getAge());
    }

    @Override
    public int compareTo(Person3 otherPerson) {
        return compareByName(otherPerson);
    }
}
