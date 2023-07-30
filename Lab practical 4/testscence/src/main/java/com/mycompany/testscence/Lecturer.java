
package com.mycompany.testscence;

public class Lecturer extends Person {
    private String programme;
    public Lecturer(String Name, int Id, String programme){
        super(Name,Id);
        this.programme=programme;
    }
    //getter setter methods
    public String getprogramme(){
        return programme;
    }
    public void setprogramme(String programme){
        this.programme=programme;
    }
}
