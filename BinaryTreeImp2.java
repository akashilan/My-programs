
class Node{
    int d;
    Node left;
    Node right;
    
    Node(int d){
        this.d = d;
        this.left = null;
        this.right = null;
    }
    
    Node insert(Node c, int val){
        if(c == null){
            return new Node(val);
        }
        
        if(val < c.d){
            c.left = insert(c.left, val);
        }else if(val > c.d){
            c.right = insert(c.right, val);
        }else{
            re
        }
    }
}
public class Main
{
	public static void main(String[] args) {
		System.out.println("Hello World");
	}
}
