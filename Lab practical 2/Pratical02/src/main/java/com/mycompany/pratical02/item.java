package com.mycompany.pratical02;
public class item 
{
private int location;
private String description;

//constructor with arguments
public item(int location, String description){
    this.location=location;
    this.description=description;
}
//getter nad setter methods
public int getlocation(){
    return location;
} 
public void setlocation(int location){
    this.location=location; 
}
public String getdescription(){
    return description;
}
public void setdescription(String description){
    this.description=description;
}

}