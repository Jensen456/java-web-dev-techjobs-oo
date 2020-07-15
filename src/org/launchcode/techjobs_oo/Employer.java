package org.launchcode.techjobs_oo;

import java.util.Objects;

public class Employer extends JobField {
    private String value;

    public Employer() {
        super();
    }

    public Employer(String value) {
        this();
        this.value = value;
    }

    // Custom toString, equals, and hashCode methods:

    @Override
    public String toString() {
        return value;
    }


    // Getters and Setters:

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}
