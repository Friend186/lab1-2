package logic.components;

public class Ore {
    private String name;
    private int cost;
    public Ore(String name,int cost){
        if(cost<1){
            cost=1;
        }
        this.name = name;
        this.cost =cost;
    }
    public boolean equals(Object o) {
        Ore n = (Ore) o;
        if (n.name == this.name & n.cost == this.cost) {
            return true;
        }
        return false;
    }
    public String getName(){
        return this.name;
    }
    public void setName(String name){
        this.name = name;
    }
    public int getCost(){
        return this.cost;
    }
    public void setCost(int cost){
        if(cost<1){
            cost =1;
        }
        this.cost = cost;
    }

}
