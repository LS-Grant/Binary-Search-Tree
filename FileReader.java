
import java.io.*;
import java.util.Scanner;

/**
 * @author Luc Saunders-Grant 914103
 *
 */
public class FileReader 
{

	/**
	 * @param in represents an input value (from file I/O)
	 * @return returns the binary search tree from a txt file
	 */
	private static BST readDataFile(Scanner in)
	{
		BST tree = new BST();
		while (in.hasNextLine())
		{
			String lin = in.nextLine();
			if (lin.replace(" ", "").length() != 0) {
				Scanner s = new Scanner(lin);
				tree.insertProfile(createProfile(s));
			}
		}
		return tree;
	}
	
	/**
	 * @param filename the filename of the txt document holding the BST data
	 * @return calls upon the method to return the binary search tree
	 */
	public static BST readProfiles (String filename) 
	{
		File readProfiles = new File (filename);
		Scanner in = null; 
		try
		{
			in = new Scanner(readProfiles);
		}
		catch (FileNotFoundException e)
		{
			System.out.println("Could not find the file: " + filename);
			System.exit(1);
		}
		return FileReader.readDataFile(in);
	}
	
	/**
	 * @param in represents an input value (from file I/O)
	 * @return the new profile is created and returned
	 */
	private static Profile createProfile(Scanner in)
	{
		in.useDelimiter(",");
		String name = in.next();
		int dayOfBirth = in.nextInt();
		int monthOfBirth = in.nextInt();
		int yearOfBirth = in.nextInt();
		String town = in.next();
		String country = in.next();
		String nationality = in.next();
		String interestGroup = in.next();
		String[]interests = interestGroup.split(";");
		Profile newProf = new Profile(name, dayOfBirth, monthOfBirth, yearOfBirth, town, country, nationality, interests);
		return newProf;
	}
	
	
}