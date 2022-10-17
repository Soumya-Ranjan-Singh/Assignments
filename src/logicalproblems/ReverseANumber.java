/*
In Java, we can reverse a number either by using for loop, while loop, or using recursion.
The simplest way to reverse a number is by using for loop or while loop. In order to
reverse a number, we have to follow the following steps:
a. We need to calculate the remainder of the number using the modulo
b. After that, we need to multiply the variable reverse by 10 and add the remainder into
it.
c. We then divide the number by 10 and repeat steps until the number becomes 0.
*/

package logicalproblems;

import java.util.Scanner;

public class ReverseANumber {
    public static void main(String[] args) {
        System.out.println("Enter the number you want to reverse.");
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        scan.close();
        reverseNo(n);
    }

    public static void reverseNo(int n) {
        int rev = 0, rem = 0;
        while (n > 0)
        {
            rem = n % 10;
            rev = (rev * 10)+rem;
            n = n / 10;
        }
        System.out.println("Reverse of the above no is : "+rev);
    }
}
