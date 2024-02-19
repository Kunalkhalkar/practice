class tractor{

    String bass="high volume";
    public  String sound(){
       return bass;
    }

    public tractor() {
        System.out.println("without parameter constructor sound");
    }

    public tractor(int b){
        System.out.println("this is tractor with param constructor : "+b);
    }

}
 
class jcb{
       public jcb(int r){
                System.out.println("this sound is with parameter constructor : "+r);
       } 
}

class hevy_machine extends tractor{

 public hevy_machine(int r ,int c){
    super(r);
    System.out.println("hi i am the heavy machine : "+ c);
 }
 }


public class super2 {
    public static void main(String[] args) {
       // tractor obj =new tractor();
        hevy_machine obj1 =new hevy_machine(10, 5);

    }
}
