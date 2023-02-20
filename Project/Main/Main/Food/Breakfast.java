package Main.Food;

import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class Breakfast {

    public static void Switch() {

        Scanner k = new Scanner(System.in);

        System.out.println("Breakfast:  (1)Omlette   (2)Salad   (3)Pancake (Other)random ");
        int morningEat = k.nextInt();

        switch (morningEat) {
            case 1:
                Breakfast.Omlette();
                break;

            case 2:
                Breakfast.salad();
                break;

            case 3:
                Breakfast.pancakes();
                break;

            default:
                System.out.println(randomStringFromArr());
        }
        System.out.println("");
    }

    public static String randomStringFromArr() {
        String[] arr = { "Omlette", "Salad", "Pancake" };
        int randIdx = ThreadLocalRandom.current().nextInt(arr.length);
        String randomElem = arr[randIdx];
        return randomElem;
    }

    public static void Omlette() {

        Food Breakfast1 = new Food();

        Breakfast1.setName("Omlette");
        Breakfast1.setType("Breakfast");
        Breakfast1.setCalories(154.00);
        Breakfast1.setFoodDescreption(
                "a dish of beaten eggs cooked in a frying pan and served plain or with a savoury or sweet topping or filling");

        System.out.println(Breakfast1.getName());
        System.out.println("Calories: " + Breakfast1.getCalories());
        System.out.println("Descreption: " + Breakfast1.getFoodDescreption());

    }

    public static void salad() {

        Food Breakfast2 = new Food();

        Breakfast2.setName("Salad");
        Breakfast2.setType("Breakfast");
        Breakfast2.setCalories(100.00);
        Breakfast2.setFoodDescreption(
                "It is a simple salad made with basic salad ingredients, one type of vegetable, protein source, and fruits in small quantities totaling about 100g.");

        System.out.println(Breakfast2.getName());
        System.out.println("Calories: " + Breakfast2.getCalories());
        System.out.println("Descreption: " + Breakfast2.getFoodDescreption());

    }

    public static void pancakes() {
    
        Food Breakfast3 = new Food();

        Breakfast3.setName("pancakes");
        Breakfast3.setType("Breakfast");
        Breakfast3.setCalories(227.00);
        Breakfast3.setFoodDescreption(
                " thin, flat cake of batter, fried on both sides in a pan and typically rolled up with a sweet or savoury filling.");

        System.out.println(Breakfast3.getName());
        System.out.println("Calories: " + Breakfast3.getCalories());
        System.out.println("Descreption: " + Breakfast3.getFoodDescreption());

    }

}