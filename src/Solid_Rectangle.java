import java.util.Scanner;

class Solid_Rectangle{
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int res;
            do {
                System.out.print("Enter the Number of Column: ");

                int rows = sc.nextInt();
                System.out.print("Enter the Number of Rows: ");

                int column = sc.nextInt();

                for (int i = 1; i <= rows; ++i) {
                    for (int j = 1; j <= column; ++j) {
                        System.out.print("* ");
                    }
                    System.out.println();
                }
                System.out.println("Enter 1 for next input and 0 to exit the code");
                res = sc.nextInt();

            } while (res ==1);

        }

    }
