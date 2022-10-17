/*
a. Desc -> Given N distinct Coupon Numbers, how many random numbers do you
need to generate a distinct coupon number? This program simulates this random
process.
b. I/P -> N Distinct Coupon Number
c. Logic -> repeatedly choose a random number and check whether it's a new one.
d. O/P -> total random number needed to have all distinct numbers.
e. Functions => Write Class Static Functions to generate random numbers and to
process distinct coupons.
*/

package logicalproblems;

import java.util.Random;
import java.util.Scanner;

public class CouponNumbers {
    public static void main(String[] args) {
        System.out.println("how many random numbers do you\r\n" + "need to generate a distinct coupon number?");
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        scanner.close();
        int randomNum = 0;
        int arr[] = new int[size];
        Random coupon = new Random();
        boolean flag;

        for (int i = 0; i < size; i++)
        {
            randomNum = coupon.nextInt(20);
            flag = isPresent(arr, randomNum);
            if (flag != true)
            {
                arr[i] = randomNum;
            }
            else
            {
                --i;
            }
        }

        System.out.println("The random numbers generated are ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(" " + arr[i]);
        }

    }

    public static boolean isPresent(int[] arr, int randomNum) {
        for (int i = 0; i < arr.length; i++)
        {
            if (arr[i] == randomNum)
            {
                return true;
            }
        }
        return false;
    }
}
