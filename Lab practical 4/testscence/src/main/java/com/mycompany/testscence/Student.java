package com.mycompany.testscence;
public class Student extends Person{
    
    private String course;
    public Student(String name, int Id, String course){
          super(name,Id);
          this.course=course;
    }
    
    //getter and setter method
    public String getCourse(){
        return course;
    }
    public void setCourse(String Course){
        this.course=Course;
    }
}
