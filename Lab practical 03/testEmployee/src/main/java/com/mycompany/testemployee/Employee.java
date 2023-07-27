
package com.mycompany.testemployee;

public class Employee 
{
 private String name;
 private int age;
 private int salary;
 
 public Employee(String name, int age, int salary){
     this.name=name;
     this.age=age;
     this.salary=salary;
 }
 //getter method
 public String getname(){
     return name;
 }
 public int getage(){
     return age;
 }
 public int getsalary(){
     return salary;
 }
 //setter method
 public void setname(String name){
     this.name=name;
 }
 public void setage(int age){
     this.age=age;
 }
 public void setsalary(int salary){
     this.salary=salary;
 }
}
