public class BinaryTree {
    static Node root;
    static class Node{
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

    public static void main(String[] args) {
        BinaryTree b1=new BinaryTree();
        Node newNode1=new Node(10);
        Node newNode2=new Node(20);
        Node newNode3=new Node(30);
        Node newNode4=new Node(40);
        Node newNode5=new Node(50);
        Node newNode6=new Node(60);
        Node newNode7=new Node(70);
        root=newNode1;
        root.left=newNode2;
        root.right=newNode3;
        root.left.left=newNode4;
        root.left.right=newNode5;
        root.right.left=newNode6;
        root.right.right=newNode7;

        
        b1.inOrder(root);
        System.out.println("Inorder");
        b1.preOrder(root);
        System.out.println("Preorder");
        b1.postOrder(root);
        System.out.println("Postoder");
    }
}
