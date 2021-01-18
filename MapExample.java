import java.util.*;
class Book4 {
int id;
String name,author,publisher;
int quantity;
public Book4(int id, String name, String author, String publisher, int quantity) {
this.id = id;
this.name = name;
this.author = author;
this.publisher = publisher;
this.quantity = quantity;
}
}
public class MapExample {
public static void main(String[] args) {

Map<Integer,Book4> map=new LinkedHashMap<Integer,Book4>();

Book4 b1=new Book4(101,"Let us C","Yashwant Kanetkar","BPB",8);
Book4 b2=new Book4(102,"Data Communications & Networking","Forouzan","Mc Graw Hill",4);
Book4 b3=new Book4(103,"Operating System","Galvin","Wiley",6);
//Adding Books to map
map.put(2,b2);
map.put(1,b1);
map.put(3,b3);
//Traversing map
for(Map.Entry<Integer, Book4> entry:map.entrySet()){
int key=entry.getKey();
Book4 b=entry.getValue();
System.out.println(key+" Details:");
System.out.println(b.id+" "+b.name+" "+b.author+" "+b.publisher+" "+b.quantity);
}
}
}