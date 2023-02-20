package Main.Food;

import Main.Tasks;

public class Food extends Tasks{

    public Double calories;
    public String foodDescreption;

    

    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public String getType() {
        return super.getType();
    }

    @Override
    public void setName(String name) {
        super.setName(name);
    }

    @Override
    public void setType(String type) {
        super.setType(type);
    }


    public Double getCalories() {
        return calories;
    }

    public void setCalories(Double calories) {
        this.calories = calories;
    }

    public String getFoodDescreption() {
        return foodDescreption;
    }

    public void setFoodDescreption(String foodDescreption) {
        this.foodDescreption = foodDescreption;
    }

}
