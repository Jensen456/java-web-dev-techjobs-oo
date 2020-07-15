package org.launchcode.techjobs_oo;

import java.util.Objects;

public class CoreCompetency extends JobField {

    private String value;

    public CoreCompetency() {
        super();
    }

    public CoreCompetency(String value) {
        this();
        this.value = value;
    }

    // Custom toString, equals, and hashCode methods:

    @Override
    public String toString() {
        return value;
    }

    // TODO: Use the "Generate" tool to add a getter and setter for the 'value' field but
    //  ONLY a getter for the 'id' field.

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}
