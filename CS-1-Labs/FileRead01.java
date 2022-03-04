import java.io.*;
import java.util.*;

public class FileRead01 {
    public static void main(String[] args) throws IOException {
		
		Scanner fileReader = new Scanner(new File("first.dat"));

		while (fileReader.hasNextLine())
			System.out.println(fileReader.nextLine());

    }
}
