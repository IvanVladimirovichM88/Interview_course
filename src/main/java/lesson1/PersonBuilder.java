package lesson1;

public interface PersonBuilder {
    Person addFirstName(String firstName);
    Person addLastName(String lastName);
    Person addMiddleName(String middleName);
    Person addCountry(String country);
    Person addAddress(String address);
    Person addPhone(String phone);
    Person addAge(int age);
    Person addGender(String gender);
}
