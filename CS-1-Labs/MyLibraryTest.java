public class MyLibraryTest {
	public static void main(String[] args) {
		int low = MyLibrary.getInt("Lower random bound:");
		int high = MyLibrary.getInt("Upper random bound:");
		System.out.println(MyLibrary.getRandNum(low, high));
	}
}
