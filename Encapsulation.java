//Encapsulation program

class programmer{
    private String name;

    public String getName(){return name;}

    public void setName(String name){
        this.name = name;
    }
}

public class Encapsulation{

    public static void main(String[] args){

        programmer p = new programmer();
        p.setName("Mayuri");
        System.out.println("name : "+p.getName()); 
    }
}