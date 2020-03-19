import java.util.Scanner;
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
	public static void main(String[] args)
	{
	    	Scanner sc = new Scanner(System.in);
	    	String sb = next();
		Character rc = 'A';
		int k = 0;
		for(int i = 0 ; i < 2 ; i++)
		{
			Character ch = getCharFromString(sb,k);
			if(ch.equals(rc))
			{
			    sb=deleteCharAt(sb,k);
			}
			else
			{
			    k = k + 1;
			}
		}
		System.out.println(sb);
	}
}