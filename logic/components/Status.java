package logic.components;
import exception.BadStatusException;
public class Status {
    private int hp;
    private int  durability;
    private int  attack;
    private int  magic ;
    public Status(int hp, int durability, int attack, int magic) throws BadStatusException {
                if(hp>=0 & durability>=0 & attack>=0 & magic>=0){
                        this.hp = hp;
                        this.durability = durability;
                        this.magic = magic;
                        this.attack = attack;
                    }
                else{
                        throw new BadStatusException();
                    }
            }
    public boolean equals(Object o){
                Status other =(Status) o;
                if(this.hp == other.hp & this.attack == other.attack & this.magic == other.magic & this.durability == other.durability){
                        return true;
                    }
                return false;
            }
    public void addStatus(Status o){
                this.hp += o.hp;
                this.durability += o.durability;
                this.attack += o.attack;
                this.magic += o.magic;
            }
    public void setHp(int hp) throws BadStatusException {
                if(hp>=0){
                        this.hp = hp;
                    }
                else{
                        throw new BadStatusException();
                    }
            }
    public void setDurability(int durability) throws BadStatusException {
                if(durability>=0){
                        this.durability = durability;
                    }
                else{
                        throw new BadStatusException();
                    }
            }
    public void setAttack(int attack) throws BadStatusException {
                if(attack>=0){
                        this.attack = attack;
                    }
                else{
                        throw new BadStatusException();
                    }
            }
    public void setMagic(int magic) throws BadStatusException {
                if(magic>=0){
                        this.magic = magic;
                    }
                else{
                        throw new BadStatusException();
                    }
            }
    public int getHp(){
                return this.hp;
            }
    public int getDurability(){
                return this.durability;
            }
    public int getAttack(){
                return this.attack;
            }
    public int getMagic(){
                return this.magic;
            }
    public int getDurable(){
                return this.durability;
            }

}
