public class Task2 {
    public static boolean checkHappy (int number){
        int lastDigit=number%10;
        number=number/10;
        int thirdDigit=number%10;
        number=number/10;
        int secondDigit=number%10;
        number=number/10;
        int firstDigit=number;
        return (firstDigit+secondDigit==thirdDigit+lastDigit);
    }
    public static void printAllHappyNumbers(){
        for (int i=1000; i<10000; i++){
            if (checkHappy(i)){
                System.out.println("Happy number= "+ i);
            }
        }
    }
    public static void main(String[] args) {
        printAllHappyNumbers();
    }
}
