package com.addressbook;
import java.util.ArrayList;
import java.util.Scanner;

//Address book program
public class AddressBook extends PersonDetails {
    public static AddressBook newPerson = new AddressBook();
    public static ArrayList<PersonDetails> person = new ArrayList<>();
    public static void addPerson(){
        Scanner scanner = new Scanner(System.in);

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
        newPerson.setZip(scanner.nextLine());
        System.out.println("Enter phone number");
        newPerson.setPhoneNumber(scanner.nextLine());
        System.out.println("Enter Email");
        newPerson.setEmail(scanner.nextLine());

        PersonDetails contactPerson = new PersonDetails(newPerson.getFirstName(),newPerson.getLastName(), newPerson.getAddress(), newPerson.getCity(), newPerson.getState(),
                                         newPerson.getZip(), newPerson.getPhoneNumber(),newPerson.getEmail());
                                            person.add(contactPerson);
        System.out.println(person);
    }

    public static void deletePerson(){
        Scanner scanner = new Scanner(System.in);
        boolean found=false;
        System.out.println("Enter the first name of contact to delete");
        String nameDelete;
        nameDelete = scanner.nextLine();
        ListIterator<PersonDetails> iterator = person.listIterator();
        while (iterator.hasNext()) {
            PersonDetails contact = iterator.next();
            if (nameDelete.equals(contact.getFirstName())) {
                iterator.remove();
                found=true;
            }
        }
        if (found){
            System.out.println("record is deleted");
            System.out.println(person);
        }else {
            System.out.println("record not found");
        }
    }
    public static void modifyUser()

    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the first name whose contact to be edited");
        String name = scanner.nextLine();
        boolean found=false;
        ListIterator<PersonDetails> iterator = person.listIterator();
        while (iterator.hasNext()){
            PersonDetails contact= iterator.next();
            if (name.equals(contact.getFirstName()))
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
                newPerson.setZip(scanner.nextLine());
                System.out.println("Edit phone number");
                newPerson.setPhoneNumber(scanner.nextLine());
                System.out.println("Edit Email");
                newPerson.setEmail(scanner.nextLine());
                iterator.set(new PersonDetails(newPerson.getFirstName(),newPerson.getLastName(), newPerson.getAddress(), newPerson.getCity(), newPerson.getState(), newPerson.getZip(), newPerson.getPhoneNumber(),newPerson.getEmail()));
                found=true;
            }

        }
        if (found){
            System.out.println("record is update");
            System.out.println(person);
        }else {
            System.out.println("record not found");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int flag = 0;
        int choice;
        System.out.println("Welcome to Address Book Program");

        while (flag != 1) {

            System.out.println("Enter 1 to add contact details");
            System.out.println("Enter 2 to edit contact details");
            System.out.println("Enter 3 to delete contact");
            System.out.println("Enter 4 to Exit from the Adressbook");

            choice = scanner.nextInt();
            scanner.nextLine();


            if (choice == 1) {
                addPerson();
            } else if (choice == 2) {
                modifyUser();
            } else if (choice==3) {
                deletePerson();
            } else if (choice == 4) {
                flag = 1;
            }
        }
    }
}