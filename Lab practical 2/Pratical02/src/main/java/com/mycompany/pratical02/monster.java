package com.mycompany.pratical02;
public class monster extends item{
    private int health;
  
    public monster(int location, String description, int health){
        super(location,description);
        this.health=health;
    }
  //getter setter methods for monster's health 
    public int gethealth(){
        return health;
    }
    public void sethealth(int health){
        this.health=health;
    }
    public display values(){
            System.out.println("location" +location);
            System.out.println("description" +description);
            System.out.println("health" +health);
    }
    

}
