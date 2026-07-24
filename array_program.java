public class array_program {
    public static void main(String[] args){
        int[] arr = {10,20,30,40};
        //int n = arr.lenght;

        System.out.println("primitives Array -> ");
        for (int i = 0 ; i < arr.length; i++ )
            System.out.println(arr[i]+" ");
            

        String[] names = {"A","B","C","D","E","F"};

        System.out.println("Non-Pirimitive Array ->");

        for(int i = 0; i < names.length; i++)
             System.out.println(names[i]+" ");
       
    }
}
