package by.itclass.model;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.time.LocalDate;
import java.util.StringJoiner;

@AllArgsConstructor
public abstract class Animal implements Comparable<Animal>{
    private final long chipNUmber;
    private final Genus genus;
    private final String name;
    @Getter
    private final LocalDate birthDate;
    private final String breed;
    private final String email;

    @Override
    public String toString() {
        return new StringJoiner(", ", genus.getValue() + "[", "]")
                .add("chipNUmber=" + chipNUmber)
                .add("name='" + name + "'")
                .add("birthDate=" + birthDate)
                .add("breed='" + breed + "'")
                .add("email='" + email + "'")
                .toString();
    }

    @Override
    public int compareTo(Animal o) {
        return birthDate.compareTo(o.birthDate);
    }
}
