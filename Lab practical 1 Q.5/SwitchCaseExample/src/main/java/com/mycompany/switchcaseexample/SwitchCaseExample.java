package com.mycompany.switchcaseexample;
public class SwitchCaseExample {

    public static void main(String[] args)
    {
     char grade='A';
      switch(grade)
              {       
             case 'A':
             System.out.println("excellent");
             break;
             case 'D':
             System.out.println("you passed");
             break;
             case'F':
             System.out.println("better try next time");
             break;
             default:
             System.out.println("invalid grade");
    }
        System.out.println("your grade is " + grade);      
             
    }
}
