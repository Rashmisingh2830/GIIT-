

public class SingletonEnum {
    public static void main(String[] args)
    {
       Abc1 obj1=Abc1.INSTANCE;
       obj1.i=5;
       obj1.show();

       Abc1 obj2=Abc1.INSTANCE;
       obj2.i=6;


       obj1.show();// if we are creating instance of the 2 different class then o/p should be 5 here
                   // but as from the o/p we can see here that the output is 6 that means its singleton as only onre instance 
                   // is being created 
    }
    
}
enum Abc1{
    INSTANCE;// INVOKE PRIVATE CONSTRUCTOR BY ITSELF
    int i;

    public void show()
    {
        System.out.println(i);
    }




}