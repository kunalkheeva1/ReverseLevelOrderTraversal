import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Queue;

//TreeNode
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
//method to reverse the levels from left to right
    static ArrayList<Integer> reverseLevelOrderTraversal(Node node){
        ArrayList<Integer> ans = new ArrayList<>();
        if(node == null) return ans;
        Queue<Node> q = new LinkedList<>();
        q.add(node);
        //until the queue gets emptied
        while(!q.isEmpty()){
            //remove the node form queue and add its data in list
            Node current = q.remove();
            ans.add(current.data);
            //then go to its right side first, as by this way, at the end we will have a list to be reversed
            // to get the desired answer
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
