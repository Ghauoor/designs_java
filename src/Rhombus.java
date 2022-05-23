import java.util.Scanner;

public class Rhombus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number of Rows: ");
        int rows = sc.nextInt();

        for (int i = 1; i <= rows; i++){
            //Spaces
            for (int j = 1; j <= rows - i; j++){
                System.out.print(" ");
            }
            for (int j = 1 ; j <= rows; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
