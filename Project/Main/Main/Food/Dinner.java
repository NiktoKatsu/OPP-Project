package Main.Food;

import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class Dinner {

    public static void Switch() {

        Scanner k = new Scanner(System.in);

        System.out.println("DInner:  (1)Burger   (2)Steak   (3)Pizza (Other)random ");
        int afternoonEat = k.nextInt();

        switch (afternoonEat) {
            case 1:
                Dinner.Burger();
                break;

            case 2:
            Dinner.Steak();
            break;

            case 3:
            Dinner.Pizza();
                break;

            default:
                System.out.println(randomStringFromArr());
        }
        System.out.println("");
    }

    public static String randomStringFromArr() {
        String[] arr = { "Burger", "Steak", "Pizza" };
        int randIdx = ThreadLocalRandom.current().nextInt(arr.length);
        String randomElem = arr[randIdx];
        return randomElem;
    }

    public static void Burger() {

        Food Dinner1 = new Food();

        Dinner1.setName("Burger");
        Dinner1.setType("Dinner");
        Dinner1.setCalories(295.00);
        Dinner1.setFoodDescreption(
                "A hamburger, or simply burger, is a food consisting of fillings—usually a patty of ground meat, typically beef—placed inside a sliced bun or bread roll.");

        System.out.println(Dinner1.getName());
        System.out.println("Calories: " + Dinner1.getCalories());
        System.out.println("Descreption: " + Dinner1.getFoodDescreption());

    }

    public static void Steak() {

        Food Dinner2 = new Food();

        Dinner2.setName("Stek");
        Dinner2.setType("Dinner");
        Dinner2.setCalories(271.00);
        Dinner2.setFoodDescreption(
                "A steak is a thick cut of meat generally sliced across the muscle fibers, sometimes including a bone. It is normally grilled or fried. Steak can be diced, cooked in sauce, such as in steak and kidney pie, or minced and formed into patties, such as hamburgers.");

        System.out.println(Dinner2.getName());
        System.out.println("Calories: " + Dinner2.getCalories());
        System.out.println("Descreption: " + Dinner2.getFoodDescreption());

    }

    public static void Pizza() {

        Food Dinner3 = new Food();

        Dinner3.setName("Pizza");
        Dinner3.setType("Dinner");
        Dinner3.setCalories(266.00);
        Dinner3.setFoodDescreption(
                " Pizza is a dish of Italian origin consisting of a usually round, flat base of leavened wheat-based dough topped with tomatoes, cheese, and often various other ingredients, which is then baked at a high temperature, traditionally in a wood-fired oven. A small pizza is sometimes called a pizzetta.");

        System.out.println(Dinner3.getName());
        System.out.println("Calories: " + Dinner3.getCalories());
        System.out.println("Descreption: " + Dinner3.getFoodDescreption());

    }

}
