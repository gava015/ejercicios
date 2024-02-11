package service;
import exercise.model.Person;
import java.util.ArrayList;
import java.util.List;

public class PersonService {

     public static  List<Person> minors = new ArrayList<>();
     public static List<Person> adults = new ArrayList<>();


    public static  Person[] toCreateArray() {

        Person[] personArray = new Person[6];
        personArray[0] = new Person("Valentina","Garzon","valen@",26);
        personArray[1] = new Person("Camila","Lopez","camila@",16);
        personArray[2] = new Person("Ana", "Martinez", "ana@", 18);
        personArray[3] = new Person("Pedro", "Rodriguez", "pedro@", 30);
        personArray[4] = new Person("Nicolás","Garzon","nico@",8);
        personArray[5] = new Person("Laura", "Sanchez", "laura@", 15);

        return personArray;
    }

    public static void categorizePersons(Person[] personArray) {
        for (Person person : personArray) {
            if (person.getAge() >= 18) {
                adults.add(person);
            } else {
                minors.add(person);
            }
        }
    }

    public static void toShowList() {
        System.out.println("Menores de edad:");
        for (Person minor : minors) {
            System.out.println(minor.getName() + " " + minor.getLastname());
        }

        System.out.println("Adultos:");
        for (Person adult : adults) {
            System.out.println(adult.getName() + " " + adult.getLastname());

        }
    }
}

















