public class Palindromic_Pattern {
    public static void main(String[] args) {
        int row = 5;

        for (int i = 1; i <= row; i++){
            //spaces
            for (int j = 1; j <=row - i; j++){
                System.out.print(" ");
            }
            //first half loop
            for (int j = i ; j>=1; j--){
                System.out.print(j+ " ");
            }
            //second Half
            for (int j = 2; j<=i;j++){
                System.out.print(j+ " ");
            }
            System.out.println();
        }
    }
}
