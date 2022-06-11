import java.util.Scanner;

public class Task1 {
    public static void printDividedNumbers(int n) {
        for (int i=0; i<n; i++) {
            if (i % 5 == 0) {
                System.out.println(i);
            }
        }
        if (n<0) {
            System.out.println("Number must be positive");
        }
        }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number= sc.nextInt();
        printDividedNumbers(number);
    }
}
