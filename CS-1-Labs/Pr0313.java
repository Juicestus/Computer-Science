public class Pr0313 {
    public static String oddZero(double n) {
        if (n % 2 == 1)
            return "" + ("" + n).charAt(2) + ("" + n).charAt(1) + ("" + n).charAt(0);
        else
            return ("" + n).charAt(1) + "0" + ("" + n).charAt(0) + "0" + ("" + n).charAt(2);
    }

    public static void main(String[] args) {
        System.out.println(oddZero(
            MyLibrary.getDouble("Give me a 3 digit number: ")
        ));
    }
}
