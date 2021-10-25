import java.util.Scanner;

public class MyLibrary {
	/**
	 * This method will return an integer in the range [1,n]
	 *
	 * @param n The maximum value to generate
	 *
	 * @return The randomly generated number
	 */
    public static int getRandNum(int n) {
     	return (int) (Math.random() * n) + 1;
    }
    
    /**
	 * This method will return an integer in the range [lo,hi]
	 *
	 * @param lo The lower bound of numbers to generate
	 * @param hi The upper bound of numbers to generate
	 *
	 * @return The randomly generated number
	 */
    public static int getRandNum(int lo, int hi) {
     	return (int) (Math.random() * (hi - lo + 1 )) + lo;
    }
   
	/**
	 * Gets an integer from console providing the user with a prompt
	 *
	 * @param prompt The prompt to give the user
	 *
	 * @return The integer from the user
	 */
    public static int getInt(String prompt) {
		Scanner kb = new Scanner(System.in);
		System.out.print(prompt + "  ");
		return kb.nextInt();  
	}

    /**
	 * Gets a double from console providing the user with a prompt
	 *
	 * @param prompt The prompt to give the user
	 *
	 * @return The double from the user
	 */
    public static double getDouble(String prompt) {
     	Scanner kb = new Scanner(System.in);
     	System.out.print(prompt + "  ");
  		return kb.nextDouble();  
    }
 
    /**
	 * Gets a single word (string) from console providing the user with a prompt
	 *
	 * @param prompt The prompt to give the user
	 *
	 * @return The word from the user
	 */
    public static String getWord(String prompt) {
     	Scanner kb = new Scanner(System.in);
     	System.out.print(prompt + "  ");
  		return kb.next();  
    }
  
    /**
	 * Gets a sentance (string) from console providing the user with a prompt
	 *
	 * @param prompt The prompt to give the user
	 *
	 * @return The sentance from the user
	 */  
    public static String getLine(String prompt) {
     	Scanner kb = new Scanner(System.in);
     	System.out.print(prompt + "  ");
     	return kb.nextLine();
    }
   	
	/**
	 * Round number "num" to the ammount of decimal places "dec"
	 *
	 * @param num Number to round
	 * @param dec Decimal places to round to
	 *
	 * @return The rounded number
	 */
    public static double round(double num, int dec) {
     	return  (int) Math.round((num * Math.pow(10, dec))) / Math.pow(10, dec);
    }
}