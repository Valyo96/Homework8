
import java.util.Scanner;

public class   Task4 {
    public static void printStarsAfterNumber (int number){
        int numberOfDigits;
        /*int numberTwo=number;
        while (numberTwo!=0){
            numberTwo=numberTwo/10;
            numberOfDigits++;
        }*/
        if(number<100||number>30000){
            System.out.println("Invalid number");
            return;
        }
        else if (number >=100&&number<=999){
            numberOfDigits=3;
        } else if (number>=1000&&number<=9999) {
            numberOfDigits=4;
        }
        else {
            numberOfDigits=5;
        }
        int currentDigit;
        for (int i=0; i<numberOfDigits; i++){
            currentDigit=number%10;
            System.out.print(currentDigit+": ");
            for (int j=0; j<currentDigit; j++){
                System.out.print("*");
            }
            number=number/10;
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number from 100-30000: ");
        int userNumber= sc.nextInt();
        printStarsAfterNumber(userNumber);
    }
}
