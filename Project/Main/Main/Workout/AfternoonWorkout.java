package Main.Workout;

import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class AfternoonWorkout {

    public static void Switch() {

        Scanner k = new Scanner(System.in);

        System.out.println("Afternoong workout:  (1)Swimming   (2)Squats   (3)Nap  (Other)random ");
        int afternoonWorkout = k.nextInt();

        switch (afternoonWorkout) {
            case 1:
                AfternoonWorkout.Swimming();
                break;

            case 2:
            AfternoonWorkout.Squats();
                break;

            case 3:
            AfternoonWorkout.Nap();
                break;

            default:
                System.out.println(randomStringFromArr2());
        }
        System.out.println("");
    }

    public static String randomStringFromArr2() {
        String[] arr = { "30 minutes Swimming.", "45 Squats", "Nappig for 10 minutes" };
        int randIdx = ThreadLocalRandom.current().nextInt(arr.length);
        String randomElem = arr[randIdx];
        return randomElem;
    }

    public static void Swimming() {

        Workout workout1 = new Workout();

        workout1.setName("Swimming");
        workout1.setDuartion(30.0);
        workout1.setType("Afternoon workout");

        System.out.println(workout1.getName());
        System.out.println("Minutes: " + workout1.getDuartion());

    }

    public static void Squats() {

        Workout workout2 = new Workout();

        workout2.setName("Squats");
        workout2.setReps(45);

        System.out.println(workout2.getName());
        System.out.println("Reps: " + workout2.getReps());

    }

    public static void Nap() {

        Workout workout3 = new Workout();

        workout3.setName("Take a nap");
        workout3.setDuartion(10.00);

        System.out.println(workout3.getName());
        System.out.println("Minutes: " + workout3.getDuartion());

    }

}
