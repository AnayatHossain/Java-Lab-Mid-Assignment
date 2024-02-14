public class CharacterCount22 {

    public static void countCharacters(String str) {
        int alphabetCount = 0;
        int digitCount = 0;
        int specialCharCount = 0;

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (Character.isLetter(ch)) {
                alphabetCount++;
            } else if (Character.isDigit(ch)) {
                digitCount++;
            } else {
                specialCharCount++;
            }
        }

        System.out.println("Total Alphabets: " + alphabetCount);
        System.out.println("Total Digits: " + digitCount);
        System.out.println("Total Special Characters: " + specialCharCount);
    }

    public static void main(String[] args) {
        String inputString = "Hello123!@#";
        countCharacters(inputString);
    }
}