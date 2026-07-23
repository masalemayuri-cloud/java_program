import java.io.*;
class staticMethod{
    public static void greet(){

        System.out.println("Hello, from java");
    }
    public static void main(String[] args)
    {
           // calling the method directily
        greet();

           // using the class name
        staticMethod.greet();
    }
}