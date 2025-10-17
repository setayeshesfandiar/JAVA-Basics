import java.util.Scanner;

public class q6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // خواندن n
        int n = sc.nextInt();

        // خواندن آرایه n عضوی
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        // مرتب‌سازی به روش selection sort (صعودی)
        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;                   // فرض می‌کنیم کمترین عنصری که از i به بعده، در minIndex قرار داره
            for (int j = i + 1; j < n; j++) {
                if (a[j] < a[minIndex]) {
                    minIndex = j;              // اگر عنصر کوچک‌تری پیدا شد، minIndex رو بروزرسانی کن
                }
            }
            // جا‌به‌جایی (swap) عنصر در i و کمترین عنصر در minIndex
            int temp = a[i];
            a[i] = a[minIndex];
            a[minIndex] = temp;
        }

        // چاپ آرایه مرتب‌شده (فضای جداکننده)
        for (int i = 0; i < n; i++) {
            if (i > 0) System.out.print(" ");
            System.out.print(a[i]);
        }
        System.out.println();

        // خواندن هدف t و جستجوی اولین اندیس آن (پس از مرتب‌سازی)
        int t = sc.nextInt();
        int firstIndex = -1;
        for (int i = 0; i < n; i++) {
            if (a[i] == t) {
                firstIndex = i;
                break;   // اولین وقوع را پیدا کردیم، پس خارج می‌شویم
            }
        }

        System.out.println(firstIndex);
    }
}