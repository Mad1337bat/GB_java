package com.Mad1337bat;

public abstract class RaceTrack extends Barrier {
    private int length;

    public RaceTrack(String name, int length) {
        super(name);

        this.length = length;
    }

    public int getLength() {
        return length;
    }

    @Override
    protected boolean moving(Actions actions) {
        System.out.println("The racetrack " + super.getName() + " length: " + this.length);

        actions.run();

        if (getLength() <= actions.getRunDistance()) {
            System.out.println("run success");

            return true;
        } else {
            System.out.println("run unsuccessfully");

            return false;
        }
    }
}
