//Default Constructor 
class Student{
    String name;
    Student(String name){
        this.name = name;

    }
    
    void display(){
        System.out.println("Name : "+name);

    }

    public static void main(String[] args){
        Student s1 = new  Student("Mayuri");
        s1.display();
    }
}