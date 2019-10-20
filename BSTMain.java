
/**
 * @author Luc Saunders-Grant 914103
 *
 */
public class BSTMain 
{
	/**
	 * @param args for Program arguments, none are used in this method.
	 */
	public static void main(String[] args)
	{
		//creation of profiles to test if the BST.java works
		Profile a = new Profile("Luc Saunders-Grant", 18, 02, 1997, "Merthyr", "Wales", "Welsh", new String[]{"Memes","Greeks","Banter"});
		Profile b = new Profile("John Mcfarlane", 28, 03, 1997, "Cardiff", "Wales", "Cyprian", new String[]{"Coding","Drinking"});
		Profile c = new Profile("Toby Gent", 02, 12, 1996, "Swansea", "Wales", "Greek", new String[]{"Drinking","Coding","Java"});
		
		//Inserts the profiles into the binary search tree
		BST newBST = new BST();
		newBST.insertProfile(a);
		newBST.insertProfile(b);
		newBST.insertProfile(c);
		
		//Prints the BST out in alphabetical order (as proof the tree exists)
		newBST.printAlphabetical();
		
	}
}
