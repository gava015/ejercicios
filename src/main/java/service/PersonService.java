package service;

import exercise.model.Person;

import java.util.ArrayList;
import java.util.List;

public class PersonService {
    public static List<Person> minors = new ArrayList<>();
    public static List<Person> adults = new ArrayList<>();

    public static void categorizePersons(List<Person> persons) {
        for (Person person : persons) {
            if (person.getAge() >= 18) {
                adults.add(person);
            } else {
                minors.add(person);
            }
        }
    }
}

