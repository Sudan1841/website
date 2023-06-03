public class Emp {
    void walk(){
        System.out.println("Can Run");
    }
}
class  Employee extends Emp{
    void walk(){
        System.out.println("Can run fast");
}

    public static  void  main(String[] args){
      Emp p = new Employee();
      //upcasting
        p.walk();

    }
}
