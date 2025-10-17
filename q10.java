import java.util.Scanner;

public class q10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        // Create and print multiplication table
        int[][] table = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                table[i][j] = (i + 1) * (j + 1);
                System.out.print(table[i][j] + " ");
            }
            System.out.println();
        }
        
        // Calculate diagonals
        int mainSum = 0;
        int secondarySum = 0;
        
        for (int i = 0; i < n; i++) {
            mainSum += table[i][i]; // Main diagonal
            secondarySum += table[i][n - 1 - i]; // Secondary diagonal
        }
        
        System.out.println("mainDiagonalSum=" + mainSum);
        System.out.println("secondaryDiagonalSum=" + secondarySum);
        
        sc.close();
    }
}