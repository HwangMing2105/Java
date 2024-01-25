package main;
public class Student {
    private String id;
    private String address;
    private int age;
    private String name;
    public Student(){
        
    }
    public Student(String id, String name){
        this.id = id;
        this.name = name;
        // this.address = address;
        // this.age = age;
    }
    // public void SetAddress(String address){
    //     this.address = address;
    // }
    // public void SetAge(int age){
    //     this.age = age;
    // }
    public String GetId(){
        return this.id;
    }
    public String GetName(){
        return this.name;
    }
    public String GetAddress(){
        return this.address;
    }
    public int GetAge(){
        return this.age;
    }
    public void display(){
        System.out.printf("ID: %s - Name: %s", this.id, this.name);
    }
    
    public static void main(String[] args){
        // Student s1 = new Student("11222513", "Trinh Minh Hoang","213 Tran Dai Nghia Street", 20);
        // System.out.println(s1.GetId() + " " + s1.GetName() + " " + s1.GetAge() + " " + s1.GetAddress());
        Student[] students = new Student[3]; //khai báo mảng và chưa hề được khởi tạo
        students[0] = new Student("11222513", "Trinh Minh Hoang");
        students[1] = new Student("11222522", "Trinh Minh Hoang1");
        students[2] = new Student("11222600", "Trinh Minh Hoang2");
        for(int i = 0; i < students.length; i++){
            students[i].display();
        }

    }
}
