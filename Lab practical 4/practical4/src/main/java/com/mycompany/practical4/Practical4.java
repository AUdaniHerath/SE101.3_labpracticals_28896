
package com.mycompany.practical4;

public class Practical4 {

    public static void main(String[] args) {
        //obj for MR.Bogdan
        employee bogdan=new employee();
        bogdan.setempId(23333);
        bogdan.setempName("Mr.Bogdan");
        bogdan.setempDesignation("software engineer");
        
        //obj for MR.Bird
        
        employee bird=new employee();
        bogdan.setempId(24444);
        bogdan.setempName("Mr.Bird");
        bogdan.setempDesignation("Developer");
        
        //display details
        System.out.println("Employee Id "+bogdan.getempId());
        System.out.println("Employee name "+bogdan.getempName());
        System.out.println("Employee designation "+bogdan.getempDesignation());
        
        
        System.out.println("Employee Id "+bird.getempId());
        System.out.println("Employee name "+bird.getempName());
        System.out.println("Employee designation "+bird.getempDesignation());
        
        
        }
        
    
    
    
    
}
