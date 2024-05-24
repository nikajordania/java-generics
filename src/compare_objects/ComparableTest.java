package compare_objects;

import model.Person3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ComparableTest {
    public static void main(String[] args) {
        List<Person3> people = new ArrayList<>();
        people.add(new Person3("Alice", 30));
        people.add(new Person3("Bob", 25));
        people.add(new Person3("Charlie", 35));
        people.add(new Person3("David", 25));

//        people.sort(Comparator.comparingInt(Person3::getAge));
        Collections.sort(people);

        System.out.println("Sorted by name:");
        for (Person3 person : people) {
            System.out.println(person.getName() + ", " + person.getAge());
        }

        people.sort(Person3::compareByAge);

        System.out.println("Sorted by age:");
        for (Person3 person : people) {
            System.out.println(person.getName() + ", " + person.getAge());
        }
    }
}
