import java.io.*;

class gotoStmt {
    public static void main(String[] args)
    {
        // goto stmt
        for (int i = 0; i < 3; i++) {
        one : { // label one
        two : { // label two
        three : { // label three
            System.out.println("i=" + i);
            if (i == 0)
                break one; // break to label one
            if (i == 1)
                break two; // break to label two
            if (i == 2)
                break three; // break to label three
        }
            System.out.println("after label three");
        }
            System.out.println("after label two");
        }
            System.out.println("after label one");
        }
    }
}