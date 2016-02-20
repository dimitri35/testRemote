package commons;

public class MyStringUtils {
	
	public static void main(String [] args)
	{
		System.out.println(isNullOrEmpty("abcde"));
		System.out.println(isNullOrEmpty(""));
		System.out.println(isNullOrEmpty(null));
	}

	public static boolean isNullOrEmpty (String stringToTest){
		
		return stringToTest == null || stringToTest.equals("") ;
	}
}
