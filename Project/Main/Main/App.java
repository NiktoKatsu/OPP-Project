package Main;

import Main.Food.Breakfast;
import Main.Food.Dinner;
import Main.Food.Launch;
import Main.ToDo.AfternoonTasks;
import Main.ToDo.MorningTasks;
import Main.ToDo.NightTasks;
import Main.Workout.AfternoonWorkout;
import Main.Workout.MorningWorkout;
import Main.Workout.NightWorkout;

public class App {

    public static void main(String[] args) {

        System.out.println("------Simple Daily Routine App------\n");

        // Morning Tasks.
        System.out.println("First, what do you want to do in the morning?");
        Breakfast.Switch();
        MorningWorkout.Switch();
        MorningTasks.Switch();
        System.out.println("---------------");

        // Afternoon Tasks.
        System.out.println("Second, what do you want to do in Afternoon?");
        Launch.Switch();
        AfternoonWorkout.Switch();
        AfternoonTasks.Switch();

        System.out.println("---------------");

        // Night Tasks.
        System.out.println("Last, what do you want to do at night?");
        Dinner.Switch();
        NightWorkout.Switch();
        NightTasks.Switch();

        System.out.println("---------------");

    }

}
