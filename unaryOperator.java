import java.io.*;

class unaryOperator {
    public static void main (String[] args)
    {
        int a = 10;
        int b = 25;

        System.out.println("Postincrement : " +(a++));
        System.out.println("Preincrement : " +(++a));

        System.out.println("Postdecrement : " +(b--));
        System.out.println("predecrement : " +(--b));
 
    }
}