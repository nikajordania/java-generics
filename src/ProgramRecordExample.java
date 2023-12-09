import java.util.Objects;

public class ProgramRecordExample {

    public static void main(String args[]) {

        Person tom1 = new Person("Tom1", 36);
        System.out.println(tom1.toString());


        PersonRecord tom = new PersonRecord("Tom", 36);

        System.out.println(tom.name());     // Tom
        System.out.println(tom.age());      // 36
        System.out.println(tom.hashCode());

        PersonRecord bob = new PersonRecord("Bob", 21);
        PersonRecord tomas = new PersonRecord("Tom", 36);
        System.out.println(tom.equals(bob));    // false
        System.out.println(tom.equals(tomas));  // true
    }
}

class Person {
    private final String name;
    private final int age;

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    String name() {
        return name;
    }

    int age() {
        return age;
    }

    public boolean equals(Object o) {
        if (!(o instanceof Person)) return false;
        Person other = (Person) o;
        return other.name == name && other.age == age;
    }

    public int hashCode() {
        return Objects.hash(name, age);
    }

    public String toString() {
        return String.format("Person[name=%s, age=%d]", name, age);
    }
}

record PersonRecord(String name, int age) {
}

record PersonChecked(String name, int age) {

    PersonChecked {

        if (age < 1 || age > 110) {
            age = 18;
        }

    }

//    PersonChecked(String name, int age){
//
//        if(age < 0 || age > 120) age = 18;
//
//        this.name = name;
//        this.age = age;
//    }

    PersonChecked(String firstName, String lastName, int age) {

        this(firstName + " " + lastName, age);

    }

    // Override
    public String name() {
        return "Mister " + name;
    }

    public String toString() {
        return String.format("Person %s, Age: %d", name, age);
    }


    static int minAge;

    static {
        minAge = 18;
        System.out.println("Static initializer");
    }
}