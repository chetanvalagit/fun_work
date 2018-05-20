
public class MergeTwoSortedLikedList {

	public Node MergeLinkedList(Node firstListHead, Node secondListHead)
	{
		Node head = new Node(0, null);
		Node p = head;
		while(firstListHead != null && secondListHead != null)
		{
			if(firstListHead.getValue() > secondListHead.getValue())
			{
				head.setNextNode(secondListHead);
				secondListHead=secondListHead.getNextNode();
			}
			else
			{
				head.setNextNode(firstListHead);
				firstListHead=firstListHead.getNextNode();
			}
			head = head.getNextNode();
		}
		
		if(firstListHead != null)
		{
			head.setNextNode(firstListHead);
		}
		
		if(secondListHead != null)
		{
			head.setNextNode(secondListHead);
		}
		
		return p.getNextNode();
	}
	
	
	public static void main(String[] args) {
		MergeTwoSortedLikedList obj = new MergeTwoSortedLikedList();
		
		Node seven = new Node(13,null);
		Node six = new Node(11, seven);
		Node five = new Node(9,six);
		Node four = new Node(7, five);
		Node three = new Node(5, four);
		Node two = new Node(3,three);
		Node one = new Node(1, two);
		
		Node forteen = new Node(14,null);
		Node thirteen = new Node(12, forteen);
		Node twelve = new Node(10, thirteen);
		Node eleven = new Node(8, twelve);
		Node ten = new Node(6, eleven);
		Node nine = new Node(4, ten);
		Node eight = new Node(2, nine);
		
		Node megeNode = obj.MergeLinkedList(one, eight);
		
		while(megeNode != null)
		{
			System.out.print(megeNode.getValue() + " -> ");
			megeNode = megeNode.getNextNode();
		}
		System.out.print("null");

	}

}
