package main;

public class Person {
    protected String name;
    protected int age;
    public Person(String name, int age){
        this.name = name;
        this.age = age;
    }

    public void display(){
        System.out.println(name + " " + age);
    }
}
