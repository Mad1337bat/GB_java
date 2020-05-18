package com.Mad1337bat;

public abstract class Barrier {
    private String name;

    public Barrier(String name) {
        this.name = name;
    }

    protected abstract boolean moving(Actions actions);

    public String getName() {
        return name;
    }
}
