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
     throw new IndexOutOfBoundsException("Index needs to be between 0 and " + toString(size() - 1) + ", inclusive!");
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

 public void add(int index, String value) {
   Node nodeToAdd = new Node(value);
   //If outside range
   if (index < 0 || index > size()) {
     throw new IndexOutOfBoundsException("Index needs to be between 0 and " + toString(size()) + ", inclusive!");
   }
   //If at end
   else if (index == size()) {
     if (size() == 0) {
       start = nodeToAdd;
     }
     else {
       nodeToAdd.setPrev(end);
       end.setNext(nodeToAdd);
     }
     end = newNode;
   }
   //If at start
   else if (index == 0) {
     start.setPrev(nodeToAdd);
     nodeToAdd.setNext(start);
     start = nodeToAdd;
   }
   //If at middle of linked list
   else {
     Node prev = getNodeFromIndex(index - 1);
     Node next = prev.getNext();
     nodeToAdd.setPrev(prev);
     nodeToAdd.setNext(next);
     prev.setNext(nodeToAdd);
     next.setPrev(nodeToAdd);
   }
   size++;
 }

 public String get(int index) {
   if (index < 0 || index >= size()) {
     throw new IndexOutOfBoundsException("Index needs to be between 0 and " + toString(size() - 1) + ", inclusive!");
   }
   Node valueHere = getNodeFromIndex(index);
   return valueHere.getData();
 }
 /*
 public String set(int index, String value);
 public String toString();
 */
 //Any helper method that returns a Node object MUST BE PRIVATE!
}
