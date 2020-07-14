package org.launchcode.techjobs_oo;

public class JobField {
    public int id;
    public static int nextId = 1;

    public JobField() {
        this.id = nextId;
        nextId++;
    }
}
