package main.java.com.ynz.nonlinear.tree.present;

import java.util.LinkedList;
import java.util.Queue;

/**
 *   10
 *   /\
 *  7  15
 * /\  /\
 *3 5 13 17
 */
public class PresentTreeDemo {

    public static void main(String[] args) {
        System.out.println("present tree demo");

        Node node3 = new Node(3);
        Node node5 = new Node(5);
        Node node13 = new Node(13);
        Node node17 = new Node(17);

        Node node7 = new Node(7, node3, node5);
        Node node15 = new Node(15, node13, node17);
        Node root = new Node(10, node7, node15);

        //print tree in order
        Queue<Node> queue = new LinkedList<>();

        System.out.println(root);

        queue.add(root.getLeft());
        queue.add(root.getRight());

        while (!queue.isEmpty()) {
            Node node = queue.poll();
            System.out.println(node);

            if (node.getLeft() != null) queue.add(node.getLeft());
            if (node.getRight() != null) queue.add(node.getRight());
        }
    }
}
