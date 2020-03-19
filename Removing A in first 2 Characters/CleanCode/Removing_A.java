public class Removing_A
{
	public static char getCharFromString(String str, int index)
	{
		return str.charAt(index);
	}
    	private static String deleteCharAt(String strValue, int index)
    	{
		return strValue.substring(0, index) + strValue.substring(index + 1);
    	}
	public static String removing_A(String sb)//function to remove the character A in givem STRING
	{
		Character rc = 'A';
		int k = 0;
		for(int i = 0 ; i < 2 ; i++)
		{
			Character ch = getCharFromString(sb,k);//getting character in string with given index
			if(ch.equals(rc))
			{
			    sb=deleteCharAt(sb,k);//Deleting the character if it is A
			}
			else
			{
			    k = k + 1;
			}
		}
		return sb;//Printing the String-After removing the character A if it appears in first two characters in a string
	}
}
