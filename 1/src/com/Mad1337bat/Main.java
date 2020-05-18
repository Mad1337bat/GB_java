package com.Mad1337bat;

import java.util.Random;

public class Main {

    public static void main(String[] args) {

        Random rng = new Random();
        Actions[] actions = new Actions[3];

        int distance = rng.nextInt(10);
        int heigth = rng.nextInt(10);
        actions[0] = new Human("Lenivyj", distance, heigth);

        distance = rng.nextInt(10);
        heigth = rng.nextInt(10);
        actions[1] = new Robot("0000000001", distance, heigth);

        distance = rng.nextInt(10);
        heigth = rng.nextInt(10);
        actions[2] = new Cat("Kitty", distance, heigth);

        Barrier[] barriers = new Barrier[6];

        boolean isRoad;
        for (int i = 0; i < barriers.length; i++) {
            distance = rng.nextInt(10);
            isRoad = rng.nextBoolean();
            if (isRoad) {
                barriers[i] = new RaceTrack("Road " + i, distance) {
                };
            } else {
                barriers[i] = new Wall("Wall " + i, distance) {};
            }
        }

        for (int i = 0; i < actions.length; i++) {
            boolean result = true;
            for (int j = 0; j < barriers.length; j++) {

             /*
             !!!!!!!!!!!!!!!!!!!!!!!!!!!!! ПЕРЕДЕЛАТЬ !!!!!!!!!!!!!!
              */

                result = barriers[j].moving(actions[i]);

                if (!result) {
                    break;
                }
            }

            if (result) {
                System.out.println("SUCCESS");
            } else {
                System.out.println("FAIL");
            }
        }
    }

    }

