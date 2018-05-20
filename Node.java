
public class Node {
	private int value;
	private Node nextNode;
	
	public Node(int value, Node nextNode)
	{
		this.value = value;
		this.nextNode = nextNode;
	}
	
	public int getValue()
	{
		return this.value;
	}
	
	public Node getNextNode()
	{
		return this.nextNode;
	}
	
	public void setNextNode(Node nextNode)
	{
		this.nextNode = nextNode;
	}
}
