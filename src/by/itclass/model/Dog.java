package by.itclass.model;

import java.time.LocalDate;

public class Dog extends Animal{
    public Dog(long chipNUmber, Genus genus, String name, LocalDate birthDate, String breed, String email) {
        super(chipNUmber, genus, name, birthDate, breed, email);
    }

}
