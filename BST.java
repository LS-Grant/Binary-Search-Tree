
/**
 * @author Luc Saunders-Grant 914103
 *
 */
public class BST 
{
	private BSTNode root;
	
	public BST()
	{
		
	}
	
	/**
	 * @param p where p represents a user profile
	 */
	public void insertProfile (Profile p)
	{
		if (root == null)
		{
			BSTNode node = new BSTNode(p);
			root = node;
		}
		else
		{
			placeNode(root,p); 
		}
	}
	
	/**
	 * @param node used to represent a node
	 * @param nodeP the node assigned to a profile
	 */
	private void placeNode(BSTNode node, Profile nodeP)
	{
		String nodeName = node.getProfile().getName();
		String nodeProfile = nodeP.getName();
		
		if(nodeName.compareTo(nodeProfile)<=0)
		{
			if(node.getRight() == null)
			{
				BSTNode bst = new BSTNode(nodeP);
				node.setRight(bst);
			}
			else
			{
				placeNode(node.getRight(),nodeP);
				
			}
		}
		if(nodeName.compareTo(nodeProfile)>0)
		{
			if(node.getLeft() == null)
			{
				BSTNode bst = new BSTNode(nodeP);
				node.setLeft(bst);
			}
			else
			{
				placeNode(node.getLeft(),nodeP);
				
			}
		}
	}
	
	/**
	 * @param n where n represents a node
	 */
	//an inOrder produces a tree with the nodes in alphabetical order
	private void inOrder(BSTNode n)
	{
		if(n.getLeft() !=null)
			inOrder(n.getLeft());
		System.out.println(n.getProfile().getName());
		if(n.getRight() !=null)
			inOrder(n.getRight());
	}
	
	public void printAlphabetical()
	{
		inOrder(root);
	}
}
