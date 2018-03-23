import java.util.Scanner;

public class PalindromeInteger {
    public static int reverse(int number){
        int n, reverse = 0, rem;
        while(number > 0)
        {
            rem = number % 10;
            reverse = reverse*10 + rem;
            number /= 10;
        }
        return reverse;
    }
    public static boolean isPalindrome(int number,int revert){
        return revert==number;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number integer");
        int number = sc.nextInt();
        System.out.println("Enter result");
        int result = sc.nextInt();
        if (isPalindrome(reverse(number),result)) System.out.println("YES");
        else System.out.println("NO");
    }
}
