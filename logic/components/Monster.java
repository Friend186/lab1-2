package logic.components;

import exception.BadStatusException;

public class Monster {
    private String name;
    private Status status;
    private Food food;
    private Potion potion;
    public Monster(String name,Status status) throws BadStatusException {
        if(status.getHp()<1){
            status.setHp(1);
        }
        this.food = null;
        this.potion =null;
        this.name =name;
        this.status =status;
    }
    public void attack(Player player) throws BadStatusException {
        if(this.getStatus().getAttack()>player.getStatus().getDurability()){
            if(this.getStatus().getAttack()-player.getStatus().getDurability() > player.getStatus().getHp()){
                player.setStatus(new Status(0,player.getStatus().getDurability(),player.getStatus().getAttack(),player.getStatus().getMagic()));
            }
            else{
                player.setStatus(new Status(player.getStatus().getHp()-this.getStatus().getAttack()+player.getStatus().getDurability(),player.getStatus().getDurability(),player.getStatus().getAttack(),player.getStatus().getMagic()));
            }
        }
    }
    public void magicAttack(Player player) throws BadStatusException {
        if(this.status.getMagic()>player.getStatus().getHp()){
            player.setStatus(new Status(0,player.getStatus().getDurability(),player.getStatus().getAttack(),player.getStatus().getMagic()));
        }
        else{
            player.setStatus(new Status(player.getStatus().getHp()-this.status.getMagic(),player.getStatus().getDurability(),player.getStatus().getAttack(),player.getStatus().getMagic()));
        }
    }
    public void setFood(Food food) {
        this.food = food;
    }

    public Food getFood() {
        return this.food;
    }

    public Potion getPotion() {
        return this.potion;
    }

    public void setPotion(Potion potion) {
        this.potion = potion;
    }

    public Status getStatus() {
        return this.status;
    }

    public void setStatus(Status status) throws BadStatusException {
        if(status.getHp()<0){
            status.setHp(0);
        }
        this.status = status;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
