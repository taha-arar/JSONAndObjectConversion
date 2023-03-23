package main.model;

public class Personne {

    private Long id;
    private String name;
    private String lastName;
    private int age;
    private String address;
    private Gender gender;
    private String phone;

    public Personne() {
    }

    public Personne(Long id, String name, String lastName, int age, String address, Gender gender, String phone) {
        this.id = id;
        this.name = name;
        this.lastName = lastName;
        this.age = age;
        this.address = address;
        this.gender = gender;
        this.phone = phone;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    @Override
    public String toString() {
        return "Personne{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                ", address='" + address + '\'' +
                ", gender=" + gender +
                ", phone='" + phone + '\'' +
                '}';
    }
}
