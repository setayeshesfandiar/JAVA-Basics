import java.util.Scanner;

public class q8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int y = sc.nextInt();
        int m = sc.nextInt();
        int d = sc.nextInt();
        
        // Check leap year
        boolean isLeap = (y % 4 == 0 && y % 100 != 0) || (y % 400 == 0);
        System.out.println("leap=" + isLeap);
        
        // Days in month
        int daysInMonth;
        switch (m) {
            case 1: case 3: case 5: case 7: case 8: case 10: case 12:
                daysInMonth = 31;
                break;
            case 4: case 6: case 9: case 11:
                daysInMonth = 30;
                break;
            case 2:
                daysInMonth = isLeap ? 29 : 28;
                break;
            default:
                daysInMonth = 0;
        }
        System.out.println("daysInMonth=" + daysInMonth);
        
        // Day of year
        int dayOfYear = d;
        for (int month = 1; month < m; month++) {
            switch (month) {
                case 1: case 3: case 5: case 7: case 8: case 10: case 12:
                    dayOfYear += 31;
                    break;
                case 4: case 6: case 9: case 11:
                    dayOfYear += 30;
                    break;
                case 2:
                    dayOfYear += isLeap ? 29 : 28;
                    break;
            }
        }
        System.out.println("dayOfYear=" + dayOfYear);
        
        sc.close();
    }
}