package logic.components;

public class Potion {
    private  String name;
    private Status increasingStatus;
    private  int price;
    public Potion(String name,int price,Status increasingStatus){
                if(price <1){
                        price = 1;
                    }
                this.increasingStatus = increasingStatus;
                this.name = name;
                this.price = price;
            }
    public boolean equals(Object o){
                Potion other =(Potion) o;
                if(this.name== (other.getName()) & this.price == other.getPrice() & this.increasingStatus.getHp()==other.getIncreasingStatus().getHp() & this.increasingStatus.getDurability()==other.getIncreasingStatus().getDurability() & this.increasingStatus.getAttack()==other.getIncreasingStatus().getAttack() & this.increasingStatus.getMagic()==other.getIncreasingStatus().getMagic()){
                        return true;
                }
                return false;
    }
    public void setPrice(int price){
                if(price<1){
                        price =1;
                    }
                this.price = price;
            }
    public void setName(String name){
                this.name = name;
            }
    public void setIncreasingStatus(Status increasingStatus){
                this.increasingStatus = increasingStatus;
            }
    public int getPrice(){
                return this.price;
            }
    public String getName(){
                return this.name;
            }
    public Status getIncreasingStatus(){
                return this.increasingStatus;
            }



}
