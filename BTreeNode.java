
public class BTreeNode {
	int data;
	BTreeNode left, right;
 
    public BTreeNode(int item)
    {
        data = item;
        left = right = null;
    }
}
