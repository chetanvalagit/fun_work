//The diameter of a tree (sometimes called the width) is the number of nodes on the longest path between two end nodes.


public class DiameterOfBinaryTry {

	public int FindDiameter(BTreeNode root, Height nodeHeight)
	{
		if(root == null)
		{
			nodeHeight.h = 0;
			return 0;
		}
		
		Height leftrRootHeight = new Height();
		Height rightRootHeight = new Height();
		
		int lDiameter = FindDiameter(root.left, leftrRootHeight);
		int rDiameter = FindDiameter(root.right, rightRootHeight);
		
		nodeHeight.h = Math.max(leftrRootHeight.h, rightRootHeight.h) + 1;
		
		return Math.max(leftrRootHeight.h + rightRootHeight.h + 1, Math.max(lDiameter, rDiameter));
	}
	
	public static void main(String[] args) {
		DiameterOfBinaryTry obj = new DiameterOfBinaryTry();
		
		BTreeNode root = new BTreeNode(1);
        root.left = new BTreeNode(2);
        root.right = new BTreeNode(3);
        root.left.left = new BTreeNode(4);
        root.left.right = new BTreeNode(5);
        
        Height rootHeight = new Height();
        
        System.out.println(obj.FindDiameter(root, rootHeight));
        
        
	}

}

class Height
{
    int h;
}
