import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Queue;

class Node {
    int data;
    Node left;
    Node right;
    Node(int data, Node left, Node right){
        this.data = data;
        this.left = left;
        this.right = right;
    }
}


public class ReverseLevelOrderTraversal {

    static ArrayList<Integer> reverseLevelOrderTraversal(Node node){
        ArrayList<Integer> ans = new ArrayList<>();
        if(node == null) return ans;
        Queue<Node> q = new LinkedList<>();
        q.add(node);
        while(!q.isEmpty()){
            Node current = q.remove();
            ans.add(current.data);
            if(current.right != null){
                q.add(current.right);
            }
            if(current.left != null){
                q.add(current.left);
            }
        }
        Collections.reverse(ans);
        return ans;
    }


    public static void main(String[] args) {

    }
}
