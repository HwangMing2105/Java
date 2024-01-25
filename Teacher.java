package main;

public class Teacher extends Person {
    private double salary;
    public Teacher(String name, int age, double salary){
        super(name, age);
        this.salary = salary;
    }
    public void display(){
        super.display();
        System.out.print(salary);
    }
}
