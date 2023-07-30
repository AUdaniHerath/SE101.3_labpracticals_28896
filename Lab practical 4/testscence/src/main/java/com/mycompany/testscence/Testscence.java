
package com.mycompany.testscence;

public class Testscence {

    public static void main(String[] args) {
        //student obj
      Student st=new Student("Amal",23456,"computer network");
        System.out.println("Student name "+st.getName());
        System.out.println("Student id "+st.getId());
        System.out.println("Student course "+st.getCourse());
        
      Lecturer lec=new Lecturer("Mr.Perera",23,"data anlysist");  
        System.out.println("\nLecturer name "+lec.getName());
        System.out.println("Lecturer id "+lec.getId());
        System.out.println("Lecturer course "+lec.getprogramme()); 
    }
}
