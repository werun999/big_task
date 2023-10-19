package by.itclass.model;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.Arrays;

//@AllArgsConstructor
public enum Genus {
    Cat("Cat"),
    Dog("Dog");

    private String value;

    public String getValue() {
        return value;
    }

    Genus(String value) {
        this.value = value;
    }

    public static Genus of(String value){
        return Arrays.stream(values())
                .filter(it->it.value.equalsIgnoreCase(value))
                .findAny()
                .orElse(null);
    }
}
