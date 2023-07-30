
package com.mycompany.testscence;
public class Person {
    private String Name;
    private int Id;
    
    public Person(String Name, int Id)
    {
        this.Name=Name;
        this.Id=Id;
    }
    //getter method
    public String getName(){
        return Name;
    }
    public int getId(){
        return Id;
    }  
    //setter method
    public void setName(String Name){
        this.Name=Name;
    }
     public void setId(int Id){
        this.Id=Id;
    }
    
}
