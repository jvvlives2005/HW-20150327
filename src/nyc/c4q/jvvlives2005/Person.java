package nyc.c4q.jvvlives2005;

/**
 * Joshelyn Vivas
 *
 *You are provided with a Person class.
 * This class has private fields name, phoneNumber and city, along with their getter and setter methods.

 Write a function called checkSameCity which accepts as input two Person instances and
 checks if they live in the same city. The function should return a boolean value
 A Person has recently had a child, whose name is 'Abc'.
 Write a function called registerChild which accepts as input a Person instance(Parent)
 and returns a new Person instance for the child, which has the same phoneNumber and city as the parent.
 * A Person class
 *
 *
 * I AM VERY CONFUSED WITH THIS ONE....I THINK IT'S THE MANY CODES THAT'S THROWING ME OFF---I'LL TRY TO UPDATE IT
 * SOON
 */
import java.util.Scanner;

public class Person {

    private String name;
    private String phoneNumber;
    private String city;

    public Person(){
    }

    public Person(String name){
        this.name = name;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public static boolean checkSameCity (Person johnDoe, Person janeDoe) {
        if (johnDoe.getCity().equalsIgnoreCase(janeDoe.getCity())) {
            return true;
        } else {
            return false;
        }
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static Person registerChild (Person parent) {
        Person child = new Person();
        child.setName("Abc");
        return child;
    }


    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("What is your name?");
        String nameOne = input.nextLine();
        System.out.println("And you?");
        String nameTwo = input.nextLine();


    }

}