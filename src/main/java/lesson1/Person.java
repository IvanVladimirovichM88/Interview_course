package lesson1;

public class Person implements PersonBuilder {
    private String firstName;
    private String lastName;
    private String middleName;
    private String country;
    private String address;
    private String phone;
    private int age;
    private String gender;

    public Person() {
    }

    @Override
    public Person addFirstName(String firstName) {
        this.firstName = firstName;
        return this;
    }

    @Override
    public Person addLastName(String lastName) {
        this.lastName = lastName;
        return this;
    }

    @Override
    public Person addMiddleName(String middleName) {
        this.middleName = middleName;
        return this;
    }

    @Override
    public Person addCountry(String country) {
        this.country = country;
        return this;
    }

    @Override
    public Person addAddress(String address) {
        this.address = address;
        return this;
    }

    @Override
    public Person addPhone(String phone) {
        this.phone = phone;
        return this;
    }

    @Override
    public Person addAge(int age) {
        this.age = age;
        return this;
    }

    @Override
    public Person addGender(String gender) {
        this.gender = gender;
        return this;
    }

    @Override
    public String toString() {
        return "Person{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", middleName='" + middleName + '\'' +
                ", country='" + country + '\'' +
                ", address='" + address + '\'' +
                ", phone='" + phone + '\'' +
                ", age=" + age +
                ", gender='" + gender + '\'' +
                '}';
    }
}
