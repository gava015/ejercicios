import exercise.model.Person;
import service.PersonService;

public class Main {

    public static void main(String[] args) {
        Person[] personArray = PersonService.toCreateArray();
        PersonService.categorizePersons(personArray);
        PersonService.toShowList();


    }
}
