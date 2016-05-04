/**
 * Created by gravitational on 14/04/16.
 */
public class Linklist {
    Node left ;
    Node right;
    Node root;

    public void insert(int data){
        root = insert(root, data);
    }

    private Node insert(Node node, int data){
        if(node == null){
            node = new Node(data);
        }
        else
        {
            if( data <= node.number)
            {
                node.left = insert(node.left, data);
            }
            else
            {
                node.right = insert(node.right, data);
            }
        }
        return node;
    }

    public void print() {
        print(root);
        System.out.println();   // end the line of output
    }

    private void print(Node root) {
        // (base case is implicitly to do nothing on null)
        if (root == null) {
           return;
        }
        print(root.left);
        print(root.right);
        System.out.println(root.number);
    }

    public void evenBranches() {
        int count = 0;
//        evenBranches(root, count);
        System.out.println("There are " + evenBranches(root, count) + " even number(s)." );
    }

    private int evenBranches(Node root, int counter) {

        if (root == null) {
            return counter;
        }
        counter = evenBranches(root.left, counter);
//        System.out.println("counter: " + counter);
        counter =  evenBranches(root.right, counter);
//        System.out.println("counter: " + counter);

        if (root.number % 2 == 0 && (root.left != null || root.right != null))
        {
            System.out.println(root.number);
            counter++;
        }
        return counter;
    }
}


