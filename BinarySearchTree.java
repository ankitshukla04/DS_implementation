public class BinarySearchTree {
    static Node root;
    class Node{
        int data;
        Node left;
        Node right;
        public Node(int data){
            this.data=data;
            left=right=null;
        }
    }

    public void inOrder(Node node){
        if(node==null)
            return;
        inOrder(node.left);
        System.out.print(node.data+" ");
        inOrder(node.right);
    }

    public void preOrder(Node node){
        if(node==null)
            return;
        System.out.print(node.data+" ");
        preOrder(node.left);
        preOrder(node.right);        
    }

    public void postOrder(Node node){
        if(node==null)
            return;
        postOrder(node.left);
        postOrder(node.right);
        System.out.print(node.data+" ");        
    }

    public Node insertNode(Node root, int key){
        if(root==null){
            root=new Node(key);
            return root;
        }
        if(key<=root.data)
            root.left=insertNode(root.left, key);
        else
            root.right=insertNode(root.right,key);

        return root;
    }

    public void inOrder(){
        inOrder(root);
    }

    public void preOrder(){
        preOrder(root);
    }

    public void postOrder(){
        postOrder();
    }

    public Node insertNode(int key){
       insertNode(root, key); 
       return root;
    }

    public BinarySearchTree(int key){
        root=insertNode(root, key);
    }

    public static void main(String[] args) {
        
        BinarySearchTree b1=new BinarySearchTree(10);
        
        b1.insertNode(20);
        b1.insertNode(30);

        b1.preOrder();
    }
}
