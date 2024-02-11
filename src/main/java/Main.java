import exercise.model.Person;
import service.PersonService;

import java.util.ArrayList;
import java.util.List;

public class Main {


    public static void main(String[] args) {
        List<Person> people = new ArrayList<>();

        people.add(new Person("Valentina","Garzon","valen@",26);
        people.add(new Person(2, "Maria", "Gomez", "maria@example.com", 17));
        people.add(new Person(3, "Carlos", "Lopez", "carlos@example.com", 25));
        people.add(new Person(4, "Ana", "Martinez", "ana@example.com", 16));
        people.add(new Person(5, "Pedro", "Rodriguez", "pedro@example.com", 30));
        people.add(new Person(6, "Laura", "Sanchez", "laura@example.com", 15));


        PersonService.categorizePersons(people);




    }
}
