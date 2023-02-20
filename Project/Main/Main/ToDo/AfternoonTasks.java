package Main.ToDo;

import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class AfternoonTasks {

    public static void Switch() {

        Scanner k = new Scanner(System.in);

        System.out.println("To Do List:  (1)Program   (2)Watch youtube   (3)Video game (Other)random ");
        int AfternoonList = k.nextInt();

        switch (AfternoonList) {
            case 1:
                AfternoonTasks.program();
                break;

            case 2:
                AfternoonTasks.watchYoutube();
                break;

            case 3:AfternoonTasks.videoGames();
                break;

            default:
                System.out.println(randomStringFromArr3());
        }
        System.out.println("");
    }

    public static String randomStringFromArr3() {
        String[] arr = { "Improve Programming skills", "Watch some Youtube videos", "Play a video game" };
        int randIdx = ThreadLocalRandom.current().nextInt(arr.length);
        String randomElem = arr[randIdx];
        return randomElem;
    }

    public static void program() {

        ToDo ToDo1 = new ToDo();

        ToDo1.setName("Devolo programming skills");
        ToDo1.setType("To Do list");

        System.out.println(ToDo1.getName());
    }

    public static void watchYoutube() {

        ToDo watchYoutube = new ToDo();

        watchYoutube.setName("Watch some Youtube videos");
        watchYoutube.setType("To Do list");

        System.out.println(watchYoutube.getName());
    }

    public static void videoGames() {

        ToDo ToDo3 = new ToDo();

        ToDo3.setName("Play a video game");
        ToDo3.setType("To Do list");

        System.out.println(ToDo3.getName());
    }

}
