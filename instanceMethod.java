import java.io.*;
 class Test{
    String n = "";
    //instance method 
    public void test(String n){
        this.n = n;

    }
}
public class instanceMethod{
    public static void main (String[] args)
    {
        //create instance of the class
        Test t = new Test();

        t.test("Hello form java");
        System.out.println(t.n);
    }
}
