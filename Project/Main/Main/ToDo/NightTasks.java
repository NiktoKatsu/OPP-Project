package Main.ToDo;

import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class NightTasks {

    public static void Switch() {

        Scanner k = new Scanner(System.in);

        System.out.println("To Do List:  (1)Reading   (2)Watch youtube   (3)Hangout (Other)random ");
        int nightList = k.nextInt();

        switch (nightList) {
            case 1:
                NightTasks.readBook();
                break;

            case 2:
                NightTasks.watchYoutube();
                break;

            case 3:
            NightTasks.hangout();
                break;

            default:
                System.out.println(randomStringFromArr3());
        }
        System.out.println("");
    }

    public static String randomStringFromArr3() {
        String[] arr = { "Read a Book", "Watch some Youtube videos", "Hangout with friends" };
        int randIdx = ThreadLocalRandom.current().nextInt(arr.length);
        String randomElem = arr[randIdx];
        return randomElem;
    }

    public static void readBook() {

        ToDo ToDo1 = new ToDo();

        ToDo1.setName("Read a book");
        ToDo1.setType("To Do list");

        System.out.println(ToDo1.getName());
    }

    public static void watchYoutube() {

        ToDo watchYoutube = new ToDo();

        watchYoutube.setName("Watch some Youtube videos");
        watchYoutube.setType("To Do list");

        System.out.println(watchYoutube.getName());
    }

    public static void hangout() {

        ToDo ToDo3 = new ToDo();

        ToDo3.setName("Hangout with friends");
        ToDo3.setType("To Do list");

        System.out.println(ToDo3.getName());
    }

}
