public class SubstringCheck23 {

    public static boolean isSubstringPresent(String str, String sub) {
        return str.contains(sub);
    }

    public static void main(String[] args) {
        String mainString = "Hello, World!";
        String subString = "World";

        if (isSubstringPresent(mainString, subString)) {
            System.out.println("Substring '" + subString + "' is present in the main string.");
        } else {
            System.out.println("Substring '" + subString + "' is not present in the main string.");
        }
    }
}