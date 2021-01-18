import java.util.*;
public class TestSort11 {
    public static void main(String args[])
    {
        ArrayList<String> al=new ArrayList<String>();
        al.add("Viru");
        al.add("Saurav");
        al.add("Mukesh");
        al.add("Tahir");
        Collections.sort(al);
        Iterator itr=al.iterator();
        while(itr.hasNext()){
        System.out.println(itr.next());
        }
        Collections.sort(al,Collections.reverseOrder());
          Iterator i=al.iterator();
        while(i.hasNext())
            {
                System.out.println(i.next());
            }   
            Collections.sort(al,Collections.reverseOrder());
            Iterator i2=al.iterator();
            while(i2.hasNext())
                {
                System.out.println(i2.next());
                }
            



    }
    
}
