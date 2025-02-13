///  Jeremy Spence, 1660, 2/13/25

import java.util.ArrayList;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
   class AddressBook {
       static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        ArrayList<People> myListOfPeople = new ArrayList<>();
        People person1 = new People("Bruce lee", "brucelee@gmail.com");
        People person2 = new People("Jammy Sparks", "jammysparks@gmail.com");
        People person3 = new People("The Goat", "thegoat@gmail.com");
        myListOfPeople.add(person1);
        myListOfPeople.add(person2);
        myListOfPeople.add(person3);
        while (true) {

        System.out.println("Please enter your contact name");
        String name = input.nextLine();
        System.out.println("Please enter your email address");
        String email = input.nextLine();

        People persons = new People(name,email);
        myListOfPeople.add(persons);
        System.out.println(myListOfPeople);
        }

    }
}