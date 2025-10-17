import java.util.*;

public class q7 {
    
    static boolean isPrime(int n) {
        if (n <= 1) return false;
        if (n == 2) return true;
        if (n % 2 == 0) return false;
        for (int i = 3; i * i <= n; i += 2) {
            if (n % i == 0) return false;
        }
        return true;
    }

    static List<Integer> primesUpTo(int n) {
        List<Integer> primes = new ArrayList<>();
        if (n < 2) return primes;
        boolean[] isPrime = new boolean[n + 1];
        Arrays.fill(isPrime, true);
        isPrime[0] = isPrime[1] = false;

        for (int p = 2; p * p <= n; p++) {
            if (isPrime[p]) {
                for (int multiple = p * p; multiple <= n; multiple += p) {
                    isPrime[multiple] = false;
                }
            }
        }

        for (int i = 2; i <= n; i++) {
            if (isPrime[i]) primes.add(i);
        }
        return primes;
    }

    static int gcd(int a, int b) {
        a = Math.abs(a);
        b = Math.abs(b);
        while (b != 0) {
            int t = a % b;
            a = b;
            b = t;
        }
        return a;
    }

    static int lcm(int a, int b) {
        if (a == 0 || b == 0) return 0;
        return Math.abs(a / gcd(a, b) * b);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int a = sc.nextInt();
        int b = sc.nextInt();

        System.out.println("prime(" + n + ")=" + isPrime(n));

        System.out.print("primes<=" + n + ": ");
        for (int p : primesUpTo(n)) {
            System.out.print(p + " ");
        }
        System.out.println();

        int g = gcd(a, b);
        int l = lcm(a, b);
        System.out.println("gcd(" + a + "," + b + ")=" + g);
        System.out.println("lcm(" + a + "," + b + ")=" + l);

        sc.close();
    }
}