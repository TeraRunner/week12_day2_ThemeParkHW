package Atractions;

import Interfaces.IReviwed;

public abstract class Atraction implements IReviwed {

    private String name;
    private int rating;

    public Atraction(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getRating() {
        return rating;
    }
}