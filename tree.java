import java.util.LinkedList;
import java.util.Queue;

public class tree {
    public static void main(String[] args) {
      // #region
      Node root = new Node(1);
      Node n2 = new Node(2);
      Node n3 = new Node(3);
      Node n4 = new Node(4);
      Node n5 = new Node(5);
      Node n6 = new Node(6);
      Node n7 = new Node(7);
      Node n8 = new Node(8);
      Node n9 = new Node(9);
      Node n11 = new Node(11);
      Node n20 = new Node(20);
      // #endregion
  
      root.nds.add(n2);
      root.nds.add(n3);
  
      n2.nds.add(n4);

      n3.nds.add(n5);
      n3.nds.add(n6);

      n4.nds.add(n7);
      n4.nds.add(n8);
      n4.nds.add(n9);

      n6.nds.add(n11);
      n6.nds.add(n20);
  
      order(root, "");
    }
  
    static void order(Node root, String space) {
        if (root == null)
          return;
        System.out.println(space + root.value);
        while(root.nds.peek() != null)
            order(root.nds.poll(), space + "  ");
    }
  
}
  
class Node {
  int value;

  public Node(int value) {
    this.value = value;
  }
  Queue<Node> nds = new LinkedList<>();
}



