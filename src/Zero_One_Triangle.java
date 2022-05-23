import java.util.Scanner;

public class Zero_One_Triangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number Rows: ");
        int rows = sc.nextInt();

        for (int i = 1; i<=rows; i++){
            for (int j= 1; j<=i;j++){
                int sum = i+j;
                if (sum%2==0){
                    System.out.print("1 ");
                } else
                    System.out.print("0 ");
            }
            System.out.println();

        }
        System.out.println();
    }
}
