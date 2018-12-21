package com.something.enheritance;

public class Employee extends Person {
    public void testingProtectedMethod() {
        doSomething();  // LEGAL
    }
    
    public static void main(String[] args) {
        Employee e = new Employee();
        e.doSomething(); // LEGAL
        Person p = new Person();
        p.doSomething(); // ILLEGAL
        Musician m = new Musician();
        m.doSomething(); // ILLEGAL
  }
}