package com.addressbook;
import java.util.ArrayList;
import java.util.Scanner;



public class AddressBook extends PersonDetails {
    public static void main(String[] args)
    {
        AddressBook newPersonDetails = new AddressBook();
        ArrayList<AddressBook> person = new ArrayList<>();

        System.out.println("Welcome to Address System");
        Scanner scanner =new Scanner(System.in);

        System.out.println("Please enter first name");
        newPersonDetails.setFirstName(scanner.nextLine());

        System.out.println("Please enter last name");
        newPersonDetails.setLastName(scanner.nextLine());

        System.out.println("Please enter address");
        newPersonDetails.setAddress(scanner.nextLine());

        System.out.println("Please enter city");
        newPersonDetails.setCity(scanner.nextLine());

        System.out.println("Please enter state");
        newPersonDetails.setState(scanner.nextLine());

        System.out.println("Please enter zip code");
        newPersonDetails.setZip(scanner.nextInt());

        System.out.println("Please enter phone number");
        newPersonDetails.setPhoneNumber(scanner.nextInt());

        System.out.println("Please enter EmailId");

        newPersonDetails.setEmail(scanner.nextLine());
        person.add(newPersonDetails);

        System.out.println(person);
    }
}
