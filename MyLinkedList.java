public class MyLinkedList{
 private int size;
 private Node start,end;

 public MyLinkedList() {
   size = 0;
   start = null;
   end = null;
 }

 public int size() {
   return size;
 }

 public boolean add(String value) {
   Node nodeToAdd = new Node(value);
   if (size() == 0) {
     start = nodeToAdd;
   }
   else {
     nodeToAdd.setPrev(end);
     end.setNext(nodeToAdd);
   }
   size++;
   end = newNode;
   return true;
 }
 /*
 public void add(int index, String value);
 public String get(int index);
 public String set(int index, String value);
 public String toString();
 */
 //Any helper method that returns a Node object MUST BE PRIVATE!
}
