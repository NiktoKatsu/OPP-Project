package Main.ToDo;

import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class MorningTasks {

    public static void Switch() {

        Scanner k = new Scanner(System.in);

        System.out.println("To Do List:  (1)Do homework   (2)Watch youtube   (3)Clean Room (Other)random ");
        int morningEat = k.nextInt();

        switch (morningEat) {
            case 1:
                MorningTasks.doSomeWork();
                break;

            case 2:
                MorningTasks.watchYoutube();
                break;

            case 3:
                MorningTasks.cleanRoom();
                break;

            default:
                System.out.println(randomStringFromArr3());
        }
        System.out.println("");
    }

    public static String randomStringFromArr3() {
        String[] arr = { "Finish some Homeworks", "Watch some Youtube videos", "Clean the Room" };
        int randIdx = ThreadLocalRandom.current().nextInt(arr.length);
        String randomElem = arr[randIdx];
        return randomElem;
    }

    public static void doSomeWork() {

        ToDo doSomeWork = new ToDo();

        doSomeWork.setName("Finish some Homeworks");
        doSomeWork.setType("To Do list");

        System.out.println(doSomeWork.getName());
    }

    public static void watchYoutube() {

        ToDo watchYoutube = new ToDo();

        watchYoutube.setName("Watch some Youtube videos");
        watchYoutube.setType("To Do list");

        System.out.println(watchYoutube.getName());
    }

    public static void cleanRoom() {

        ToDo cleanRoom = new ToDo();

        cleanRoom.setName("Clean the Room");
        cleanRoom.setType("To Do list");

        System.out.println(cleanRoom.getName());
    }

}
