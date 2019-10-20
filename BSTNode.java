
/**
 * @author Luc Saunders-Grant 914103
 *
 */
public class BSTNode 
{
	private Profile data;
	private BSTNode left;
	private BSTNode right;
	
	/**
	 * @param data the data held by the node
	 */
	public BSTNode (Profile data)
	{
		this.data = data;
	}
	
	/**
	 * @return returns the data held by node
	 */
	public Profile getProfile()
	{
		return data;
	}
	
	/**
	 * @param l to represent what is to the left of the node
	 */
	public void setLeft(BSTNode l)
	{
		this.left = l;
	}
	
	/**
	 * @param r to represent what is to the right of the node
	 */
	public void setRight(BSTNode r)
	{
		this.right = r;
	}
	
	/**
	 * @return returns what is to the left of the node
	 */
	public BSTNode getLeft()
	{
		return left;
	}
	
	/**
	 * @return returns what is to the right of the node
	 */
	public BSTNode getRight()
	{
		return right;
	}
}
