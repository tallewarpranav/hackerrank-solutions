package hackerRank.Days30Code;
import java.util.Scanner;

class TNode{
    TNode left,right;
    int data;
    TNode(int data){
        this.data=data;
        left=right=null;
    }
}
public class BinarySearchTrees{

	public static int getHeight(TNode root){
      return root == null ? -1 : 1 + Math.max(getHeight(root.left), getHeight(root.right));
    }

    public static TNode insert(TNode root,int data){
        if(root==null){
            return new TNode(data);
        }
        else{
            TNode cur;
            if(data<=root.data){
                cur=insert(root.left,data);
                root.left=cur;
            }
            else{
                cur=insert(root.right,data);
                root.right=cur;
            }
            return root;
        }
    }
	 public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int T=sc.nextInt();
         TNode root=null;
        while(T-->0){
            int data=sc.nextInt();
            root=insert(root,data);
        }
        int height=getHeight(root);
        System.out.println(height);
    }
}