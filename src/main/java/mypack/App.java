package mypack;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	System.out.println(App.isEven(100));	
		System.out.println(App.isEven(89));	
    }
    public static boolean isEven(int a)
	{
		return a%2==0?true : false;			
	}
}
