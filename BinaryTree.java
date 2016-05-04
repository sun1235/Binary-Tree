/**
 * Created by gravitational on 14/04/16.
 */
public class BinaryTree {
    public static void main(String [] args) {

        Linklist number = new Linklist();
        number.insert(2);
        number.insert(1);
        number.insert(7);
        number.insert(6);
        number.insert(8);
        number.insert(0);
        number.insert(4);
        number.insert(9);
        number.insert(6);
        number.insert(8);
        number.insert(10);
        number.insert(3);

        number.print();
        System.out.println();

        number.evenBranches();
    }
}
