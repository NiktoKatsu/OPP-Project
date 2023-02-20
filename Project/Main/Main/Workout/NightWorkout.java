package Main.Workout;

import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class NightWorkout {

    public static void Switch() {

        Scanner k = new Scanner(System.in);

        System.out.println("Night workout:  (1)Boxing   (2)Super workout   (3)Deadlifit  (Other)random ");
        int nightWorkout = k.nextInt();

        switch (nightWorkout) {
            case 1:
                NightWorkout.Boxing();
                break;

            case 2:
            NightWorkout.Super();
                break;

            case 3:
            NightWorkout.DeadLifting();
                break;

            default:
                System.out.println(randomStringFromArr2());
        }
        System.out.println("");

    }

    public static String randomStringFromArr2() {
        String[] arr = { "60 minutes Boxing.", "100 reps Workout", "10 reps Deadlifting" };
        int randIdx = ThreadLocalRandom.current().nextInt(arr.length);
        String randomElem = arr[randIdx];
        return randomElem;
    }

    public static void Boxing() {

        Workout workout1 = new Workout();

        workout1.setName("Boxing");
        workout1.setDuartion(60.0);
        workout1.setType("Night workout");

        System.out.println(workout1.getName());
        System.out.println("Minutes: " + workout1.getDuartion());

    }

    public static void Super() {

        Workout workout2 = new Workout();

        workout2.setName("Super Workout");
        workout2.setReps(100);
        workout2.setType("Night workout");

        System.out.println(workout2.getName());
        System.out.println("Reps: " + workout2.getReps());

    }

    public static void DeadLifting() {

        Workout workout3 = new Workout();

        workout3.setName("Deadlifting");
        workout3.setReps(10);
        workout3.setType("Night workout");

        System.out.println(workout3.getName());
        System.out.println("Reps: " + workout3.getReps());

    }

}
