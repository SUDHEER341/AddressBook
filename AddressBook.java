package com.addressbook;

import java.util.ArrayList;
import java.util.Scanner;
public class AddressBook extends PersonDetails {
    public static void main(String[] args) {
        int flag = 0;
        int option;

        AddressBook newPerson = new AddressBook();
        ArrayList<AddressBook> person = new ArrayList<>();
        System.out.println("Welcome to Address Book System Programm");
        Scanner scanner = new Scanner(System.in);

        while (flag != 1) {
            System.out.println("Press 1 to add contact details of a person");
            System.out.println("Press 2 to edit details in the addressbook");
            System.out.println("Press 3 to exit from the addresbook");
            option = scanner.nextInt();
            scanner.nextLine();

            if (option == 1) {

                System.out.println("Enter first name");
                newPerson.setFirstName(scanner.nextLine());
                System.out.println("Enter last name");
                newPerson.setLastName(scanner.nextLine());
                System.out.println("Enter address");
                newPerson.setAddress(scanner.nextLine());
                System.out.println("Enter city");
                newPerson.setCity(scanner.nextLine());
                System.out.println("Enter state");
                newPerson.setState(scanner.nextLine());
                System.out.println("Enter zip code");
                newPerson.setZip(scanner.nextInt());
                System.out.println("Enter phone number");
                newPerson.setPhoneNumber(scanner.nextInt());
                System.out.println("Enter Email");
                scanner.nextLine();
                newPerson.setEmail(scanner.nextLine());
                person.add(newPerson);

                System.out.println(person);
            }

            else if (option == 2)
            {
                System.out.println("Enter the first name whose contact to be edited");
                String name = scanner.nextLine();
                if (name.equals(newPerson.getFirstName()))
                {
                    System.out.println("Edit first name");
                    newPerson.setFirstName(scanner.nextLine());
                    System.out.println("Edit last name");
                    newPerson.setLastName(scanner.nextLine());
                    System.out.println("Edit address");
                    newPerson.setAddress(scanner.nextLine());
                    System.out.println("Edit city");
                    newPerson.setCity(scanner.nextLine());
                    System.out.println("Edit state");
                    newPerson.setState(scanner.nextLine());
                    System.out.println("Edit zip code");
                    newPerson.setZip(scanner.nextInt());
                    System.out.println("Edit phone number");
                    newPerson.setPhoneNumber(scanner.nextInt());
                    scanner.nextLine();
                    System.out.println("Edit Email Address");
                    newPerson.setEmail(scanner.nextLine());
                    person.add(newPerson);
                }
                else
                {
                    System.out.println("Given name is  doesn't exist in the addressbook");
                }
            }
            else if (option == 3)
            {
                flag = 1;
            }
        }
    }
}