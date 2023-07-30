
package com.mycompany.testemployee;

public class Employee 
{
 private String name;
 private int salary;
 private int bonus;
 
 public Employee(String name, int salary, int bonus){
     this.name=name;
     this.salary=salary;
     this.bonus=bonus;
 }
 //getter method
 public String getname(){
     return name;
 }
 public int getsalary(){
     return salary;
 }
 public int getbonus(){
     return bonus;
 }
 //setter method
 public void setname(String name){
     this.name=name;
 }
 public void setsalary(int salary){
     this.salary=salary;
 }
 public void setbonus(int bonus){
     this.bonus=bonus;
 }
}
