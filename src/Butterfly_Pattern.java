import java.util.Scanner;

public class Butterfly_Pattern {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number of Rows: ");
        int rows = sc.nextInt();
        // first half
         for (int i = 1; i<=rows; i++){
             for (int j = 1; j<=i;j++){
                 System.out.print("*");
             }
             int space = 2 * (rows - i);
             for (int j = 1; j<=space; j++){
                 System.out.print(" ");
             }
             for (int j = 1; j<=i;j++){
                 System.out.print("*");
             }
             System.out.println();
         }
         //second half
        for (int i = rows;i>=1; i--){
            for (int j = 1; j<=i; j++){
                System.out.print("*");
            }
            int space = 2 * (rows - i);
            for (int j = 1; j<=space; j++){
                System.out.print(" ");
            }
            for (int j =1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();

        }

    }
}
