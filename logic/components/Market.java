package logic.components;

import java.util.ArrayList;
public class Market {
    private String name;
    private ArrayList<Food> foods;
    private ArrayList<Potion> potions;

    public Market(String name) {
        this.name = name;
        this.potions = new ArrayList<Potion>();
        this.foods = new ArrayList<Food>();
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Food> getFoods() {
        return this.foods;
    }

    public void setFoods(ArrayList<Food> foods) {
        this.foods = foods;
    }

    public ArrayList<Potion> getPotions() {
        return this.potions;
    }
    public void setPotions(ArrayList<Potion> potions) {
        this.potions = potions;
    }

}