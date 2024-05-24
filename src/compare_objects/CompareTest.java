package compare_objects;

import model.Address;
import model.Person;
import model.Person2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class CompareTest {

    public static void main(String[] args) {
        Comparator<Person> combinedComparator = Comparator.comparing(Person::getName)
                .thenComparing(Person::getAge);

        t2();
//
//        List<Person> people = new ArrayList<>();
//        people.add(new Person("Alice", 30));
//        people.add(new Person("Bob", 25));
//        people.add(new Person("Charlie", 35));
//        people.add(new Person("Alice", 25));
//
////        Collections.sort(people, combinedComparator);
//        Collections.sort(people, new NameAndReverseAgeComparator());
//
//        for (Person person : people) {
//            System.out.println(person.getName() + ", " + person.getAge());
//        }
//
//
//        List<Person> sortedPeople = people.stream()
//                .sorted(Comparator.comparing(Person::getName)
//                        .thenComparing(Person::getAge))
//                .toList();
//
//        sortedPeople.forEach(person -> System.out.println(person.getName() + ", " + person.getAge()));

    }

    public static void t2() {
        Address address1 = new Address("New York", "USA");
        Address address2 = new Address("Los Angeles", "USA");
        Address address3 = new Address("London", "UK");

        List<Person2> people = new ArrayList<>();
        people.add(new Person2("Nino", 30, address1));
        people.add(new Person2("Gio", 25, address2));
        people.add(new Person2("Gio2", 35, address3));
        people.add(new Person2("Nino2", 25, address1));

        Collections.sort(people, new CustomPersonComparator());

        for (Person2 person : people) {
            System.out.println("Name: " + person.getName() + ", Age: " + person.getAge() +
                    ", City: " + person.getAddress().getCity() + ", Country: " + person.getAddress().getCountry());
        }
    }
}
