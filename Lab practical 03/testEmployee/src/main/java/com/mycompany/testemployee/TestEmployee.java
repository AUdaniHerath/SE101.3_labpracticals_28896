package com.mycompany.testemployee;
public class TestEmployee {

    public static void main(String[] args)
    {
    Employee employee=new Employee("apeksha",21,20000);
   
    //testing getter method
        System.out.println("employee name " +employee.getname());
        System.out.println("employee age " +employee.getage());
        System.out.println("employee salary " +employee.getsalary());
    
    //testing setter method 
    employee.setname("udani");
    employee.setage(22);
    employee.setsalary(25000);
        
      //testing after seting new values
        System.out.println("\nemployeee name after setting " +employee.getname());
        System.out.println("employee age after setting " +employee.getage());
        System.out.println("employee ssalary after setting " +employee.getsalary());
                
        
    }
}
