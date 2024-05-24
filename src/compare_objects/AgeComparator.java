package compare_objects;

import model.Person;
import model.Person2;

import java.util.Comparator;

public class AgeComparator implements Comparator<Person> {

    @Override
    public int compare(Person p1, Person p2) {
        return Integer.compare(p1.getAge(), p2.getAge());
    }
}

class ReverseNameComparator implements Comparator<Person> {

    @Override
    public int compare(Person p1, Person p2) {
        return p2.getName().compareTo(p1.getName());
    }
}

class AgeThenNameComparator implements Comparator<Person> {

    @Override
    public int compare(Person p1, Person p2) {
        int ageComparison = Integer.compare(p1.getAge(), p2.getAge());
        if (ageComparison != 0) {
            return ageComparison;
        }
        return p1.getName().compareTo(p2.getName());
    }
}

class NameLengthComparator implements Comparator<Person> {

    @Override
    public int compare(Person p1, Person p2) {
        return Integer.compare(p1.getName().length(), p2.getName().length());
    }
}

class ReverseAgeComparator implements Comparator<Person> {

    @Override
    public int compare(Person p1, Person p2) {
        return Integer.compare(p2.getAge(), p1.getAge());
    }
}

class NameAndReverseAgeComparator implements Comparator<Person> {

    @Override
    public int compare(Person p1, Person p2) {
        int nameComparison = p1.getName().compareTo(p2.getName());
        if (nameComparison != 0) {
            return nameComparison;
        }
        return Integer.compare(p2.getAge(), p1.getAge());
    }
}

class CustomPersonComparator implements Comparator<Person2> {

    @Override
    public int compare(Person2 p1, Person2 p2) {
        int nameComparison = p1.getName().compareTo(p2.getName());
        if (nameComparison != 0) {
            return nameComparison;
        }

        int ageComparison = Integer.compare(p1.getAge(), p2.getAge());
        if (ageComparison != 0) {
            return ageComparison;
        }

        int cityComparison = p1.getAddress().getCity().compareTo(p2.getAddress().getCity());
        if (cityComparison != 0) {
            return cityComparison;
        }

        return p1.getAddress().getCountry().compareTo(p2.getAddress().getCountry());
    }
}
