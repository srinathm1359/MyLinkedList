public class Node {
  private String data;
  private Node next,prev;

  public Node(String value) {
    data = value;
    prev = null;
    next = null;
  }
 //write get/set methods for all three instance variables.

 //get methods
  public String getData() {
    return data;
  }
  public Node getPrev() {
    return prev;
  }
  public Node getNext() {
    return next;
  }
}
