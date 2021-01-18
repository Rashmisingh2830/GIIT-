import java.util.*;
class Book3 {
int id;
String name,author,publisher;
int quantity;
public Book3(int id, String name, String author, String publisher, int quantity) {
this.id = id;
this.name = name;
this.author = author;
this.publisher = publisher;
this.quantity = quantity;
}
}
public class EnumMapExample {
// Creating enum
public enum Key{
One, Two, Three
};
public static void main(String[] args) {
EnumMap<Key, Book3> map = new EnumMap<Key, Book3>(Key.class);

Book3 b1=new Book3(101,"Let us C","Yashwant Kanetkar","BPB",8);
Book3 b2=new Book3(102,"Data Communications & Networking","Forouzan","Mc Graw Hill",4);
Book3 b3=new Book3(103,"Operating System","Galvin","Wiley",6);

map.put(Key.One, b1);
map.put(Key.Two, b2);
map.put(Key.Three, b3);
// Traversing EnumMap
for(Map.Entry<Key, Book3> entry:map.entrySet()){
Book3 b=entry.getValue();
System.out.println(b.id+" "+b.name+" "+b.author+" "+b.publisher+" "+b.quantity);
}
}
}