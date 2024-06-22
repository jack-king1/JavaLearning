package e13_numberinword;

public class NumberInWord {
    public static void printNumberInWord(int number){

        String[] numberAsStringArray = {"ZERO", "ONE", "TWO", "THREE", "FOUR", "FIVE", "SIX", "SEVEN", "EIGHT", "NINE"};


        for(int i = 0; i < 10; i++){
            if(i == number){
                System.out.print(numberAsStringArray[i]);
                return;
            }
        }
        System.out.print("OTHER");
    }
}
