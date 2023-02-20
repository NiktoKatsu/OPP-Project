package Main.Food;

import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class Launch {

    public static void Switch() {

        Scanner k = new Scanner(System.in);

        System.out.println("Launch:  (1)Chinese food   (2)Sea Food   (3)Chiken and rice (Other)random ");
        int afternoonEat = k.nextInt();

        switch (afternoonEat) {
            case 1:
                Launch.chineseFood();
                break;

            case 2:
                Launch.seaFood();
                break;

            case 3:
                Launch.chikenRice();
                break;

            default:
                System.out.println(randomStringFromArr());
        }
        System.out.println("");
    }

    public static String randomStringFromArr() {
        String[] arr = { "Chinese food", "Sea food", "Chicken with rice" };
        int randIdx = ThreadLocalRandom.current().nextInt(arr.length);
        String randomElem = arr[randIdx];
        return randomElem;
    }

    public static void chineseFood() {

        Food Launch1 = new Food();

        Launch1.setName("Chinese food");
        Launch1.setType("Launch");
        Launch1.setCalories(485.00);
        Launch1.setFoodDescreption(
                "Spicy food with a little bit of sweetniss ");

        System.out.println(Launch1.getName());
        System.out.println("Calories: " + Launch1.getCalories());
        System.out.println("Descreption: " + Launch1.getFoodDescreption());

    }

    public static void seaFood() {

        Food Launch2 = new Food();

        Launch2.setName("Sea food");
        Launch2.setType("Launch");
        Launch2.setCalories(204.00);
        Launch2.setFoodDescreption(
                "Seafood is any form of sea life regarded as food by humans, prominently including fish and shellfish. Shellfish include various species of molluscs.");

        System.out.println(Launch2.getName());
        System.out.println("Calories: " + Launch2.getCalories());
        System.out.println("Descreption: " + Launch2.getFoodDescreption());

    }

    public static void chikenRice() {

        Food launch3 = new Food();

        launch3.setName("Chiken and rice");
        launch3.setType("Launch");
        launch3.setCalories(448.00);
        launch3.setFoodDescreption(
                " Chicken breast or wings with white rice.");

        System.out.println(launch3.getName());
        System.out.println("Calories: " + launch3.getCalories());
        System.out.println("Descreption: " + launch3.getFoodDescreption());

    }

}
