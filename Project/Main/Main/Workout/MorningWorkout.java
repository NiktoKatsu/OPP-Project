package Main.Workout;

import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class MorningWorkout {

    public static void Switch() {

        Scanner k = new Scanner(System.in);

        System.out.println("Morning Excersice:  (1)Jog   (2)Push Ups   (3)Liftig  (Other)random ");
        int morningExcersice = k.nextInt();

        switch (morningExcersice) {
            case 1:
                MorningWorkout.jog();
                break;

            case 2:
                MorningWorkout.pushUps();
                break;

            case 3:
                MorningWorkout.lifting();
                break;

            default:
                System.out.println(randomStringFromArr2());
        }
        System.out.println("");
    }

    public static String randomStringFromArr2() {
        String[] arr = { "Jogging for 20 minutes.", "50 push ups", "Lifting 30 reps for 15 minutes" };
        int randIdx = ThreadLocalRandom.current().nextInt(arr.length);
        String randomElem = arr[randIdx];
        return randomElem;
    }

    public static void jog() {

        Workout jog = new Workout();

        jog.setName("Jogging");
        jog.setDuartion(20.0);
        jog.setType("morninig Excersice");

        System.out.println(jog.getName());
        System.out.println("Minutes: " + jog.getDuartion());

    }

    public static void pushUps() {

        Workout pushUps = new Workout();

        pushUps.setName("Push ups");
        pushUps.setReps(50);

        System.out.println("Excersice: " + pushUps.getName());
        System.out.println("Reps: " + pushUps.getReps());

    }

    public static void lifting() {

        Workout lifting = new Workout();

        lifting.setName("Lifting");
        lifting.setReps(30);
        lifting.setDuartion(15.00);

        System.out.println("Excersice: " + lifting.getName());
        System.out.println("Reps: " + lifting.getReps());
        System.out.println("Minutes: " + lifting.getDuartion());

    }

}
