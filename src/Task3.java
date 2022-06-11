import java.util.Scanner;

public class   Task3 {
    //първи начин
    public static void printTriangle(int n) {
        int numberSpaces=n-1;
        int numberStars=1;
        for (int i=0; i<n; i++){
            for (int j=0; j<numberSpaces; j++){
                System.out.print(" ");
            }
            for (int k=0; k<numberStars; k++){
                System.out.print("*");
            }
            System.out.println();
            numberSpaces--;
            numberStars+=2;
        }
        //втори начин , с математическо уравнение.
        /*int i; int j;
        for (int y=0; y<n; y++) {
            for (i=y; i<n-1;i++){ //y=1 n=3 i=1 i<1
                System.out.print(" ");
            }
            for (j=0; j<y*2+1; j++){
                System.out.print("*");
            }
            System.out.println();
        }*/
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number to print a triangle: ");
        int number= sc.nextInt();
        printTriangle(number);
    }
}
