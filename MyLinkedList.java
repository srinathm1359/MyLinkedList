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

 //Getting node from index
 private Node getNodeFromIndex(int index) {
   if (index < 0 || index >= size()) {
     throw new IndexOutOfBoundsException("Index needs to be between 0 and " + toString(size()) + ", inclusive!");
   }
   Node current = start;
   for (int i = 0; i < index; i++) {
     current = current.getNext();
   }
   return current;
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
