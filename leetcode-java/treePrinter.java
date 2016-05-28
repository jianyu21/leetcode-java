import java.util.*;

public class treePrinter{
    class treeNode{
        public int id;
        public String name;
        public List<treeNode> reporters;
        public int left;
        public int width; // including all children width

        public treeNode(int id, String name, List<treeNode> reps){
            this.id = id;
            this.name = name;
            this.reporters = new ArrayList<treeNode>(reps);
        }
    }
    public static void main(String[] args){
        System.out.println("main");
    }

    public void buildTree(treeNode[] nodes){
        //
    }

    public void printTree(treeNode node){
        if(node == null)
            return;

        for(int i=0;i<node.left;i++)
            System.out.print("--");
        System.out.println(node.name);
        for(int i =0;i<node.reporters.size();i++)
            printTree(node.reporters.get(i));
    }
}

