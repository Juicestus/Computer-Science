
import java.util.ArrayList;

public class GenerateOrderingFunction {
    public static void main(String[] args) {
        System.out.println(
            generatePermutationCode(
                new String[] {"a", "b", "c", "d"}
            )
        );
    }

    private static String generatePermutationCode(String[] str) {
        PermutationEngine<String> permutations = new PermutationEngine<String>();
        permutations.generate(str);

        String generated = "/**\n * This method was generated automatically to * order "
                + str.length + "\n * doubles and return them as a string with a single space delimiter."
                + "\n *\n * @author Justus\n */\npublic static String order(";
        for (int i = 0; i < str.length; i++) {
            generated += "double " + str[i];
            if (i != str.length - 1) generated += ", ";
        }
        generated += ") {\n    ";

        for (ArrayList<String> arr : permutations.getPermutations()) {
            generated +=  "if (";
            for (int i = 0; i < arr.size() - 1; i++) {
                generated += arr.get(i) + " <= " + arr.get(i + 1);
                if (i < arr.size() - 2) generated += " && ";
            }

            generated += ")\n        // ";
            for (int i = 0; i < arr.size(); i++) {
                generated += arr.get(i);
                if (i != str.length - 1) generated += " ≤ ";
            }

            generated += "\n        return ";
            for (int i = 0; i < arr.size(); i++) {
                generated += arr.get(i);
                if (i != str.length - 1) generated += " + \" \" + ";
            }
            generated += ";\n    else ";
        } 

        return generated + "\n        return \"\";\n}";
    }
}