package assignment2.ControlCoupling;

import assignment2.ContentCoupling.Student;

public class Person {
    public String name;
    public int age;


    Person(String name, int age)
    {
        this.name=name;
        this.age=age;
    }

    public static void main(String[] args) {
        Person person = new Person("Shaks",20);
        AdultChecker adultChecker = new AdultChecker();
        adultChecker.check(person.age);

    }
}
