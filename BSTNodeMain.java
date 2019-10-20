
/**
 * @author Luc Saunders-Grant 914103
 *
 */
public class BSTNodeMain 
{
	/**
	 * @param args for Program arguments, none are used in this method.
	 */
	public static void main(String[] args)
	{
		//Setters and constructor test for BSTNode.java
		BSTNode testNode = new BSTNode(new Profile("Anna Star", 14, 12, 1977, "Macclesfield", "England", "English",
				new String[] { "Computing", "Gaming", "Coding" }));
		BSTNode testNode2 = new BSTNode(new Profile("Victor Von-Doom", 12, 12, 1967, "Macclesfield", "England", "English",
				new String[] { "Dancing", "Gaming", "Drinking" }));
		BSTNode testNode3 = new BSTNode(new Profile("Dan Jones", 1, 1, 1988, "Manchester", "England", "English",
				new String[] { "Dancing", "Gaming", "Drinking" }));
		
		//Getters test for  BSTNode.java
		System.out.println(testNode.getProfile());
		testNode.setLeft(testNode2);
		testNode.setRight(testNode3);
		System.out.println(testNode.getLeft().getProfile());
		System.out.println(testNode.getRight().getProfile());
		
		
	}
}
