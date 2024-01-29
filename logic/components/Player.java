package logic.components;
import exception.BadStatusException;

import java.util.ArrayList;
public class Player {
    private String name;
    private Status status;
    private int energy;
    private int money;
    private ArrayList<Food> foods;
    private ArrayList<Potion> potions;
    private ArrayList<Ore> ores;
    public Player(String name,Status status) throws BadStatusException {
        if(status.getHp()<1){
            status.setHp(1);
        }
        this.name = name;
        this.status = status;
        this.energy =10;
        this.money =100;
        this.foods = new ArrayList<Food>();
        this.ores = new ArrayList<Ore>();
        this.potions = new ArrayList<Potion>();
    }
    public Player(String name,Status status,int energy,int money) throws BadStatusException {
        this.name = name;
        if(status.getHp()<1){
            status.setHp(1);
        }
        if(energy<0){
            energy = 0;
        }
        if(money<0){
            money =0;
        }
        this.status = status;
        this.energy =energy;
        this.money =money;
        this.foods = new ArrayList<Food>();
        this.ores = new ArrayList<Ore>();
        this.potions = new ArrayList<Potion>();
    }
    public boolean buyOre(Ore ore){
        if(ore.getCost() < this.money){
            money -= ore.getCost();
            this.ores.add(ore);
            return true;
        }
        return false;
    }
    public void drinkPotion(int index){
        if(this.potions.size()>index & index >=0) {
            this.status.addStatus((this.potions).get(index).getIncreasingStatus());
            this.potions.remove(index);
        }
    }
    public void eatFood(int index){
        if(this.foods.size()>index & index >=0){
            this.energy += this.foods.get(index).getEnergy();
            this.foods.remove(index);
        }
    }
    public void sellPotion(int index){
        if(this.potions.size()>index & index>=0){
            this.money += this.potions.get(index).getPrice();
            this.potions.remove(index);
        }
    }
    public void sellFood(int index){
        if(this.foods.size()>index & index>=0){
            this.money += this.foods.get(index).getPrice();
            this.foods.remove(index);
        }
    }
    public void attack(Monster monster) throws BadStatusException {
        if(this.status.getAttack() > monster.getStatus().getDurability()){
            if(this.status.getAttack()-monster.getStatus().getDurability()>monster.getStatus().getHp()){
                monster.setStatus(new Status(0,monster.getStatus().getDurability(),monster.getStatus().getAttack(), monster.getStatus().getMagic()));
            }
            else{
                monster.setStatus(new Status(monster.getStatus().getHp()-this.status.getAttack()+monster.getStatus().getDurability(),monster.getStatus().getDurability(),monster.getStatus().getAttack(), monster.getStatus().getMagic()));
            }
        }
    }
    public  void magicAttack(Monster monster) throws BadStatusException {
        if(this.status.getMagic()>monster.getStatus().getHp()){
            monster.setStatus(new Status(0,monster.getStatus().getDurability(),monster.getStatus().getAttack(), monster.getStatus().getMagic()));
        }
        else{
            monster.setStatus(new Status(monster.getStatus().getHp()-this.status.getMagic(),monster.getStatus().getDurability(),monster.getStatus().getAttack(), monster.getStatus().getMagic()));

        }
    }


    public void setName(String name){
        this.name =name;
    }
    public String getName(){
        return this.name;
    }
    public void setStatus(Status status){
        this.status = status;
    }
    public Status getStatus(){
        return this.status;
    }
    public void setEnergy(int energy){
        if(energy<0){
            energy=0;
        }
        this.energy = energy;
    }
    public int getEnergy(){
        return this.energy;
    }
    public void setMoney(int money){
        if(money<0){
            money =0;
        }
        this.money =money;
    }
    public int getMoney(){
        return this.money;
    }
    public void setFoods(ArrayList<Food> foods){
        this.foods = foods;
    }
    public ArrayList<Food> getFoods(){
        return this.foods;
    }
    public void setPotions(ArrayList<Potion> potions){
        this.potions = potions;
    }
    public ArrayList<Potion> getPotions(){
        return this.potions;
    }
    public ArrayList<Ore> getOres() {
        return this.ores;
    }
    public void setOres(ArrayList<Ore> ores) {
        this.ores = ores;
    }
}
