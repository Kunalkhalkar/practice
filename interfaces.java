interface bicycle{
    
    int b= 40;
    void speedup(int increment);
    void applybrake(int decrement);

}

interface carryload{
    void iron();
    void cotton();
}

class atlas implements bicycle, carryload{   //you can implement class with multiple interfaces by separating 

    public void iron(){
        System.out.println("load is may be high");
    }
    public void cotton(){
        System.out.println("load is less");
    }
    public void speedup(int increment){
        System.out.println("your applying the speed up");
    }
    public void applybrake(int decrement){
        System.out.println("you are  now applying brake");
    }
}

public class interfaces {
    public static void main(String[] args) {
        atlas b1= new atlas();
       // bicycle b1=new  atlas();
        b1.speedup(10);
        b1.applybrake(50);
        b1.iron();
        b1.cotton();
        
        System.out.println(b1.b);
    }
}
