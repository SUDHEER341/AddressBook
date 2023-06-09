package com.addressbook;
public class PersonDetails {

    String firstName = new String();
    String lastName = new String();
    String address = new String();
    String city = new String();
    String state = new String();
    String zip;
    String  phoneNumber;
    String email = new String();
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getPhoneNumber() {
        return phoneNumber;
    }
    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
    public String getZip() {
        return zip;
    }
    public void setZip(String zip) {
        this.zip = zip;
    }
    public String getState() {
        return state;
    }
    public void setState(String state) {
        this.state = state;
    }
    public String getAddress() {
        return address;
    }
    public void setAddress(String address) {
        this.address = address;
    }
    public String getCity() {
        return city;
    }
    public void setCity(String city) {
        this.city = city;
    }
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public String getFirstName() {
        return firstName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public String getLastName() {
        return lastName;
    }
    public PersonDetails(String firstName, String lastName, String address, String city, String state, int zip, int phoneNumber ){
        this.firstName=firstName;
        this.lastName=lastName;
        this.address=address;
        this.city=city;
        this.state=state;
        this.zip=zip;
        this.phoneNumber=phoneNumber;
    }
    public PersonDetails(){
        super();
    }
    @Override
    public String toString() {
        return "Employee [name=" + this.firstName +" "+ this.lastName + ", " +
                                        "Address=" + this.address + ", City="
                            + this.city + ", state=" + this.state + ", zip=" + this.zip
                                     + ", phone=" + this.phoneNumber + "]";
    }
}