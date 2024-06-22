package e16_isnumberpalindrome;

public class NumberPalindrome {
    public static boolean isNumberPalindrome(int number) {
        int normalizedNumber = Math.abs(number);
        String numberToString = Integer.toString(normalizedNumber);
        if(numberToString.length() < 3) return false;

        char[] charArray = numberToString.toCharArray();

        for(int i =0; i < numberToString.length(); i++){
            if(charArray[i] != charArray[(charArray.length - 1) - 1]){
                return false;
            }
        }
        return true;
    }
}
