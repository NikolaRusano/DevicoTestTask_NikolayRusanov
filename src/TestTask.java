import java.util.Scanner;

public class TestTask {

    /*Solve the following task using any convenient programming language
    Let’s imagine that you receive the results of the weather for today in the following format: ‘+26C’.
    Weather results can change. Please write part of the code which will return the following:
    a) If the weather is from -50C to -1C return “It’s super cold today. Be sure you dress well!”
    b) If the weather is from -0C to +10C return “It’s windy outside, but we are sure you will enjoy your day!”
    c) If the weather is from +11C to +30C return “It’s time for outdoor walking!”
    d) If the weather is from +31 to 40 return “It's so hot outside!”
    e) If the weather is from +41 to 50 return “Welcome to hell!”
    f) If the weather results do not match the above values return “Please re-check results in 5 mins.*/


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input;

        boolean isContainChar = true;
        do {

            System.out.println("Please input number data - temperature outside");
            input = scanner.nextLine();
            isContainChar = input.matches("[a-z]+");
            if(isContainChar == false){
                break;
            }
            System.out.println("Inncorrect input please input number withot char symbols");

        } while (isContainChar);
        StringBuilder resultMsg = getResultMsgAccordingTemperature(input);
        System.out.println(resultMsg);

    }

    public static StringBuilder getResultMsgAccordingTemperature(String input){
        StringBuilder resultMsg = null;
        int inputInt = Integer.valueOf(input);

        if(inputInt >=-50 && inputInt <=-1){
            resultMsg = new StringBuilder("It’s super cold today. Be sure you dress well!");
            return resultMsg;
        }else if (inputInt >= 0 && inputInt <= 10){
            resultMsg =  new StringBuilder("It’s windy outside, but we are sure you will enjoy your day!");
            return resultMsg;
        }else if (inputInt >= 11 && inputInt <= 30) {
            resultMsg=  new StringBuilder("It’s time for outdoor walking!");
            return resultMsg;
        }else if (inputInt >= 31 && inputInt <= 40) {
            resultMsg=  new StringBuilder("It's so hot outside!");
            return resultMsg;
        }else if (inputInt >= 41 && inputInt <= 50) {
            resultMsg=  new StringBuilder("Welcome to hell!");
            return resultMsg;
        }else{
            resultMsg = new StringBuilder("Please re-check results in 5 mins");
            return resultMsg;
        }
    }

    public static boolean isNumber(String str) {
        if (str == null || str.isEmpty()) return false;
        for (int i = 0; i < str.length(); i++) {
            if (!Character.isDigit(str.charAt(i))) return false;
        }
        return true;
    }


}
