/*
a. Just like the Armstrong number, the Perfect Number is also a special type of
positive number. When the number is equal to the sum of its positive divisors
excluding the number, it is called a Perfect Number. For example, 28 is the perfect
number because when we sum the divisors of 28, it will result in the same number.
The divisors of 28 are 1, 2, 4, 7, and 14. So,
b. 28 = 1+2+4+7
c. 28 = 28
 */

package logicalproblems;

import java.util.Scanner;

public class PerfectNumber {
    public static void main(String[] args) {
        System.out.println("Enter the number. \n");
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        scan.close();
        perfectNo(n);
    }

    public static void perfectNo(int n) {
        int a = 0;
        for (int i = 1; i <= n/2; i++)
        {
            if (n % i == 0)
            {
                System.out.println(i);
                a += i;
            }
        }
        if ( n == a)
            System.out.println(n+" is a Perfect No.");
        else
            System.out.println(n+" is not a Perfect No.");
    }
}
