import java.util.Arrays;

/**
 * @author Luc Saunders-Grant 914103
 *
 */
public class ProfileMain 
{
	/**
	 * @param args for Program arguments, none are used in this method.
	 */
	public static void main(String[] args)
	{
		// the test profiles used to test the setters and constructor of Profile.java
		Profile testProfile = new Profile("Anna Star", 14, 12, 1977, "Macclesfield", "England", "English",
				new String[] { "Computing", "Gaming", "Coding" });
		Profile testProfile2 = new Profile("Victor Von-Doom", 12, 12, 1967, "Macclesfield", "England", "English",
				new String[] { "Dancing", "Gaming", "Drinking" });
		Profile testProfile3 = new Profile("Dan Jones", 1, 1, 1988, "Manchester", "England", "English",
				new String[] { "Dancing", "Gaming", "Drinking" });
		
		
		// the test profiles used to test the getters and toString of Profile.java
		testProfile.addFriend(testProfile2);
		testProfile2.addFriend(testProfile);
		
		System.out.println("The friend of Anna is: " + testProfile.getFriend(0));
		System.out.println("Victor has " + testProfile.numOfFriends() + " Friend(s).");
		System.out.println("Name : " + testProfile2.getName());
		System.out.println("Victor is " + testProfile3.getNationality());
		System.out.println("Victor lives in " + testProfile.getCountry());
		System.out.println("Victor lives in the town of " + testProfile3.getTown());
		System.out.println("Victor is interested in " + (Arrays.toString(testProfile2.getInterests())));
		
		System.out.println(testProfile.toString());
		
		
		
	}
}
