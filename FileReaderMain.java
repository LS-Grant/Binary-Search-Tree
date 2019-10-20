
/**
 * @author Luc Saunders-Grant 914103
 *
 */
public class FileReaderMain 
{
	/**
	 * @param args for Program arguments, none are used in this method.
	 */
	public static void main(String[] args)
	{
		//tests the file reader on file "profiletest.txt" also prints the values in alphabetical order
		BST fileTest = FileReader.readProfiles("profiletest.txt");
		fileTest.printAlphabetical();
	}
}
