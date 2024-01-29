package logic.components;

public class Food {

    private String name ;
    private int price;
    private int energy;
    public Food(String name,int price,int energy){
                if(energy<1){
                        energy =1;
                    }
                if(price<1){
                        price =1;
                    }
                this.price = price;
                this.energy=  energy;
                this.name = name;
            }
    public boolean equals(Object o) {
                Food n  = (Food) o;
                if(n.name == this.name & n.price == this.price & n.energy == this.energy) {
                        return true;
                    }
                return false;
            }
    public void setName(String name){
                this.name = name;
            }
    public void setPrice(int price){
                if(price<1){
                        price =1;
                    }
                this.price=price;
            }
    public void setEnergy(int energy){
                if(energy<1){
                        energy =1;
                    }
                this.energy=energy;
            }
    public int getEnergy(){
                return this.energy;
            }
    public int getPrice(){
                return this.price;
            }
    public String getName(){
                return this.name;
            }
}
