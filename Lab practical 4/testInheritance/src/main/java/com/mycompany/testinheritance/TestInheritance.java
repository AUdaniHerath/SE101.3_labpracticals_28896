
package com.mycompany.testinheritance;
public class TestInheritance {

    public static void main(String[] args) {
        superB b=new superB();
        b.setIt(2);
        b.increase();
        b.triple();
        System.out.println(b.returnIt());
        subC c=new subC();
        b.setIt(2);
        b.increase();
        b.triple();
        System.out.println(c.returnIt());
    }
}
