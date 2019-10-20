
/**
 * @author Luc Saunders-Grant 914103
 *
 */
public class AlphaMain 
{
	/**
	 * @param args for Program arguments, none are used in this method.
	 */
	public static void main(String[] args) 
	{
		//Creates a new Binary Search Tree to test out alphabetical order (inOrder in this case)
		BST alpha = new BST();
		alpha.insertProfile(new Profile("Anna Star", 14, 12, 1977, "Macclesfield", "England", "English",
				new String[] { "Computing", "Gaming", "Coding" }));
		alpha.insertProfile(new Profile("Victor Von-Doom", 12, 12, 1967, "Macclesfield", "England", "English",
				new String[] { "Dancing", "Gaming", "Drinking" }));
		alpha.insertProfile(new Profile("Barry Scott", 11, 11, 1911, "Devon", "England", "English",
				new String[] { "Farming", "Drinking"}));
		alpha.insertProfile(new Profile("Aaron Davies", 8, 9, 1967, "Liverpool", "England", "English",
				new String[] { "Building", "Gambling", "Drinking" }));
		//Calls the alphabetical method to print out in alphabetical order
		alpha.printAlphabetical();
	}
}
