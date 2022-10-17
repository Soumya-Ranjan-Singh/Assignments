/*Fibonacci series is a special type of series in which the next term is the sum of the
previous two terms. For example, if 0 and 1 are the two previous terms in a series, then
the next term will be 1(0+1).
*/

package logicalproblems;

import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args) {
        System.out.println("Enter the nth no of Fibonacci Series required : \n");
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        scan.close();
        printFibonacci(n);
    }

    public static void printFibonacci(int n) {
        int a = 0, b = 1, c = 0;
        System.out.println("Fibonacci series is printed below.");
        for (int i = 0; i < n; i++)
        {
            a = b + c;
            System.out.print(a+" ");
            c = b;
            b = a;
        }
    }
}
