import java.util.*;
interface exampleOfInterface{

     void addition(int x , int y);
     void substraction(int p , int q);
}

class sumestion implements exampleOfInterface { 

        @Override
        public  void addition(int x , int y)
        {
        
            int add = x + y;
            System.out.println("addition"+add);
        }

         @Override
        public void substraction(int p, int q)
        {
            int sub = p + q;
           System.out.println("substraction" + sub); 
         }  
 }

 class cal {
        public static void main(String[] args ){

            sumestion s = new sumestion();
            s.addition(10,20); 
            s.substraction(10,20);  
        }
    }
    
