import java.util.Scanner;
class inputExample{

    public static void main (String args[])
    {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter youe X value :");
        int a = sc.nextInt();

        System.out.println("Enter your y value :");
        int b = sc.nextInt();

        System.out.println(" Sum of two number is : " + (a + b));
        sc.close();
    }
}
 //addition of two number taken by user 