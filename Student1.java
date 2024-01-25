package main;

public class Student1 extends Person {
    private int score;
    public Student1(String name, int age, int score){
        super(name, age);
        this.score = score;
    }
    public void display(){
        super.display();
        System.out.print(score);
    }
}
