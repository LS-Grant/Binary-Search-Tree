import java.util.ArrayList;
import java.util.Arrays;
/**
 * @author Luc Saunders-Grant 914103
 *
 */

public class Profile 
{
	private String name;
	
	private int dayOfBirth;
	
	private int monthOfBirth;
	
	private int yearOfBirth;
	
	private String town;
	
	private String country;
	
	private String nationality;
	
	private String[] interests;
	
	private ArrayList <Profile> friends = new ArrayList<>();
	
	/**
	 * @param name         The Name of the profile holder.
	 * @param dayOfBirth   The day the profile holder was born on.
	 * @param monthOfBirth The month profile holder was born on.
	 * @param yearOfBirth  The year the profile holder was born on.
	 * @param town         The town the profile holder lives in.
	 * @param country      The country the profile holder lives in.
	 * @param nationality  The nationality of the profile holder.
	 * @param interests    The interests the profile holder have.
	 */
	public Profile (String name, int dayOfBirth, int monthOfBirth, int yearOfBirth, String town, String country,
			String nationality,String[] interests) 
	{
		this.name = name;
		this.dayOfBirth = dayOfBirth;
		this.monthOfBirth = monthOfBirth;
		this.yearOfBirth = yearOfBirth;
		this.town = town;
		this.country = country;
		this.nationality = nationality;
		this.interests = interests;
	}
	
	/**
	 * @param town The town the profile holder went to.
	 */
	public void setTown(String town)
	{
		this.town = town;
	}
	
	/**
	 * @param country The country the profile holder lives in.
	 */
	public void setCountry(String country)
	{
		this.country = country;
	}
	
	/**
	 * @param nationality The nationality of the profile holder.
	 */
	public void setNationality(String nationality)
	{
		this.nationality = nationality;
	}
	
	/**
	 * @param interests The interests the profile holder have.
	 */
	public void setInterests(String[] interests)
	{
		this.interests = interests;
	}
	
	/**
	 * @return name
	 */
	public String getName()
	{
		return name;
	}
	
	/**
	 * @return town
	 */
	public String getTown()
	{
		return town;
	}
	
	/**
	 * @return country
	 */
	public String getCountry()
	{
		return country;
	}
	
	/**
	 * @return nationality
	 */
	public String getNationality()
	{
		return nationality;
	}
	
	/**
	 * @return interests
	 */
	public String[] getInterests()
	{
		return interests;
	}
	
	/**
	 * @return dob
	 */
	public String getDob()
	{
		String dob = dayOfBirth + "/" + monthOfBirth + "/" + yearOfBirth;
		return dob;
	}
	
	/**
	 * @param i where i is the position of the friend in the array (starting at 0)
	 * @return the friend value at position i
	 */
	public Profile getFriend(int i)
	{
		return friends.get(i);
	}
	
	/**
	 * @param p where p is annother profile
	 */
	public void addFriend (Profile p)
	{
		friends.add(p);
	}
	
	/**
	 * @return  the size of the friends array
	 */
	public int numOfFriends()
	{
		return friends.size();
	}

	
	@Override
	public String toString() 
	{
		return "The name of the profile holder is " + getName() + 
				", he/she lives in " + getTown() + ", which is in the country of " 
				+ getCountry() + ", the profile holder is "  + getNationality() 
				+ ", the user enjoys " + Arrays.toString(getInterests()) 
				+ ", the profile user was born on " + getDob() 
				+ ", this account currently has " + numOfFriends() + " friends.";
	}

}
	

