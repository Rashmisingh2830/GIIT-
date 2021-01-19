public class SingletonDemo 
{
    public static void main (String[] args)
   { //   Abc obj = Abc.getInstance();
    //     Abc obj1 = Abc.getInstance();



        Thread t1= new Thread(new Runnable(){
            public void run()
            {
                Abc obj=Abc.getInstance();
            }
        });

        Thread t2= new Thread(new Runnable(){
            public void run()
            {
                Abc obj=Abc.getInstance();
            }
        });
        // they both are creating instances as they both are called at the same time 
        //this is a problem as we are able to instantiate 2 objs.
       t1.start();
       // we can also handle it by calling the start method after sometime 
       // try{Thread.sleep(10);} catch (Exception e){}
       // by using this we can only allow object to get instantiated only once
       t2.start();
    }
    
}
class Abc{
    //public static Abc obj= new Abc(); // this is early or eager instantiation 
    public static Abc obj;
     int i; 
     private Abc()
     {
        System.out.println("instance Created");
     }
     public static  Abc getInstance() // Double  checked  Locking
    //  public static synchronized Abc getInstance()  // by making this methos synchronized we are making sure that no 2 threads 
     {                                           // enter at the same time, only one thread at one time is allowed!! 
         if(obj== null)              // after synchronizing only one time object is created 
         {
            synchronized(Abc.class)
            {
                if(obj==null)
               obj = new Abc();
            }
         }
         return obj;
     }
    
}
