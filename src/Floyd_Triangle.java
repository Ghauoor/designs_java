import java.util.Scanner;

public class Floyd_Triangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the Number of Rows: ");

        int rows = sc.nextInt();
        System.out.print("Where do you want to start counting: ");

        int num = sc.nextInt();

        for (int i = 1; i<=rows; i++){
            for (int j= 1; j<=i; j++){
                System.out.print(num+" ");
                num++;
            }
            System.out.println();
        }
    }
}
