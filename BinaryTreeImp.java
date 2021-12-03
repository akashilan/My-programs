class BinaryTree{
    int data;
    BinaryTree left;
    BinaryTree right;
    boolean isRoot;
    
    BinaryTree(int data){
        this.data = data;
        left = null;
        right = null;
        isRoot = false;
    }
    BinaryTree(int data, String r){
        this.data = data;
        left = null;
        right = null;
        if(r.equals("root")){
            isRoot = true;
        }
    }
    BinaryTree(){
         data = 0;
         left = null;
         right = null;
         isRoot = false;
    }
    boolean isRootNull(BinaryTree node){
        return node == null? true: false;
    }
    void add(int data, BinaryTree root){
        if(isRootNull(root)){
            this.data = data;
            this.left = null;
            this.right = null;
            this.isRoot = true;
        }else{
            if(data  < root.data){
                if(root.left == null){
                    this.data = data;
                    this.left = null;
                    this.right = null;
                    this.isRoot = false;
                    root.left = this;
                    
                }else{
                    this.add(data, root.left);
                }
            }else if(data > root.data){
                
                if(root.right == null){
                    this.data = data;
                    this.left = null;
                    this.right = null;
                    this.isRoot = false;
                    root.right = this;
                    
                }else{
                    this.add(data, root.right);
                }
            
            }else{
                System.out.println("Data already present!");
                
            }
        }
    }
    void print(){
        if(isRootNull(this)){
            System.out.println("Root node is null! Nothing to print...");
        }else{
            if(this.left != null){
                this.left.print();
            }else{
                System.out.println(this.data + " ");
                return;
            }
            
            if(this.right != null){
                 this.right.print();
            }else{
                System.out.println(this.data + " ");
                return;
            }
        }
    }
}
public class BinaryTreeImp
{
	public static void main(String[] args) {
		
		BinaryTree[] nodes = new BinaryTree[10];
		for(int i = 0; i < 10; i++){
		    nodes[i] = new BinaryTree();
		}
		BinaryTree root = new BinaryTree(25);
		for(int i = 0; i < 10; i++){
		    nodes[i].add((i+1)*(i+1), root);
		}
		root.print();
	}
}
